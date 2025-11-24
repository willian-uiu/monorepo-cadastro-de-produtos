package com.aula01.product_backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula01.product_backend.models.Product;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    
    @GetMapping("product")
    public Product getProduct(){

        Product product = new Product();
        product.setId(1);
        product.setName("Produto 1");
        product.setPrice(19.99);


        return product;
    }


    @GetMapping("products")
    public List<Product> getProducts() {

        Product product = new Product();
        product.setId(1);
        product.setName("Produto 1");
        product.setPrice(19.99);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Produto 2");
        product2.setPrice(19.99);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Produto 3");
        product3.setPrice(19.99);

        List<Product> listProd = new ArrayList<>();
        
        listProd.add(product);
        listProd.add(product2);
        listProd.add(product3);

        return listProd;
    }
    
}
