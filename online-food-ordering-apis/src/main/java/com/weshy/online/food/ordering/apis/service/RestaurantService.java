package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.dto.RestaurantDTO;
import com.weshy.online.food.ordering.apis.models.Restaurant;
import com.weshy.online.food.ordering.apis.models.User;
import com.weshy.online.food.ordering.apis.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {
    
    Restaurant createRestaurant(CreateRestaurantRequest req, User user);
    Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant) throws Exception;

    void deleteRestaurant(Long restaurantId) throws Exception;

    List<Restaurant> getAllRestaurants();

    List<Restaurant> searchRestaurant(String keyword);

    Restaurant findRestaurantById(Long restaurantId) throws Exception;

    Restaurant getRestaurantByUserId(Long userId) throws Exception;

    RestaurantDTO addToFavorites(Long restaurantId, User user) throws Exception;

    Restaurant updateRestaurantStatus(Long id) throws Exception;

}
