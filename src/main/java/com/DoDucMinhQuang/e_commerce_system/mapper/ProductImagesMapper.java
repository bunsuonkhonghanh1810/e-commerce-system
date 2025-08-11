package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.ProductImagesDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.ProductImagesEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductImagesMapper {
    ProductImagesEntity toEntity(ProductImagesDTO productImagesDTO);
    ProductImagesDTO toDTO(ProductImagesEntity productImagesEntity);
}
