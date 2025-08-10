package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "CONFIGURATIONS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ConfigurationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "NAME", columnDefinition = "NVARCHAR(500)")
    String name;

    @Column(name = "NOTES", columnDefinition = "NVARCHAR(MAX)")
    String notes;

    @Column(name = "ISDELETE", columnDefinition = "TINYINT DEFAULT 0")
    Byte isDelete;

    @Column(name = "ISACTIVE", columnDefinition = "TINYINT DEFAULT 1")
    Byte isActive;
}
