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
		//i need to call all other ms
		Product product=restTemplate
				.getForObject("http://localhost:8082/products/"

						+orderRequest.getPid(),Product.class);
		return null;
		
	}

}
