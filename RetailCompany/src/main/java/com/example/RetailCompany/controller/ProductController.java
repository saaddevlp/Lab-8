package com.example.RetailCompany.controller;


import com.example.RetailCompany.DTO.ProductDTO;
import com.example.RetailCompany.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/{id}/clone")
    public ProductDTO cloneProduct(@PathVariable Long id, @RequestParam String newColor) {
        return productService.cloneProduct(id, newColor);
    }
}
