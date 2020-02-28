package com.meals.service;

import java.util.List;

import com.meals.domain.Meal;

public interface MealService {

	public Meal getMeal(String id);

	public List<Meal> getAllMeals();

	public boolean addMeal(Meal meal);

	public boolean editMeal(Meal meal);

	public boolean deleteMeals(List<String> mealIdList);

}
