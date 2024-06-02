package com.example.demo.controller;

import com.example.demo.dto.ProductDto;
import com.example.demo.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public ResponseEntity<Object> getProducts(){
        ProductDto products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}
