package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.User;

public interface UserService {

    User findUserByJwtToken(String jwt) throws Exception;
    User findByEmail(String email) throws Exception;
}
