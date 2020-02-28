package com.meals.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meals.domain.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, String> {

}
