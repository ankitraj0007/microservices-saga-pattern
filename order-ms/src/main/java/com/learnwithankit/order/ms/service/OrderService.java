package com.learnwithankit.order.ms.service;

import com.learnwithankit.order.ms.dto.CustomerOrder;
import com.learnwithankit.order.ms.entity.OrderTable;
import com.learnwithankit.order.ms.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderProducer orderProducer;

    public CustomerOrder createOrder(CustomerOrder customerOrder) {
        //fill entity
        OrderTable order = new OrderTable();
        order.setItem(customerOrder.getItem());
        order.setQuantity(customerOrder.getQuantity());
        order.setAmount(customerOrder.getAmount());
        order.setStatus("ORDER_CREATED");

        order = orderRepository.save(order); //save entity
        customerOrder.setOrderId(order.getId()); //set id in response

        orderProducer.produce(customerOrder); // call producer

        return customerOrder;
    }
}
