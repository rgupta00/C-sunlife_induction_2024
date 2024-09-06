package com.coupon;

import com.coupon.dto.ConfigDto;
import com.coupon.repo.Coupon;
import com.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.time.LocalDate;
@EnableConfigurationProperties(ConfigDto.class)
@SpringBootApplication
public class CouponApplication implements CommandLineRunner {

	@Autowired
	private CouponService couponService;

	public static void main(String[] args) {
		SpringApplication.run(CouponApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		couponService.addCoupon(new Coupon("SUP10", 10,
				LocalDate.of(2025,10,10)));
		couponService.addCoupon(new Coupon("SUP20", 20,
				LocalDate.of(2025,10,10)));

		couponService.addCoupon(new Coupon("SUP15", 15,
				LocalDate.of(2025,10,10)));

	}
}
