package com.example.Singleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SingletonRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Printer printer = Printer.getInstance();
        printer.printMessage("Hello, Singleton!"); // Output: Printing: Hello, Singleton!

        // Verify that only one instance exists
        Printer anotherPrinter = Printer.getInstance();
        System.out.println(printer == anotherPrinter); // Output: true
    }
}
