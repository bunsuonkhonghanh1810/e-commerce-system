package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(name = "ID")
    Long id;

    @Column(name = "NAME", nullable = false, columnDefinition = "NVARCHAR(500)")
    String name;

    @Column(name = "NOTES", columnDefinition = "NTEXT")
    String notes;

    @Column(name = "ISDELETE", columnDefinition = "TINYINT DEFAULT 0")
    Byte isDelete;

    @Column(name = "ISACTIVE", columnDefinition = "TINYINT DEFAULT 1")
    Byte isActive;
}
