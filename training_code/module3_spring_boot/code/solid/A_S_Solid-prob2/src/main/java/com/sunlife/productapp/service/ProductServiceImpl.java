package com.sunlife.productapp.service;

import com.sunlife.productapp.dao.Product;
import com.sunlife.productapp.dao.ProductDao;
import com.sunlife.productapp.dao.ProductDaoImpl;
import com.sunlife.productapp.exceptions.DataValidationException;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	private ProductValidation productValidation;

	public ProductServiceImpl() {
		productDao = new ProductDaoImpl();
		productValidation = new ProductValidationImpl();
	}

	@Override
	public void addProduct(Product product) {
		if (productValidation.valiation(product)) {
			productDao.addProduct(product);
		} else
			throw new DataValidationException("data validation failed");
	}

}
