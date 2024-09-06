package com.order.controller;

import com.order.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.UUID;

@RestController
public class OrderRestController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ConfigDto configDto;

	@GetMapping(path = "configdto")
	public ConfigDto getConfigDto(){
		return configDto;
	}
	
	@PostMapping(path="orders")
	public ResponseEntity<Order> submitOrder(@RequestBody OrderRequest orderRequest){
		
		// call different rest service using rest template

	     String couponUrl="http://localhost:8085/couponbycode/"+orderRequest.getCouponCode();
		
		String custUrl="http://localhost:8081/customers/"+orderRequest.getCid();
		System.out.println(custUrl);
		String productUrl="http://localhost:8082/products/"+orderRequest.getPid();
		System.out.println(productUrl);
		Customer customer = restTemplate.getForObject(custUrl, Customer.class);
		
		Product product = restTemplate.getForObject(productUrl, Product.class);
		
		Coupon coupon=restTemplate.getForObject(couponUrl, Coupon.class);

		double discountedPrice= product.getPrice()*(1-coupon.getDiscountPercentage())/100;
		double totalPrice= discountedPrice* orderRequest.getQuantity();
		Order order=new Order();
		order.setId(UUID.randomUUID().toString());
		order.setCustomer(customer);
		order.setProduct(product);
		order.setTotalPrice(totalPrice);
		order.setOrderDate(LocalDateTime.now());
		return ResponseEntity.status(HttpStatus.CREATED).body(order);
		
	}

}
