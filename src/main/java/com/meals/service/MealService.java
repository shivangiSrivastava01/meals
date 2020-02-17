package com.meals.service;

import java.util.List;

import com.meals.domain.User;

public interface MealService {

	public String addUser(User u);

	public String deleteUser(User user);

	public List<String> getAllUsers();

	public String modifyUser(User user);

}
