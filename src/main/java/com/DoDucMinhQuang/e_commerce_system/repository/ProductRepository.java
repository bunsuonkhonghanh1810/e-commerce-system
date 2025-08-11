package com.DoDucMinhQuang.e_commerce_system.repository;

import com.DoDucMinhQuang.e_commerce_system.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
