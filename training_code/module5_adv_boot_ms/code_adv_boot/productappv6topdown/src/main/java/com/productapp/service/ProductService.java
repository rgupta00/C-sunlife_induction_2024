package com.productapp.service;

import com.productapp.entities.Product;
import com.productapp.getcode.dto.ProductDto;

import java.util.List;

public interface ProductService {
    public List<ProductDto> findAll();
    public ProductDto getById(int id);
    public List<ProductDto> getByName(String name);
    public ProductDto addProduct(ProductDto productDto);
    public ProductDto updateProduct(int id, ProductDto productDto);
    public ProductDto deleteProduct(int id);
}
