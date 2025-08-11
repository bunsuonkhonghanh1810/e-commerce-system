package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.OrdersDetailsDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.OrdersDetailsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdersDetailsMapper {
    OrdersDetailsEntity toEntity(OrdersDetailsDTO ordersDetailsDTO);
    OrdersDetailsDTO toDTO(OrdersDetailsEntity ordersDetailsEntity);
}
