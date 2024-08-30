package com.weshy.online.food.ordering.apis.request;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
