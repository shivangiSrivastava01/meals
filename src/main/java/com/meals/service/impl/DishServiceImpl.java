package com.meals.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meals.domain.Dish;
import com.meals.exception.MealServiceException;
import com.meals.repository.DishRepository;
import com.meals.service.DishService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DishServiceImpl implements DishService {

	@Autowired
	DishRepository dishRepository;

	@Override
	public Dish getDish(String id) {
		Optional<Dish> dish = dishRepository.findById(id);
		if (dish.isPresent()) {
			return dish.get();
		} else {
			throw new MealServiceException("No Dish Found with id " + id);
		}
	}

	@Override
	public List<Dish> getAllDishes() {
		return (List<Dish>) dishRepository.findAll();

	}

	@Override
	public boolean addDish(Dish dish) {
		dishRepository.save(dish);
		return true;
	}

	@Override
	public boolean editDish(Dish dish) {
		dishRepository.save(dish);
		return true;
	}

	@Override
	public boolean deleteDishes(List<String> disheIdList) {
		for (String dishId : disheIdList) {
			dishRepository.deleteById(dishId);
		}
		return true;
	}

}