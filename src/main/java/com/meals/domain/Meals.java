package com.meals.domain;

public class Meals {
	
	private int id;
	private String cuisineName;
	private String typeOfMeal;
	private float price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCuisineName() {
		return cuisineName;
	}
	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}
	public String getTypeOfMeal() {
		return typeOfMeal;
	}
	public void setTypeOfMeal(String typeOfMeal) {
		this.typeOfMeal = typeOfMeal;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
