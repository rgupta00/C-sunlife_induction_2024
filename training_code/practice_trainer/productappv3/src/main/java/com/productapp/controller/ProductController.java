package com.productapp.controller;

import com.HttpClientExplore.controller.ProductsApi;
import com.HttpClientExplore.model.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class ProductController implements ProductsApi {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

//    @Override
//    public Optional<NativeWebRequest> getRequest() {
//        return ProductsApi.super.getRequest();
//    }

    @Override
    public ResponseEntity<Product> addProduct(Product product) {
        return productService.addProduct(product);
    }

    @Override
    public ResponseEntity<Void> delete(Integer id) {
        return ProductsApi.super.delete(id);
    }

    @Override
    public ResponseEntity<List<Product>> getAll() {
        return ProductsApi.super.getAll();
    }

    @Override
    public ResponseEntity<Product> getById(Integer id) {
        return ProductsApi.super.getById(id);
    }

    @Override
    public ResponseEntity<Product> updateProduct(Integer id, Product product) {
        return ProductsApi.super.updateProduct(id, product);
    }
}

