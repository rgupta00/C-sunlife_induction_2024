package com.productapp.repo;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductDaoMapImp implements ProductDao{
    private Map<Integer, Product> map=new HashMap<>();

    public ProductDaoMapImp(){
        map.put(1, new Product(1, "laptop", BigDecimal.valueOf(1200000)));
        map.put(2, new Product(1, "laptop cover", BigDecimal.valueOf(1000)));
    }
    @Override
    public List<Product> getAll() {
        return new ArrayList<>(map.values());
    }
}
