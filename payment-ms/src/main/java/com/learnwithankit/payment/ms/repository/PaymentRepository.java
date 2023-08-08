package com.learnwithankit.payment.ms.repository;

import com.learnwithankit.payment.ms.entity.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
    Optional<Payment> findByOrderId(long orderId);
}
