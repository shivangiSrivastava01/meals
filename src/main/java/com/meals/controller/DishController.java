package com.meals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meals.domain.Dish;
import com.meals.service.DishService;

@RestController
public class DishController {

	@Autowired
	DishService dishService;

	@GetMapping(value = "/dish")
	public Dish getDish(@RequestParam("") String id) {
		return dishService.getDish(id);
	}

	@GetMapping(value = "/dishes")
	public List<Dish> getAllDishes() {
		return dishService.getAllDishes();
	}

	@PostMapping(value = "/dish")
	public boolean addDish(@RequestBody Dish dish) {
		return dishService.addDish(dish);
	}

	@PostMapping(value = "/dish/edit")
	public boolean editDish(@RequestBody Dish dish) {
		return dishService.editDish(dish);
	}

	@DeleteMapping(value = "/dishs")
	public boolean deleteDishes(@RequestBody List<String> ids) {
		return dishService.deleteDishes(ids);
	}
}
