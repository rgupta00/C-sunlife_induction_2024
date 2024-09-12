package com.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
	private String id;
	private double discountedTotalPrice;
	private LocalDateTime orderDate;
	private CustomerDto customer;
	private ProductDto product;

}
