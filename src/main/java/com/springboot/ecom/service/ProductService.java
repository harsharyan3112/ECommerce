package com.springboot.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.ecom.dto.ProductDTO;
import com.springboot.ecom.model.Product;
import com.springboot.ecom.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	public void deleteProductById(long id) {
		productRepository.deleteById(id); 
	}
	public Optional<Product> getProductById(long id)
	{
		return productRepository.findById(id);
	}
	public List<Product> gettAllPoductByCategory(int id){
		return productRepository.findAllByCategory_Id(id);
	}
	
}
