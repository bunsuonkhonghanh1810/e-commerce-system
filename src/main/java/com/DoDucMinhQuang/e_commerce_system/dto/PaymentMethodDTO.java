package com.DoDucMinhQuang.e_commerce_system.dto;

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
public class PaymentMethodDTO {

    Long id;
    String name;
    String notes;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Byte isDelete;
    Byte isActive;
}
