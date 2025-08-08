package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(name = "ID")
    Long id;

    @Column(name = "NAME", columnDefinition = "NVARCHAR(250)")
    String name;

    @Column(name = "URLIMG", columnDefinition = "NVARCHAR(250)")
    String urlImg;

    @Column(name = "IDPRODUCT")
    Long idProduct;
}

