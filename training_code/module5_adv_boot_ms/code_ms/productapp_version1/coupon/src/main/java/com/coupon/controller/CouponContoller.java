package com.coupon.controller;

import com.coupon.dto.ConfigDto;
import com.coupon.repo.Coupon;
import com.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CouponContoller {
	
	@Autowired
	private CouponService couponService;
	@Autowired
	private ConfigDto configDto;

	@GetMapping(path = "configdto")
	public ConfigDto getConfigDto(){
		return configDto;
	}

	@GetMapping(path="coupons")
	public List<Coupon> getAll(){
		return couponService.getAll();
	}
	
	@GetMapping(path="couponbyid/{id}")
	public Coupon getAnCouponById(@PathVariable(name="id") int id){
		return couponService.getCouponById(id);
	}
	
	@GetMapping(path="couponbycode/{couponCode}")
	public Coupon getAnCouponByCode(@PathVariable(name="couponCode") String couponCode){
		return couponService.getCouponByCouponCode(couponCode);
	}
}