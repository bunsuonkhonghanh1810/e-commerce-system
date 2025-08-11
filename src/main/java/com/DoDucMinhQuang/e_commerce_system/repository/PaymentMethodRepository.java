package com.DoDucMinhQuang.e_commerce_system.repository;

import com.DoDucMinhQuang.e_commerce_system.entity.PaymentMethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethodEntity, Long> {
}
