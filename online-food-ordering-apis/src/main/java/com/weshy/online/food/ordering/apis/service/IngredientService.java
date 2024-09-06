package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.IngredientCategory;
import com.weshy.online.food.ordering.apis.models.IngredientsItem;

import java.util.List;

public interface IngredientService {
    IngredientCategory createIngredientCategory(String name, Long restaurantId) throws Exception;
    IngredientCategory findByIngredientCategoryId(Long id) throws  Exception;
    List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception;
    IngredientsItem createIngredientItem(Long restaurantId, String ingredientName, Long categoryId) throws Exception;
    List<IngredientsItem> findByRestaurantIngredients(Long restaurantId) throws Exception;
    IngredientsItem updateStock(Long id) throws Exception;
}
