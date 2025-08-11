package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.NewsDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.NewsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NewsMapper {
    NewsEntity toEntity(NewsDTO newsDTO);
    NewsDTO toDTO(NewsEntity newsEntity);
}
