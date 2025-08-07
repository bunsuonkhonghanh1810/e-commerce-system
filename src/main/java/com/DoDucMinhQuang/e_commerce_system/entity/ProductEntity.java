package com.DoDucMinhQuang.e_commerce_system.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRODUCT")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ProductEntity {

    @Id
    @Column(name = "ID")
    Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "NVARCHAR(500)")
    String name;

    @Column(name = "DESCRIPTION", columnDefinition = "NTEXT")
    String description;

    @Column(name = "NOTES", columnDefinition = "NTEXT")
    String notes;

    @Column(name = "IMAGE", columnDefinition = "NVARCHAR(550)")
    String image;

    @Column(name = "IDCATEGORY")
    Long idCategory;

    @Column(name = "CONTENTS", columnDefinition = "NTEXT")
    String contents;

    @Column(name = "PRICE", columnDefinition = "DECIMAL DEFAULT 0")
    BigDecimal price;

    @Column(name = "QUATITY", columnDefinition = "INT DEFAULT 0")
    Integer quatity;

    @Column(name = "SLUG", columnDefinition = "NVARCHAR(160)")
    String slug;

    @Column(name = "META_TITLE", columnDefinition = "NVARCHAR(100)")
    String metaTitle;

    @Column(name = "META_KEYWORD", columnDefinition = "NVARCHAR(500)")
    String metaKeyword;

    @Column(name = "META_DESCRIPTION", columnDefinition = "NVARCHAR(500)")
    String metaDescription;

    @Column(name = "CREATED_DATE", columnDefinition = "DATETIME DEFAULT GETDATE()")
    LocalDateTime createdDate;

    @Column(name = "UPDATED_DATE", columnDefinition = "DATETIME DEFAULT GETDATE()")
    LocalDateTime updatedDate;

    @Column(name = "CREATED_BY")
    Long createdBy;

    @Column(name = "UPDATED_BY")
    Long updatedBy;

    @Column(name = "ISDELETE", columnDefinition = "TINYINT DEFAULT 0")
    Byte isDelete;

    @Column(name = "ISACTIVE", columnDefinition = "TINYINT DEFAULT 1")
    Byte isActive;
}
