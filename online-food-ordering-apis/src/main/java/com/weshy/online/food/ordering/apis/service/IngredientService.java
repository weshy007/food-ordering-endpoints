package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.IngredientCategory;
import com.weshy.online.food.ordering.apis.models.IngredientsItem;

import java.util.List;

public interface IngredientService {
    public IngredientCategory createIngredientCategory(String name, Long restaurantId) throws Exception;
    public IngredientCategory findByIngredientCategoryId(Long id) throws  Exception;
    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception;
    public IngredientsItem createIngredientItem(Long restaurantId, String ingredientName,Long categoryId) throws Exception;
    public List<IngredientsItem> findByRestaurantIngredients(Long restaurantId) throws Exception;
    public IngredientsItem updateStock(Long id) throws Exception;
}
