package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.PaymentMethodDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.PaymentMethodEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMethodMapper {
    PaymentMethodEntity toEntity(PaymentMethodDTO PaymentMethodDTO);
    PaymentMethodDTO toDTO(PaymentMethodEntity PaymentMethodEntity);
}
