package com.weshy.online.food.ordering.apis.response;

import com.weshy.online.food.ordering.apis.models.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;
}
