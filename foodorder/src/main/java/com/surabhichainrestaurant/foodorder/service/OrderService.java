package com.surabhichainrestaurant.foodorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surabhichainrestaurant.foodorder.entity.Order;
import com.surabhichainrestaurant.foodorder.repo.OrderRepo;

@Service
public class OrderService {
	@Autowired
	OrderRepo repo;

	public List<Order> saveOrder(List<Order> order) {
		return repo.saveAll(order);
	}

	public List<Order> getOrder() {

		return repo.findAll();

	}
}
