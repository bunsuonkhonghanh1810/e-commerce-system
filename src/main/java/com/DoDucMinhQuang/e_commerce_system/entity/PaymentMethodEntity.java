package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "PAYMENT_METHOD")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class PaymentMethodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "NAME", columnDefinition = "NVARCHAR(250)")
    String name;

    @Column(name = "NOTES", columnDefinition = "NVARCHAR(MAX)")
    String notes;

    @Column(name = "CREATED_DATE", columnDefinition = "DATETIME DEFAULT GETDATE()")
    LocalDateTime createdDate;

    @Column(name = "UPDATED_DATE", columnDefinition = "DATETIME DEFAULT GETDATE()")
    LocalDateTime updatedDate;

    @Column(name = "ISDELETE", columnDefinition = "TINYINT DEFAULT 0")
    Byte isDelete;

    @Column(name = "ISACTIVE", columnDefinition = "TINYINT DEFAULT 1")
    Byte isActive;
}
