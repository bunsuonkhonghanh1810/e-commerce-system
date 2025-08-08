package com.DoDucMinhQuang.e_commerce_system.dto;

import jakarta.persistence.Column;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class NewsDTO {

    Long id;
    String name;
    String description;
    String image;
    Long idNewsCategory;
    String contents;
    Integer totalView;
    String linkUrl;
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
