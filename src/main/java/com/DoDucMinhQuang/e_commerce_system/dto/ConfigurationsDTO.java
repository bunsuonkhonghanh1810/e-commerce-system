package com.DoDucMinhQuang.e_commerce_system.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ConfigurationsDTO {

    Long id;
    String name;
    String notes;
    Byte isDelete;
    Byte isActive;
}
