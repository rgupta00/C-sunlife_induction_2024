package com.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeConfig(RouteLocatorBuilder routeLocatorBuilder) {
        return routeLocatorBuilder.routes()
                .route(p -> p
                        .path("/sunlife/shoppingapp/productservice/**")
                        .filters( f -> f.rewritePath("/sunlife/shoppingapp/productservice/(?<segment>.*)","/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://PRODUCTS"))
                .route(p -> p
                        .path("/sunlife/shoppingapp/customerservice/**")
                        .filters( f -> f.rewritePath("/sunlife/shoppingapp/customerservice/(?<segment>.*)","/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://CUSTOMERS"))
                .route(p -> p
                        .path("/sunlife/shoppingapp/orderservice/**")
                        .filters( f -> f.rewritePath("/sunlife/shoppingapp/orderservice/(?<segment>.*)","/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://ORDERS"))
                .route(p -> p
                        .path("/sunlife/shoppingapp/couponservice/**")
                        .filters( f -> f.rewritePath("/sunlife/shoppingapp/couponservice/(?<segment>.*)","/${segment}")
                                .addResponseHeader("X-Response-Time", LocalDateTime.now().toString()))
                        .uri("lb://COUPONS"))
                .build();
    }
}