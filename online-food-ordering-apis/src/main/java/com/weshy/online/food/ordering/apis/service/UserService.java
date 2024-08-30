package com.weshy.online.food.ordering.apis.service;

import com.weshy.online.food.ordering.apis.models.User;

public interface UserService {

    public User findByJwtToken(String jwt) throws Exception;
    public User findByEmail(String email) throws Exception;

}
