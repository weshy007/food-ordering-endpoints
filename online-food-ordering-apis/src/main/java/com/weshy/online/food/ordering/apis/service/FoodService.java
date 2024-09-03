package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.Category;
import com.weshy.online.food.ordering.apis.models.Food;
import com.weshy.online.food.ordering.apis.models.Restaurant;
import com.weshy.online.food.ordering.apis.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {

    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);
    void deleteFood(Long id) throws Exception;
    public List<Food> getRestaurantFood(Long restaurantId,
                                        boolean isVegetarian,
                                        boolean isNonVegetarian,
                                        boolean isSeasonal,
                                        String foodCategory
    );

    public List<Food> searchFood(String keyword);
    public Food findFoodById(Long id) throws Exception;
    public Food updateAvailabilityStatus(Long foodId) throws Exception;


}
