package com.weshy.online.food.ordering.apis.request;

import lombok.Data;

@Data
public class IngredientItemRequest {
    private String name;
    private Long categoryId;
    private Long restaurantId;
}
