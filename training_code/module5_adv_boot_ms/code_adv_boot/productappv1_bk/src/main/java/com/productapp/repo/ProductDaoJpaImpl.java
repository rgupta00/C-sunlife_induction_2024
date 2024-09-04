package com.productapp.repo;

import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Primary
public class ProductDaoJpaImpl implements ProductDao{

    private EntityManager entityManager;

    public ProductDaoJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Product addProduct(Product product) {
         entityManager.persist(product);
         return  product;
    }

    @Override
    public List<Product> getAll() {
        return entityManager.createQuery("select p from Product p",
                Product.class).getResultList();
    }
}
