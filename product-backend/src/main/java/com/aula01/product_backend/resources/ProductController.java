package com.aula01.product_backend.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.aula01.product_backend.models.Product;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {

    
    private List<Product> products = Arrays.asList( new Product(1, "Produto 1", 19.99),
                                                    new Product(2, "Produto 2", 29.99),
                                                    new Product(3, "Produto 3", 39.99));

    

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product prod = products.stream()
                                .filter(product -> product.getId() == id)
                                .findFirst()
                                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found"));

        return ResponseEntity.ok(prod);
        
    }
    
    @GetMapping("products")
    public List<Product> getProducts() {
        return products;
    }
    
 
}
