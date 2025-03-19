package com.example.Singleton;

import org.springframework.stereotype.Component;

@Component
public class Printer {
    // Private static instance of the class
    private static Printer instance;

    // Private constructor to prevent instantiation
    private Printer() {}

    // Public method to provide access to the instance
    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    // Method to print a message
    public void printMessage(String message) {
        System.out.println("Printing: " + message);
    }
}
