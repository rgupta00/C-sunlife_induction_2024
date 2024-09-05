package com.productapp.controller;

import com.productapp.dto.ProductDto;
import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private  ProductService productService;

    @Value("${productapp.messages.add_successfully}")
    private String addSuccessfully;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //RepsoneEntity vs @ResponseStatus
    //get all products

    @GetMapping(path = "products")
    public ResponseEntity<List<ProductDto>> getAll() {
        //BL+Ex handling (CCC): AOP
        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
    }
    //add product
    @PostMapping(path = "products")
    @ResponseStatus(HttpStatus.CREATED)
    public String addProduct(@Valid @RequestBody ProductDto productDto){
         productService.addProduct(productDto);
         return addSuccessfully;
    }
    //update
    @ResponseStatus(HttpStatus.OK)
    @PutMapping(path = "products/{id}")
    public ProductDto updateProduct(@PathVariable int id,
                                 @Valid @RequestBody ProductDto productDto){
        return productService.updateProduct(id, productDto);
    }
    //delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "products/{id}")
    public void delete(@PathVariable int id){
        productService.deleteProduct(id);
    }

    //getbyid
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "products/{id}")
    public ProductDto getById(@PathVariable int id){
        return productService.getById(id);
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "productsbyname/{name}")
    public List<ProductDto> getByName(@PathVariable String name){
        return productService.getByName(name);
    }
}

