package com.sportyshoes.sportyshoesdheeraj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.sportyshoesdheeraj.model.PurchaseOrderDTO;
import com.sportyshoes.sportyshoesdheeraj.model.SportShoesCatalog;
import com.sportyshoes.sportyshoesdheeraj.model.User;
import com.sportyshoes.sportyshoesdheeraj.repository.SportShoesCatalogRepository;
import com.sportyshoes.sportyshoesdheeraj.repository.UserRepository;

@Service
public class ProductCheckoutService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SportShoesCatalogRepository sportShoesCatalogRepository;
	
	
	public PurchaseOrderDTO addToCart(PurchaseOrderDTO purchaseOrderDTO) {
		
		User user = userRepository.getById(purchaseOrderDTO.getEmail());
		SportShoesCatalog sportShoesCatalog = sportShoesCatalogRepository.getById(purchaseOrderDTO.getProductId());
		
		Double totalAmount = sportShoesCatalog.getPrice() * Double.parseDouble( purchaseOrderDTO.getNoOfItems());
		
		purchaseOrderDTO.setTotalAmount(totalAmount);
		purchaseOrderDTO.setName(user.getName());
		
		
		return purchaseOrderDTO;
		
	}
}
