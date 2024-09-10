package com.weshy.online.food.ordering.apis.request;

import com.weshy.online.food.ordering.apis.models.Address;
import lombok.Data;

@Data
public class OrderRequest {
    private Long restaurantId;
    private Address deliveryAddress;
}
