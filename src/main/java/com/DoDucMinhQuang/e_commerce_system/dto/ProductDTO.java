package com.DoDucMinhQuang.e_commerce_system.dto;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ProductDTO {
    
    Long id;
    String name;
    String description;
    String notes;
    String image;
    Long idCategory;
    String contents;
    BigDecimal price;
    Integer quantity;
    String slug;
    String metaTitle;
    String metaKeyword;
    String metaDescription;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Long createdBy;
    Long updatedBy;
    Byte isDelete;
    Byte isActive;
}
