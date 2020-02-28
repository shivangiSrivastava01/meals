package com.meals.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meals.domain.Meal;
import com.meals.repository.MealRepository;
import com.meals.service.MealService;

@Service
public class MealServiceImpl implements MealService {

	@Autowired
	MealRepository mealRepository;

	@Override
	public Meal getMeal(String id) {
		Optional<Meal> restaurant = mealRepository.findById(id);
		return restaurant.isPresent() ? restaurant.get() : null;

	}

	@Override
	public List<Meal> getAllMeals() {
		return (List<Meal>) mealRepository.findAll();
	}

	@Override
	public boolean addMeal(Meal meal) {
		mealRepository.save(meal);
		return true;
	}

	@Override
	public boolean editMeal(Meal meal) {
		mealRepository.save(meal);
		return true;
	}

	@Override
	public boolean deleteMeals(List<String> mealIdList) {
		for (String mealId : mealIdList) {
			mealRepository.deleteById(mealId);
		}
		return true;
	}

}
