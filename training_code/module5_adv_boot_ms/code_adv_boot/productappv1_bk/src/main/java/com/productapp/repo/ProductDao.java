package com.productapp.repo;

import java.util.List;

public interface ProductDao {
    public Product addProduct(Product product);
    public List<Product> getAll();
}
