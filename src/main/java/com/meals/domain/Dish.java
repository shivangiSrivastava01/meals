package com.meals.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Dish {
	@Id
	private String dishId;
	private String name;
	private FoodCategory foodCategory;
	private float price;
}
