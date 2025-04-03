package com.stefan.employee_applcation.utility;

import com.stefan.employee_applcation.entities.CategoryType;
import com.stefan.employee_applcation.entities.Product;
import com.stefan.employee_applcation.requests.RegisterProductRequest;
import com.stefan.employee_applcation.responses.RegisterProductResponse;

public class ProductMapper {

    public static RegisterProductResponse productToRegistrationProductResponse(Product product) {
        RegisterProductResponse response = RegisterProductResponse.builder()
                .productName(product.getProductName())
                .productDescription(product.getProductDescription())
                .productPrice(product.getProductPrice())
                .productQuantity(product.getProductQuantity())
                .productCategory(CategoryType.valueOf(String.valueOf(product.getProductCategory())))
                .build();
        return response;
    }




}
