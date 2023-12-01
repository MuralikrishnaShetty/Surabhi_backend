package com.surabhichainrestaurant.foodorder.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surabhichainrestaurant.foodorder.entity.Menu;

public interface MenuRepo extends JpaRepository<Menu,Integer> {

	List<Menu> findByName(String name);

}
