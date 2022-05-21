package com.sportyshoes.sportyshoesdheeraj.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.sportyshoesdheeraj.model.User;
import com.sportyshoes.sportyshoesdheeraj.model.UserDTO;
import com.sportyshoes.sportyshoesdheeraj.model.UserListDTO;
import com.sportyshoes.sportyshoesdheeraj.repository.UserRepository;

@Service
public class UserRegistrationService {

	@Autowired
	private UserRepository repo;
	
	public String userRegistration(UserDTO userDto){
		User user = new User();
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setJoiningDate(userDto.getJoiningDate());
		user.setMobile(userDto.getMobile());
		user.setName(userDto.getName());
		
		repo.save(user);
		
		return "Success";
	}
	
	public String userLogin(UserDTO userDto){
		User user = new User();
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		
		Optional<User> userDb = repo.findById(user.getEmail());
		
		if(userDb != null && userDb.get().getPassword().equals(user.getPassword())) {
			return "Login Success";
		} else {
			return "User not found!";
		}
	}
	
	public List<UserListDTO> userList(){
		List<Object> list = repo.findAllUsers();
		List<UserListDTO> dto = new ArrayList<UserListDTO>();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object[] object = (Object[]) iterator.next();
			UserListDTO ud = new UserListDTO();
			
			ud.setName((String) object[0]);
			ud.setJoiningDate((Date) object[1]);
			dto.add(ud);
		} 
		
		return dto;
		
	}
	
}
