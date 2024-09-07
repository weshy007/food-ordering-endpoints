package com.weshy.online.food.ordering.apis.repository;

import com.weshy.online.food.ordering.apis.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
}
