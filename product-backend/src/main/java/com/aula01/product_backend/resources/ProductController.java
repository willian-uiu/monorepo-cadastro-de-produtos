package com.aula01.product_backend.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.aula01.product_backend.models.Product;

import java.util.Arrays;
import java.util.List;


@RestController
public class ProductController {   
    private List<Product> products = Arrays.asList( new Product(1, "Produto 1", "Descrição 1", 1, true, false, 19.99),
                                                    new Product(2, "Produto 2", "Descrição 2", 2, false, true, 29.99),
                                                    new Product(3, "Produto 3", "Descrição 03", 3, false, false, 39.99));

    

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
