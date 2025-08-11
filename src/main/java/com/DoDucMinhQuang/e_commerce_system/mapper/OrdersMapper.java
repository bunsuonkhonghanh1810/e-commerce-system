package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.OrdersDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.OrdersEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrdersMapper {
    OrdersEntity toEntity(OrdersDTO ordersDTO);
    OrdersDTO toDTO(OrdersEntity ordersEntity);
}
