package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.Cart;
import com.weshy.online.food.ordering.apis.models.CartItem;
import com.weshy.online.food.ordering.apis.request.AddCartItemRequest;

public interface CartService {
    
    CartItem addItemToCart(AddCartItemRequest req, String jwt) throws Exception;
    CartItem updateCartItemQuantity(Long cartItemId, int quantity) throws Exception;
    Cart removeItemFromCart(Long cartItemId, String jwt) throws Exception;
    Long calculateCartTotal(Cart cart) throws Exception;
    Cart findCartById(Long id) throws Exception;
    Cart findCartByUserId(String jwt) throws Exception;
    Cart clearCart(String jwt) throws Exception;
}
