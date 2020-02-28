package com.meals.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Meal {
	@Id
	private String mealId;
	private List<String> dishName;
	private List<String> dishId;
	private MealCategory mealCategory;
	private float price;
}
