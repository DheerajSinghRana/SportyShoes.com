package com.sportyshoes.sportyshoesdheeraj.model;

import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderDTO {
	Integer productId;
	String email;
	Double totalAmount;
	String noOfItems;
	String name;
	
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(String noOfItems) {
		this.noOfItems = noOfItems;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PurchaseOrderDTO() {
		// TODO Auto-generated constructor stub
	}
	
}
