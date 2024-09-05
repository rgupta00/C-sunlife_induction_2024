//package com.productapp.controller;
//
//import com.productapp.repo.Product;
//import com.productapp.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ProductControllerBk {
//
//    private ProductService productService;
//
//    @Autowired
//    public ProductControllerBk(ProductService productService) {
//        this.productService = productService;
//    }
//
//    //RepsoneEntity vs @ResponseStatus
//    //get all products
//
//    @GetMapping(path = "products")
//    public ResponseEntity<List<Product>> getAll() {
//        return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
//    }
//    //add product
//    @PostMapping(path = "products")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Product addProduct(@RequestBody Product product){
//        return productService.addProduct(product);
//    }
//    //update
//    @ResponseStatus(HttpStatus.OK)
//    @PutMapping(path = "products/{id}")
//    public Product updateProduct(@PathVariable int id,@RequestBody Product product){
//        return productService.updateProduct(id, product);
//    }
//    //delete
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    @DeleteMapping(path = "products/{id}")
//    public void delete(@PathVariable int id){
//        productService.deleteProduct(id);
//    }
//    //getbyid
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping(path = "products/{id}")
//    public Product getById(@PathVariable int id){
//        return productService.getById(id);
//    }
//    @ResponseStatus(HttpStatus.OK)
//    @GetMapping(path = "productsbyname/{name}")
//    public List<Product> getByName(@PathVariable String name){
//        return productService.getByName(name);
//    }
//}
//
