package com.springboot.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.ecom.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
}
