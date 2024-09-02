package com.weshy.online.food.ordering.apis.repository;

import com.weshy.online.food.ordering.apis.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
