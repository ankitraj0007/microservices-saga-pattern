package com.learnwithankit.order.ms.repository;

import com.learnwithankit.order.ms.entity.OrderTable;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<OrderTable, Long> {
}
