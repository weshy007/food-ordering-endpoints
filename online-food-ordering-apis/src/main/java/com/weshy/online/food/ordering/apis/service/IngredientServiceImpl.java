package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.IngredientCategory;
import com.weshy.online.food.ordering.apis.models.IngredientsItem;
import com.weshy.online.food.ordering.apis.models.Restaurant;
import com.weshy.online.food.ordering.apis.repository.IngredientCategoryRepository;
import com.weshy.online.food.ordering.apis.repository.IngredientItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientItemRepository ingredientItemRepository;

    @Autowired
    private IngredientCategoryRepository ingredientCategoryRepository;

    @Autowired
    private RestaurantService restaurantService;


    @Override
    public IngredientCategory createIngredientCategory(String name, Long restaurantId) throws Exception {

        Restaurant restaurant = restaurantService.findRestaurantById(restaurantId);
        IngredientCategory category = new IngredientCategory();
        category.setName(name);
        category.setRestaurant(restaurant);

        return ingredientCategoryRepository.save(category);
    }

    @Override
    public IngredientCategory findByIngredientCategoryId(Long id) throws Exception {
        Optional<IngredientCategory> opt = ingredientCategoryRepository.findById(id);

        if(opt.isEmpty()) {
            throw new Exception("Ingredient category not found");
        }
        return opt.get();
    }

    @Override
    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long id) throws Exception {
        restaurantService.findRestaurantById(id);
        return ingredientCategoryRepository.findByRestaurantId(id);
    }

    @Override
    public IngredientsItem createIngredientItem(Long restaurantId, String ingredientName, Long categoryId) throws Exception {
        Restaurant restaurant = restaurantService.findRestaurantById(restaurantId);
        IngredientCategory category = findByIngredientCategoryId(categoryId);

        IngredientsItem item = new IngredientsItem();
        item.setRestaurant(restaurant);
        item.setName(ingredientName);
        item.setCategory(category);

        IngredientsItem ingredient = ingredientItemRepository.save(item);
        category.getIngredients().add(ingredient);

        return ingredient;
    }

    @Override
    public List<IngredientsItem> findByRestaurantIngredients(Long restaurantId, Long ingredientId) throws Exception {
        return ingredientItemRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public IngredientsItem updateStock(Long id, Long stock) throws Exception {
        Optional<IngredientsItem> opt = ingredientItemRepository.findById(id);

        if(opt.isEmpty()) {
            throw new Exception("Ingredient item not found");
        }

        IngredientsItem ingredientsItem = opt.get();
        ingredientsItem.setInStock(!ingredientsItem.isInStock());

        return ingredientItemRepository.save(ingredientsItem);
    }
}
