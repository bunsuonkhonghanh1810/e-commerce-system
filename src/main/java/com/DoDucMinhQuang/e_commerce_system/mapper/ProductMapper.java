package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.ProductDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.ProductEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductEntity toEntity(ProductDTO productDTO);
    ProductDTO toDTO(ProductEntity productEntity);
}
