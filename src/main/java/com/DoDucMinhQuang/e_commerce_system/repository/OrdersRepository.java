package com.DoDucMinhQuang.e_commerce_system.repository;

import com.DoDucMinhQuang.e_commerce_system.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Long> {
}
