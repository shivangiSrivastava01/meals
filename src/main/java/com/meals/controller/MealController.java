package com.meals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meals.domain.Meal;
import com.meals.service.MealService;

@RestController
public class MealController {

	@Autowired
	MealService mealService;

	@GetMapping(value = "/meal")
	public Meal getMeal(@RequestParam("") String id) {
		return mealService.getMeal(id);
	}

	@GetMapping(value = "/meals")
	public List<Meal> getAllMeals() {
		return mealService.getAllMeals();
	}

	@PostMapping(value = "/meal")
	public boolean addMeal(@RequestBody Meal meal) {
		return mealService.addMeal(meal);
	}

	@PostMapping(value = "/meal/edit")
	public boolean editMeal(@RequestBody Meal meal) {
		return mealService.editMeal(meal);
	}

	@DeleteMapping(value = "/meals")
	public boolean deleteMeals(@RequestBody List<String> Ids) {
		return mealService.deleteMeals(Ids);
	}

}
