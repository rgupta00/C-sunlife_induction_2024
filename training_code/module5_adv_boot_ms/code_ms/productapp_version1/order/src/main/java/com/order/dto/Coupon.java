package com.order.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Coupon {
	private int id;
	private String couponCode;
	private int discountPercentage;
	private LocalDate expiredOn;

	public Coupon(String couponCode, int discountPercentage, LocalDate expiredOn) {
		this.couponCode = couponCode;
		this.discountPercentage = discountPercentage;
		this.expiredOn = expiredOn;
	}
}