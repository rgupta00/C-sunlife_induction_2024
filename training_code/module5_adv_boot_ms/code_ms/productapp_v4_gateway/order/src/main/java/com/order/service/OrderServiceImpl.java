package com.order.service;

import com.order.dto.*;
import com.order.proxyservice.CouponServiceProxy;
import com.order.proxyservice.CustomerServiceProxy;
import com.order.proxyservice.ProductServiceProxy;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final CustomerServiceProxy customerServiceProxy;
    private final ProductServiceProxy productServiceProxy;
    private final CouponServiceProxy couponServiceProxy;

    @Override
    public OrderResponse bookOrder(OrderRequest orderRequest) {
        CustomerDto customerDto=customerServiceProxy
                .getAnCustomer(orderRequest.getCid());

        ProductDto productDto=productServiceProxy
                .getAnProduct(orderRequest.getPid());

        CouponDto couponDto=couponServiceProxy
                .getAnCouponByCode(orderRequest.getCouponCode());

        double totalPrice=productDto.getPrice()*orderRequest.getQuantity();
        double discountedPrice=totalPrice-couponDto.getDiscountPercentage()*totalPrice/100;
        OrderResponse orderResponse=new OrderResponse();
        orderResponse.setOrderDate(LocalDateTime.now());
        orderResponse.setCustomer(customerDto);
        orderResponse.setProduct(productDto);
        orderResponse.setDiscountedTotalPrice(discountedPrice);
        orderResponse.setId(UUID.randomUUID().toString());
        return orderResponse;
    }
}
