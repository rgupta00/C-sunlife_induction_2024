package com.order.proxyservice;

import com.order.dto.CouponDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Service
public class CouponServiceProxyFallback implements CouponServiceProxy{
    @Override
    public CouponDto getAnCouponByCode(String couponCode) {
        //dummy response
        return new CouponDto("SUP10",10, LocalDate.now());
    }
}
