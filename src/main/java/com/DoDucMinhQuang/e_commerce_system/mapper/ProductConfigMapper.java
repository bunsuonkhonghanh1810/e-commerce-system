package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.ProductConfigDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.ProductConfigEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductConfigMapper {
    ProductConfigEntity toEntity(ProductConfigDTO productConfigDTO);
    ProductConfigDTO toDTO(ProductConfigEntity productConfigEntity);
}
