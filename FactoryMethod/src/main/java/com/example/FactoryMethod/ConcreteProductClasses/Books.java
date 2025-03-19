package com.example.FactoryMethod.ConcreteProductClasses;

import com.example.FactoryMethod.Interface.Product;

public class Books implements Product {
    @Override
    public void displayInfo() {
        System.out.println("This is a Books product.");
    }
}
