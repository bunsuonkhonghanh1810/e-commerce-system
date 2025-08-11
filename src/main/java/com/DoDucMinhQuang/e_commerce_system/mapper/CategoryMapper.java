package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.CategoryDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryEntity toEntity(CategoryDTO categoryDTO);
    CategoryDTO toDTO(CategoryEntity categoryEntity);
}
