package com.meals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.meals.domain.Restaurant;
import com.meals.service.RestaurantService;

public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;

	@GetMapping(value = "/restaurant")
	public Restaurant getRestaurant(@RequestParam("") String id) {
		return restaurantService.getRestaurant(id);
	}

	@GetMapping(value = "/restaurants")
	public List<Restaurant> getAllRestaurant() {
		return restaurantService.getAllRestaurant();
	}

	@PostMapping(value = "/restaurant")
	public boolean addRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.addRestaurant(restaurant);
	}

	@PostMapping(value = "/restaurant/edit")
	public boolean editRestaurant(@RequestBody Restaurant restaurant) {
		return restaurantService.editRestaurant(restaurant);
	}

	@DeleteMapping(value = "/restaurants")
	public boolean deleteRestaurants(@RequestBody List<String> Ids) {
		return restaurantService.deleteRestaurants(Ids);
	}
}
