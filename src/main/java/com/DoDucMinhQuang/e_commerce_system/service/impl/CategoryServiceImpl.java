package com.DoDucMinhQuang.e_commerce_system.security.impl;

import com.DoDucMinhQuang.e_commerce_system.dto.CategoryDTO;
import com.DoDucMinhQuang.e_commerce_system.entity.CategoryEntity;
import com.DoDucMinhQuang.e_commerce_system.mapper.CategoryMapper;
import com.DoDucMinhQuang.e_commerce_system.repository.CategoryRepository;
import com.DoDucMinhQuang.e_commerce_system.security.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDTO> findAll() {
        return categoryRepository
                .findAll()
                .stream()
                .map(categoryMapper::toDTO)
                .toList();
    }

    @Override
    public Optional<CategoryDTO> findById(Long id) {
        return categoryRepository.findById(id)
                .map(categoryMapper::toDTO);
    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        CategoryEntity category = categoryMapper.toEntity(categoryDTO);
        categoryRepository.save(category);
        return categoryMapper.toDTO(category);
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}
