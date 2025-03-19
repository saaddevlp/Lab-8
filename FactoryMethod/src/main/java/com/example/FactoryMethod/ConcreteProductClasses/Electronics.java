package com.example.FactoryMethod.ConcreteProductClasses;

import com.example.FactoryMethod.Interface.Product;

public class Electronics implements Product {
    @Override
    public void displayInfo() {
        System.out.println("This is an Electronics product.");
    }
}
