package com.order.proxyservice;

import com.order.dto.CouponDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "COUPONS", fallback = CouponServiceProxyFallback.class)
public interface CouponServiceProxy {
    @GetMapping(path="couponbycode/{couponCode}")
    public CouponDto getAnCouponByCode(@PathVariable(name="couponCode") String couponCode);
}
