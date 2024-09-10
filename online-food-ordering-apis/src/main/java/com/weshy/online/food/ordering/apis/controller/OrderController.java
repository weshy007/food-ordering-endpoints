package com.weshy.online.food.ordering.apis.controller;

import com.weshy.online.food.ordering.apis.models.CartItem;
import com.weshy.online.food.ordering.apis.models.Order;
import com.weshy.online.food.ordering.apis.models.User;
import com.weshy.online.food.ordering.apis.request.AddCartItemRequest;
import com.weshy.online.food.ordering.apis.request.OrderRequest;
import com.weshy.online.food.ordering.apis.service.OrderService;
import com.weshy.online.food.ordering.apis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    public OrderService orderService;

    @Autowired
    private UserService userService;


    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest req,
                                                  @RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        Order order = orderService.createOrder(req, user);

        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getOrderHistory(@RequestHeader("Authorization") String jwt) throws Exception {
        User user = userService.findUserByJwtToken(jwt);
        List<Order> order = orderService.getUsersOrder(user.getId());

        return new ResponseEntity<>(order, HttpStatus.CREATED);
    }
}
