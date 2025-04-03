package com.stefan.employee_applcation.service;

import com.stefan.employee_applcation.entities.CategoryType;
import com.stefan.employee_applcation.entities.Product;
import com.stefan.employee_applcation.repository.ProductRepository;
import com.stefan.employee_applcation.requests.RegisterProductRequest;
import com.stefan.employee_applcation.responses.RegisterProductResponse;
import com.stefan.employee_applcation.utility.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public RegisterProductResponse createProduct(RegisterProductRequest registerProductRequest) {
        Product savedProduct = Product.builder()
                .productId(null)
                .productName(registerProductRequest.getProductName())
                .productDescription(registerProductRequest.getProductDescription())
                .productPrice(registerProductRequest.getProductPrice())
                .productCategory(registerProductRequest.getProductCategory())
                .productQuantity(registerProductRequest.getProductQuantity())
                .build();
        productRepository.save(savedProduct);
        RegisterProductResponse response = ProductMapper.productToRegistrationProductResponse(savedProduct);
        return response;
    }



}
