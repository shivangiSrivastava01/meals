package com.meals.domain;

public class Items {
	
	private int id;
	private String name;
	private String typeOfItem;
	private float price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypeOfItem() {
		return typeOfItem;
	}
	public void setTypeOfItem(String typeOfItem) {
		this.typeOfItem = typeOfItem;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

}
