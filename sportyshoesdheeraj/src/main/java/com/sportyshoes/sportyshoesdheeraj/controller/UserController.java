package com.sportyshoes.sportyshoesdheeraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.sportyshoesdheeraj.model.UserDTO;
import com.sportyshoes.sportyshoesdheeraj.model.UserListDTO;
import com.sportyshoes.sportyshoesdheeraj.service.UserRegistrationService;



@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRegistrationService urs;
	
	
	@PostMapping("/userRegistration")
	public String registerUser(@RequestBody UserDTO dto)
	{
        return urs.userRegistration(dto);
	}
	
	@PostMapping("/userLogin")
	public String loginUser(@RequestBody UserDTO dto)
	{
        return urs.userLogin(dto);
	}
	
	@GetMapping("/admin/listUsers")
	public List<UserListDTO> listUsers()
	{
        return urs.userList();
	}
	
}
