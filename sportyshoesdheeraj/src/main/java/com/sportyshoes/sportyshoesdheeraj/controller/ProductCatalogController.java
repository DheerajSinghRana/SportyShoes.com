package com.sportyshoes.sportyshoesdheeraj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sportyshoes.sportyshoesdheeraj.model.SportShoesCatalog;
import com.sportyshoes.sportyshoesdheeraj.model.SportShoesCatalogDTO;
import com.sportyshoes.sportyshoesdheeraj.service.ProductCatalogService;



@CrossOrigin("http://localhost:8080")
@RestController
@RequestMapping("/api")
public class ProductCatalogController {

	@Autowired
	private ProductCatalogService pcs;
	
	@GetMapping("/listShoes")
	public List<SportShoesCatalog> listShoes()
	{
		return pcs.listShoesCatalog();
	}
	
	@PostMapping("/admin/addShoes")
	public String addShoes(@RequestBody SportShoesCatalogDTO dto)
	{
        return pcs.addShoes(dto);
	}
}
