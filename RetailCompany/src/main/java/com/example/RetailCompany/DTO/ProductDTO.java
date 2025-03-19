package com.example.RetailCompany.DTO;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String category;
    private Double price;
    private String color;
}
