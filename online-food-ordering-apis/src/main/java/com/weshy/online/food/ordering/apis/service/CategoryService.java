package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(String name, Long userId) throws Exception;
    List<Category> findCategoriesByRestaurantId(Long id) throws Exception;
    Category findCategoryById(Long id) throws Exception;
}
