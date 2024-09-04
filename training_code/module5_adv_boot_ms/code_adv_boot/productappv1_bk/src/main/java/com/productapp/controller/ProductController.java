package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //get all products
    @GetMapping(path = "products")
    public List<Product> getAll(){
        return productService.findAll();
    }
    @PostMapping(path = "products")
    public Product addProduct(@RequestBody Product product){
        return  productService.addProduct(product);
    }
}
