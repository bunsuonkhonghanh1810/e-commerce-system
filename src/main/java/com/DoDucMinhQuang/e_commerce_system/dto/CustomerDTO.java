package com.DoDucMinhQuang.e_commerce_system.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class CustomerDTO {

    Long id;
    String name;
    String username;
    String password;
    String email;
    String phone;
    String avatar;
    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    Long createdBy;
    Long updatedBy;
    Byte isDelete;
    Byte isActive;
}
