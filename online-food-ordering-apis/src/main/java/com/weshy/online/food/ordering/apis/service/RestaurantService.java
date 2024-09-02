package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.dto.RestaurantDTO;
import com.weshy.online.food.ordering.apis.models.Restaurant;
import com.weshy.online.food.ordering.apis.models.User;
import com.weshy.online.food.ordering.apis.request.CreateRestaurantRequest;

import java.util.List;

public interface RestaurantService {
    
    public Restaurant createRestaurant(CreateRestaurantRequest req, User user);
    public Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant) throws Exception;

    public void deleteRestaurant(Long restaurantId) throws Exception;

    public List<Restaurant> getAllRestaurants();

    public List<Restaurant> searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long restaurantId) throws Exception;

    public Restaurant getRestaurantByUserId(Long userId) throws Exception;

    public RestaurantDTO addToFavorites(Long restaurantId, User user) throws Exception;

    public Restaurant updateRestaurantStatus(Long id) throws Exception;

}
