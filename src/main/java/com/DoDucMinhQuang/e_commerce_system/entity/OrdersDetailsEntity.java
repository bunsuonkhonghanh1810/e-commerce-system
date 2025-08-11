package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "ORDERS_DETAILS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class OrdersDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "IDORDER", columnDefinition = "BIGINT")
    Long idOrder;

    @Column(name = "IDPRODUCT", columnDefinition = "BIGINT")
    Long idProduct;

    @Column(name = "PRICE", columnDefinition = "DECIMAL CHECK (PRICE > 0)")
    Double price;

    @Column(name = "QUANTITY", columnDefinition = "INT CHECK (QUANTITY > 0)")
    Integer quantity;

    @Column(name = "TOTAL", columnDefinition = "DECIMAL")
    Double total;

    @Column(name = "RETURN_QUANTITY", columnDefinition = "INT")
    Integer returnQuantity;
}
