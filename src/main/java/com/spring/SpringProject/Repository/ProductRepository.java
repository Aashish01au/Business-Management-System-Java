package com.spring.SpringProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.SpringProject.Model.Products;

public interface ProductRepository extends JpaRepository<Products, Integer>{

}
