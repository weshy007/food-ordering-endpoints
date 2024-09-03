package com.weshy.online.food.ordering.apis.request;

import com.weshy.online.food.ordering.apis.models.Category;
import com.weshy.online.food.ordering.apis.models.IngredientsItem;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {
    private String name;
    private String description;
    private Long price;

    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegetarian;
    private boolean seasonal;

    private List<IngredientsItem> ingredients;

}
