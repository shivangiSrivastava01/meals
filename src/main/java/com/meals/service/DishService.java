package com.meals.service;

import java.util.List;

import com.meals.domain.Dish;

public interface DishService {

	public Dish getDish(String id);

	public List<Dish> getAllDishes();

	public boolean addDish(Dish dish);

	public boolean editDish(Dish dish);

	public boolean deleteDishes(List<String> disheIdList);

}