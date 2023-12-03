package com.surabhichainrestaurant.foodorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surabhichainrestaurant.foodorder.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders,Integer>{

}
