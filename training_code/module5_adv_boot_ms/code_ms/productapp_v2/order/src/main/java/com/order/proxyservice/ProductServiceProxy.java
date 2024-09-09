package com.order.proxyservice;

import com.order.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "PRODUCTS")
public interface ProductServiceProxy {
    @GetMapping(path = "products/{id}")
    public ProductDto getAnProduct(@PathVariable(name = "id") int id);
}
