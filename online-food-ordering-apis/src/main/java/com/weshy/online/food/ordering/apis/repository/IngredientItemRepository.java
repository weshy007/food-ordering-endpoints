package com.weshy.online.food.ordering.apis.repository;

import com.weshy.online.food.ordering.apis.models.IngredientsItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientItemRepository extends JpaRepository<IngredientsItem, Long> {
    List<IngredientsItem> findByRestaurantId(Long id);
}
