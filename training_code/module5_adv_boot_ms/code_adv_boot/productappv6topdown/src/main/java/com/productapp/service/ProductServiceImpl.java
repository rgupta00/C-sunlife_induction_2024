package com.productapp.service;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.entities.Product;
import com.productapp.getcode.dto.ProductDto;
import com.productapp.repo.ProductRepo;
import com.productapp.service.annotations.CalPerformance;
import com.productapp.util.ProductUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //?
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @CalPerformance
    @Override
    public List<ProductDto> findAll() {
        return productRepo
                .findAll()
                .stream().
                 map(ProductUtil::entityToDto).toList();
    }

    @CalPerformance
    @Override
    public ProductDto getById(int id) {
       return productRepo.findById(id).map(ProductUtil::entityToDto)
               .orElseThrow(()->
                       new ProductNotFoundException
                               ("product with id "+ id +" is not found"));
    }

    @Override
    public List<ProductDto> getByName(String name) {
        return productRepo.findByName(name).stream()
                .map(ProductUtil::entityToDto).toList();
    }

    @Override
    public ProductDto addProduct(ProductDto productDto) {
        Product product=ProductUtil.dtoToEntity(productDto);
        productRepo.save(product);
        return ProductUtil.entityToDto(product);
    }

    @Override
    public ProductDto updateProduct(int id, ProductDto productDto) {
        ProductDto productDtoToUpdate=getById(id);
        productDtoToUpdate.setPrice(productDto.getPrice());
        productRepo.save(ProductUtil.dtoToEntity(productDto));
        return productDtoToUpdate;
    }

    @Override
    public ProductDto deleteProduct(int id) {
        ProductDto productDtoToDelete= getById(id);
        productRepo.delete(ProductUtil.dtoToEntity(productDtoToDelete));
        return productDtoToDelete;
    }
}
