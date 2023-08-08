package com.learnwithankit.order.ms.controller;

import com.learnwithankit.order.ms.dto.CustomerOrder;
import com.learnwithankit.order.ms.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    public CustomerOrder createOrder(@RequestBody CustomerOrder customerOrder){

        return orderService.createOrder(customerOrder);

    }
}
