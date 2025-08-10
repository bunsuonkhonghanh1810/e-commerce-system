package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "CUSTOMER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "NAME", columnDefinition = "NVARCHAR(250)")
    String name;

    @Column(name = "USERNAME", columnDefinition = "NVARCHAR(50)")
    String username;

    @Column(name = "PASSWORD", columnDefinition = "NVARCHAR(32)")
    String password;

    @Column(name = "EMAIL", columnDefinition = "NVARCHAR(150)")
    String email;

    @Column(name = "PHONE", columnDefinition = "NVARCHAR(50)")
    String phone;

    @Column(name = "AVATAR", columnDefinition = "NVARCHAR(250)")
    String avatar;

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
