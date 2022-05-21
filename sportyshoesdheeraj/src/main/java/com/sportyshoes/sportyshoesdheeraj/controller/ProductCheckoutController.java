package com.sportyshoes.sportyshoesdheeraj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.sportyshoesdheeraj.model.PurchaseOrderDTO;
import com.sportyshoes.sportyshoesdheeraj.service.ProductCheckoutService;



@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/api")
public class ProductCheckoutController {

	@Autowired
	private ProductCheckoutService pcs;
	
	
	@PostMapping("/addToCart")
	public PurchaseOrderDTO addShoes(@RequestBody PurchaseOrderDTO dto)
	{
        return pcs.addToCart(dto);
	}
	
	
}
