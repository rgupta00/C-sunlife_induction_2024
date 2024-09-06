package com.coupon.service;

import com.coupon.exceptions.CouponNotFoundException;
import com.coupon.repo.Coupon;
import com.coupon.repo.CouponRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CouponServiceImpl implements CouponService{

	@Autowired
	private CouponRepo couponRepo;
	
	@Override
	public List<Coupon> getAll() {
		return couponRepo.findAll();
	}

	@Override
	public Coupon getCouponById(int id) {
		return couponRepo.findById(id).orElseThrow(CouponNotFoundException:: new);
	}

	@Override
	public Coupon addCoupon(Coupon coupon) {
		couponRepo.save(coupon);
		return coupon;
	}

	@Override
	public Coupon getCouponByCouponCode(String couponCode) {
		return couponRepo.findByCouponCode(couponCode);
	}

}