package com.ecommerce.library.service;

import com.ecommerce.library.dto.CategoryDto;
import com.ecommerce.library.model.Category;
import com.ecommerce.library.model.Product;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> findALl();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enableById(Long id);
    List<Category> findAllByActivated();


    //customer
    List<CategoryDto> getCategoryAndSize();





}
