package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(name = "ID")
    Long id;

    @Column(name = "IDPRODUCT")
    Long idProduct;

    @Column(name = "IDCONFIG")
    Long idConfig;

    @Column(name = "VALUE", columnDefinition = "NTEXT")
    String value;
}
