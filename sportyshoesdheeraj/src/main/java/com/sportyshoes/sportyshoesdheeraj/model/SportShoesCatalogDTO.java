package com.sportyshoes.sportyshoesdheeraj.model;

import org.springframework.stereotype.Service;

@Service
public class SportShoesCatalogDTO {
	public SportShoesCatalogDTO() {
		// TODO Auto-generated constructor stub
	}

	String name;
	String brand;
	String type;
	Double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
