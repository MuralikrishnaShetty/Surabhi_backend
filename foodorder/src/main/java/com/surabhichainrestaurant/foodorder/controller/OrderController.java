package com.surabhichainrestaurant.foodorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.surabhichainrestaurant.foodorder.entity.Order;
import com.surabhichainrestaurant.foodorder.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	@Autowired
	OrderService service ;
	
//	saveing the order 
	@PostMapping("/add")
	public  ResponseEntity<List<Order>>save(@RequestBody  List<Order> order){
		List<Order> savesIteam=service.saveOrder(order);
		return ResponseEntity.ok( savesIteam);
	}
	
//	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>>getAll(){
		List<Order> allIteam=service.getOrder();
		return ResponseEntity.ok(allIteam);
	}
	

}
