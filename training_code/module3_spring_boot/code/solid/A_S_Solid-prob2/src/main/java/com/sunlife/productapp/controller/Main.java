package com.sunlife.productapp.controller;

import java.sql.SQLException;

import com.sunlife.productapp.dao.Product;
import com.sunlife.productapp.service.ProductService;
import com.sunlife.productapp.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		ProductService productService=new ProductServiceImpl();
		productService.addProduct(new Product("watch" , 3000.00));
		
	}
}
