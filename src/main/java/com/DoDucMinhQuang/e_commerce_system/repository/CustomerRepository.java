package com.DoDucMinhQuang.e_commerce_system.repository;

import com.DoDucMinhQuang.e_commerce_system.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
