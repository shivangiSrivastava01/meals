package com.meals.service;

import java.util.List;

import com.meals.domain.Restaurant;

public interface RestaurantService {

	public Restaurant getRestaurant(String id);

	public List<Restaurant> getAllRestaurant();

	public boolean addRestaurant(Restaurant restaurant);

	public boolean editRestaurant(Restaurant restaurant);

	public boolean deleteRestaurants(List<String> restaurantIdList);
}
