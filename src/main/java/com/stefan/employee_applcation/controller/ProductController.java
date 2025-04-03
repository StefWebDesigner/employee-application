package com.stefan.employee_applcation.controller;

import com.stefan.employee_applcation.exceptions.ProductException;
import com.stefan.employee_applcation.requests.RegisterProductRequest;
import com.stefan.employee_applcation.responses.RegisterProductResponse;
import com.stefan.employee_applcation.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<RegisterProductResponse> createProduct(@RequestBody RegisterProductRequest  registerProductRequest) {
        RegisterProductResponse result = productService.createProduct(registerProductRequest);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        } else {
            throw new ProductException("Product failed to be created. Check all fields please");
        }
    }



}
