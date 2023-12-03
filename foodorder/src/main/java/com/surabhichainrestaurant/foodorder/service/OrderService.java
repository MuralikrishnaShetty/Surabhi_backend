package com.surabhichainrestaurant.foodorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.surabhichainrestaurant.foodorder.entity.Orders;
import com.surabhichainrestaurant.foodorder.repo.OrderRepo;

@Service
public class OrderService {
	@Autowired
	OrderRepo repo;

	public List<Orders> saveOrder(List<Orders> order) {
		return repo.saveAll(order);
	}

	public List<Orders> getOrder() {

		return repo.findAll();

	}
}
