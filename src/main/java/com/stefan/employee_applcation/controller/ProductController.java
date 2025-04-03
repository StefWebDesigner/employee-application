package com.stefan.employee_applcation.controller;

import com.stefan.employee_applcation.entities.Product;
import com.stefan.employee_applcation.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    public ResponseEntity<Product> createProduct(){
        return null;
    }



}
