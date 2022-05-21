package com.sportyshoes.sportyshoesdheeraj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sportyshoes.sportyshoesdheeraj.model.User;


@Repository
@CrossOrigin("http://localhost:8080")
public interface UserRepository extends JpaRepository<User, String>{

	@Query("SELECT s.name, s.joiningDate FROM User s")
	List<Object> findAllUsers();
}
