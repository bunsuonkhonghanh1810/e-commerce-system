package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.CustomerDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerEntity toEntity(CustomerDTO customerDTO);
    CustomerDTO toDTO(CustomerEntity customerEntity);
}
