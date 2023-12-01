package com.surabhichainrestaurant.foodorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surabhichainrestaurant.foodorder.entity.Order;

public interface OrderRepo extends JpaRepository<Order,Integer>{

}
