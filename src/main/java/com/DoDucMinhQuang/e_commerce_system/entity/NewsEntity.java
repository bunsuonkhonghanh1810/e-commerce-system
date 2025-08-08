package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "NEWS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class NewsEntity {

    @Id
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "NAME", columnDefinition = "NVARCHAR(500)")
    String name;

    @Column(name = "DESCRIPTION", columnDefinition = "NTEXT")
    String description;

    @Column(name = "IMAGE", columnDefinition = "NVARCHAR(550)")
    String image;

    @Column(name = "IDNEWSCATEGORY", columnDefinition = "BIGINT")
    Long idNewsCategory;

    @Column(name = "CONTENTS", columnDefinition = "NTEXT")
    String contents;

    @Column(name = "TOTAL_VIEW", columnDefinition = "INT")
    Integer totalView;

    @Column(name = "LINK_URL", columnDefinition = "VARCHAR")
    String linkUrl;

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

    @Column(name = "UPDATED_BY", columnDefinition = "BIGINT DEFAULT NULL")
    Long updatedBy;

    @Column(name = "ISDELETE", columnDefinition = "TINYINT DEFAULT 0")
    Byte isDelete;

    @Column(name = "ISACTIVE", columnDefinition = "TINYINT DEFAULT 1")
    Byte isActive;
}
