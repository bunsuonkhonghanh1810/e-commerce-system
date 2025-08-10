package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "PRODUCT_CONFIG")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ProductConfigEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "IDPRODUCT", columnDefinition = "BIGINT")
    Long idProduct;

    @Column(name = "IDCONFIG", columnDefinition = "BIGINT")
    Long idConfig;

    @Column(name = "VALUE", columnDefinition = "NVARCHAR(MAX)")
    String value;
}
