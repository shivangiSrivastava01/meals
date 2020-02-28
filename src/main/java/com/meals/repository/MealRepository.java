package com.meals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meals.domain.Meal;

@Repository
public interface MealRepository extends CrudRepository<Meal, String> {

}
