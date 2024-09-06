package com.weshy.online.food.ordering.apis.repository;

import com.weshy.online.food.ordering.apis.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String username);

}
