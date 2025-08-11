package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.NewsCategoryDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.NewsCategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsCategoryMapper {
    NewsCategoryEntity toEntity(NewsCategoryDTO newsCategoryDTO);
    NewsCategoryDTO toDTO(NewsCategoryEntity newsCategoryEntity);
}
