package com.weshy.online.food.ordering.apis.controller;

import com.weshy.online.food.ordering.apis.models.Food;
import com.weshy.online.food.ordering.apis.models.User;
import com.weshy.online.food.ordering.apis.service.FoodService;
import com.weshy.online.food.ordering.apis.service.RestaurantService;
import com.weshy.online.food.ordering.apis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private UserService userService;

    @GetMapping("/food/search")
    public ResponseEntity<List<Food>> searchFood(@RequestParam String keyword,
                                                 @RequestHeader("Authorization") String jwt) throws  Exception{

        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.searchFood(keyword);

        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public ResponseEntity<List<Food>> getRestaurantFood(@RequestParam boolean vegetarian,
                                                        @RequestParam boolean seasonal,
                                                        @RequestParam boolean nonVegetarian,
                                                        @RequestParam (required=false) String food_category,
                                                        @PathVariable Long restaurantId,
                                                        @RequestHeader("Authorization") String jwt) throws  Exception{

        User user = userService.findUserByJwtToken(jwt);
        List<Food> foods = foodService.getRestaurantFood(restaurantId, vegetarian, seasonal, nonVegetarian, food_category);

        return new ResponseEntity<>(foods, HttpStatus.OK);
    }

}
