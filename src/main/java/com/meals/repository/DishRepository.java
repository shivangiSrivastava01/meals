package com.meals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meals.domain.Dish;

@Repository
public interface DishRepository extends CrudRepository<Dish, String> {

}
