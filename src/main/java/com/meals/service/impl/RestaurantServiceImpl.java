package com.meals.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meals.domain.Restaurant;
import com.meals.repository.RestaurantRepository;
import com.meals.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;

	@Override
	public Restaurant getRestaurant(String id) {
		Optional<Restaurant> restaurant = restaurantRepository.findById(id);
		return restaurant.isPresent() ? restaurant.get() : null;
	}

	@Override
	public List<Restaurant> getAllRestaurant() {
		return (List<Restaurant>) restaurantRepository.findAll();

	}

	@Override
	public boolean addRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
		return true;
	}

	@Override
	public boolean editRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
		return true;
	}

	@Override
	public boolean deleteRestaurants(List<String> restaurantIdList) {
		for (String restaurantId : restaurantIdList) {
			restaurantRepository.deleteById(restaurantId);
		}
		return true;
	}

}
