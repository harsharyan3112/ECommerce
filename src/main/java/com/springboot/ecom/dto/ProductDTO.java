package com.springboot.ecom.dto;

import lombok.Data;
  
//DTO data transfer object

@Data
public class ProductDTO {

	private Long id;
	private String name;
	private int categoryId;
	private double price;
	private double weight;
	private String description;
	private String imageName;
	
}
