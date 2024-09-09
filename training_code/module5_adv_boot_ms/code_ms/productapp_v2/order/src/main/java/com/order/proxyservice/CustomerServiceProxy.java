package com.order.proxyservice;

import com.order.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@EnableFeignClients("com.order.proxyservice")

@FeignClient(name = "CUSTOMERS")
public interface CustomerServiceProxy {
    @GetMapping(path = "customers/{id}")
    public CustomerDto getAnCustomer(@PathVariable(name = "id") int id);
}
