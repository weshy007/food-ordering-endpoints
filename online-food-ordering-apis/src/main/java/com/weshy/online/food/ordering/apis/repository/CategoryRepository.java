package com.weshy.online.food.ordering.apis.repository;

import com.weshy.online.food.ordering.apis.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    public List<Category> findByRestaurantId(Long restaurantId);
}
