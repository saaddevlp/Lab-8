package com.example.RetailCompany.service;


import com.example.RetailCompany.DTO.ProductDTO;
import com.example.RetailCompany.entities.Product;
import com.example.RetailCompany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductDTO cloneProduct(Long id, String newColor) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        Product clonedProduct = existingProduct.clone();
        clonedProduct.setId(null); // Reset ID for new entity
        clonedProduct.setColor(newColor);

        Product savedProduct = productRepository.save(clonedProduct);

        return convertToDTO(savedProduct);
    }

    private ProductDTO convertToDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setCategory(product.getCategory());
        dto.setPrice(product.getPrice());
        dto.setColor(product.getColor());
        return dto;
    }
}
