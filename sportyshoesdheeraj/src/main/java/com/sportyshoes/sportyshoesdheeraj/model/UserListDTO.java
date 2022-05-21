package com.sportyshoes.sportyshoesdheeraj.model;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class UserListDTO {
	

	String name;
	Date joiningDate;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}


	public UserListDTO() {
		// TODO Auto-generated constructor stub
	}
}
