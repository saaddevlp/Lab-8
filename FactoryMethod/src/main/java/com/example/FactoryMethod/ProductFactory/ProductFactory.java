package com.example.FactoryMethod.ProductFactory;

import com.example.FactoryMethod.ConcreteProductClasses.Books;
import com.example.FactoryMethod.ConcreteProductClasses.Clothing;
import com.example.FactoryMethod.ConcreteProductClasses.Electronics;
import com.example.FactoryMethod.Interface.Product;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Electronics();
            case "clothing":
                return new Clothing();
            case "books":
                return new Books();
            default:
                throw new IllegalArgumentException("Invalid product type.");
        }
    }
}
