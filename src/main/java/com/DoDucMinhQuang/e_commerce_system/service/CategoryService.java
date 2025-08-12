package com.DoDucMinhQuang.e_commerce_system.security;

import com.DoDucMinhQuang.e_commerce_system.dto.CategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryDTO> findAll();
    Optional<CategoryDTO> findById(Long id);
    CategoryDTO save(CategoryDTO categoryDTO);
    void deleteById(Long id);
}
