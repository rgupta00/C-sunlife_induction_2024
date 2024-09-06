package com.product.service;

import com.product.ProductApplication;
import com.product.repo.Product;

import java.util.List;

public interface ProductService {
	public List<Product> getAllProduct();
	public Product addProduct(Product customer);
	public Product getProductById(int id);
}
