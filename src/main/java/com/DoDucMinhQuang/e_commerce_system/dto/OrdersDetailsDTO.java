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
public class OrdersDetailsDTO {

    Long id;
    Long idOrder;
    Long idProduct;
    Double price;
    Integer quantity;
    Double total;
    Integer returnQuantity;
}
