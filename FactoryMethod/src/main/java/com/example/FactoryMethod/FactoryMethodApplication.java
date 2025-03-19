package com.example.FactoryMethod;

import com.example.FactoryMethod.Interface.Product;
import com.example.FactoryMethod.ProductFactory.ProductFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryMethodApplication.class, args);
		Product electronics = ProductFactory.createProduct("electronics");
		electronics.displayInfo(); // Output: This is an Electronics product.

		Product clothing = ProductFactory.createProduct("clothing");
		clothing.displayInfo(); // Output: This is a Clothing product.

		Product books = ProductFactory.createProduct("books");
		books.displayInfo(); // Output: This is a Books product.
	}

}
