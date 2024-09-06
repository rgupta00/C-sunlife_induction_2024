package com.order.dto;

import com.order.dto.Customer;
import com.order.dto.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String id;
	private double totalPrice;
	private LocalDateTime orderDate;
	private Customer customer;
	private Product product;

}
