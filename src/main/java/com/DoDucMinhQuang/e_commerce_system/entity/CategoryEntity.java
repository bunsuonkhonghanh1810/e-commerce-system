package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "CATEGORY")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "NAME", columnDefinition = "NVARCHAR(500)")
    String name;

    @Column(name = "NOTES", columnDefinition = "NVARCHAR(MAX)")
    String notes;

    @Column(name = "ICON", columnDefinition = "NVARCHAR(250)")
    String icon;

    @Column(name = "IDPARENT", columnDefinition = "BIGINT")
    Long idParent;

    @Column(name = "TYPE", columnDefinition = "TINYINT")
    Byte type;

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

    @Column(name = "CREATED_BY", columnDefinition = "BIGINT DEFAULT NULL")
    Long createdBy;

    @Column(name = "UPDATED_BY", columnDefinition = "BIGINT BIGINT DEFAULT NULL")
    Long updatedBy;

    @Column(name = "ISDELETE", columnDefinition = "TINYINT DEFAULT 0")
    Byte isDelete;

    @Column(name = "ISACTIVE", columnDefinition = "TINYINT DEFAULT 1")
    Byte isActive;
}
