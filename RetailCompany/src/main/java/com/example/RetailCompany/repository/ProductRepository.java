package com.example.RetailCompany.repository;


import com.example.RetailCompany.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
