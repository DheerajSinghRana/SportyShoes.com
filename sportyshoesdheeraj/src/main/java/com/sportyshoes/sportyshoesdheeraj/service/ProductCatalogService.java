package com.sportyshoes.sportyshoesdheeraj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.sportyshoesdheeraj.model.SportShoesCatalog;
import com.sportyshoes.sportyshoesdheeraj.model.SportShoesCatalogDTO;
import com.sportyshoes.sportyshoesdheeraj.repository.SportShoesCatalogRepository;

@Service
public class ProductCatalogService {

	@Autowired
	private SportShoesCatalogRepository repo;
	
	
	public List<SportShoesCatalog> listShoesCatalog(){
		return repo.findAllCatalog();
	}
	
	public String addShoes(SportShoesCatalogDTO dto){
		SportShoesCatalog ssc = new SportShoesCatalog();
		ssc.setBrand(dto.getBrand());
		ssc.setName(dto.getName());
		ssc.setPrice(dto.getPrice());
		ssc.setType(dto.getType());
		
		repo.save(ssc);
		
		return "Success";
	}
	
}
