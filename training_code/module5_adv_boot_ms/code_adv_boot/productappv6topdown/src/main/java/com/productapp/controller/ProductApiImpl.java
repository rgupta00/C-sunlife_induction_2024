package com.productapp.controller;

import com.productapp.getcode.controller.ProductappApi;
import com.productapp.getcode.dto.ProductDto;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
@RestController
public class ProductApiImpl implements ProductappApi {
    private ProductService productService;

    @Autowired
    public ProductApiImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ResponseEntity<String> addProduct(ProductDto productDto) {
         productService.addProduct(productDto);
         return ResponseEntity.status(HttpStatus.OK).body("product is added");
    }

    @Override
    public ResponseEntity<Void> delete(Integer id) {
        return ProductappApi.super.delete(id);
    }

    @Override
    public ResponseEntity<List<ProductDto>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll()) ;
    }

    @Override
    public ResponseEntity<ProductDto> getById(Integer id) {
        return ProductappApi.super.getById(id);
    }

    @Override
    public ResponseEntity<List<ProductDto>> getByName(String name) {
        return ProductappApi.super.getByName(name);
    }

    @Override
    public ResponseEntity<ProductDto> updateProduct(Integer id, ProductDto productDto) {
        return ProductappApi.super.updateProduct(id, productDto);
    }
}
