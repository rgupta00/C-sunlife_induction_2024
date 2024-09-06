package com.coupon.service;

import com.coupon.repo.Coupon;

import java.util.List;

public interface CouponService {
	public List<Coupon> getAll();
	public Coupon getCouponById(int id);
	public Coupon getCouponByCouponCode(String couponCode);
	public Coupon addCoupon(Coupon coupon);
}