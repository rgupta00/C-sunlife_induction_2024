package com.producer.controller;

import com.producer.config.RabbitMqConfig;
import com.producer.dto.Order;
import com.producer.dto.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

    @Autowired
    private RabbitTemplate template;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        order.setOrderId(UUID.randomUUID().toString());
        //restaurantservice
        //payment service
        OrderStatus orderStatus = new OrderStatus(order,
                "PROCESS", "order placed succesfully in " + restaurantName);

        template.convertAndSend(RabbitMqConfig.EXCHANGE,
                RabbitMqConfig.ROUTING_KEY, orderStatus);

        return "Success !!";
    }
}