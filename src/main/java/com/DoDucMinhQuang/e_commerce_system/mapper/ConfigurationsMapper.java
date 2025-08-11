package com.DoDucMinhQuang.e_commerce_system.mapper;

import com.DoDucMinhQuang.e_commerce_system.dto.ConfigurationsDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.ConfigurationsEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ConfigurationsMapper {
    ConfigurationsEntity toEntity(ConfigurationsDTO configurationsDTO);
    ConfigurationsDTO toDTO(ConfigurationsEntity configurationsEntity);
}
