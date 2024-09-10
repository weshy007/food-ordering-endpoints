package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.Order;
import com.weshy.online.food.ordering.apis.models.User;
import com.weshy.online.food.ordering.apis.request.OrderRequest;

import java.util.List;

public interface OrderService {
    Order createOrder(OrderRequest order, User user) throws Exception;
    Order updateOrder(Long orderId, String orderStatus) throws Exception;
    void cancelOrder(Long orderId) throws Exception;
    List<Order> getUsersOrder(Long userId);
    List<Order> getRestaurantsOrder(Long restaurantId, String orderStatus) throws  Exception;
    Order findOrderById(Long orderId) throws Exception;
}
