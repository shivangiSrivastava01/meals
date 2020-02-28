package com.meals.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Restaurant {
	@Id
	private String restaurantId;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String pincode;
	private String city;
	private String country;
	private String tags;

}
