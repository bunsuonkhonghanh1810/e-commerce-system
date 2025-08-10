package com.DoDucMinhQuang.e_commerce_system.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class OrdersDTO {

    Long id;
    String idOrders;
    LocalDateTime ordersDate;
    Long idCustomer;
    Long idPayment;
    Long idTransport;
    BigDecimal totalMoney;
    String notes;
    String nameReceiver;
    String address;
    String email;
    String phone;
    Byte isDelete;
    Byte isActive;
}
