package com.springboot.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.model.Product;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testAddProduct() {
        // Create and save a test product
        Product product = new Product();
        productService.saveProduct(product);
        
        // Print success message
        System.out.println("Test completed: Product saved successfully");
    }
}
