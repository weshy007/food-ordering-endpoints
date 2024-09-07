package com.weshy.online.food.ordering.apis.repository;

import com.weshy.online.food.ordering.apis.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    Cart findByCustomerId(Long userId);
}
