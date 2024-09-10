package com.weshy.online.food.ordering.apis.repository;

import com.weshy.online.food.ordering.apis.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
