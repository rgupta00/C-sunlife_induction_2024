package com.productapp.controller;

import com.productapp.repo.Product;
import com.productapp.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	@GetMapping(path = "products")
	public ResponseEntity<List<Product>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(productService.findAll());
	}
	
	@GetMapping(path = "products/{id}")
	public ResponseEntity<Product> findById(@PathVariable(name = "id") int id){
		return ResponseEntity.status(HttpStatus.OK).body(productService.getById(id));
	}
	
	@PostMapping(path = "products")
	public ResponseEntity<Product> addProduct( @Valid @RequestBody Product product){
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
	}
	
	@DeleteMapping(path = "products/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable(name = "id") int id){
		productService.deleteProduct(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	@PutMapping(path = "products/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable(name = "id") int id,
												 @Valid @RequestBody Product product){
		return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(id, product));
	}
}