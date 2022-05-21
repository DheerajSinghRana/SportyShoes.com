package com.sportyshoes.sportyshoesdheeraj.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sportyshoes.sportyshoesdheeraj.model.SportShoesCatalog;


@Repository
@CrossOrigin("http://localhost:8080")
public interface SportShoesCatalogRepository extends JpaRepository<SportShoesCatalog, Integer>{

	@Query("SELECT s FROM SportShoesCatalog s")
	List<SportShoesCatalog> findAllCatalog();
}
