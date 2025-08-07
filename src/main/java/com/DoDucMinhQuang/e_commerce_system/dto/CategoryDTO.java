package com.DoDucMinhQuang.e_commerce_system.dto;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class CategoryDTO {

    Long id;
    String name;
    String notes;
    String icon;
    Long idParent;
    Byte type;
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
