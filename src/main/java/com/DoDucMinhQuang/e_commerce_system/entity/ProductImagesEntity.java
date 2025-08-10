package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "PRODUCT_IMAGES")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ProductImagesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "NAME", columnDefinition = "NVARCHAR(250)")
    String name;

    @Column(name = "URLIMG", columnDefinition = "NVARCHAR(250)")
    String urlImg;

    @Column(name = "IDPRODUCT", columnDefinition = "BIGINT")
    Long idProduct;
}

