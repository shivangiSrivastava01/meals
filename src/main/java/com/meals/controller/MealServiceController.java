package com.meals.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.meals.domain.User;
import com.meals.service.MealService;

public class MealServiceController {
	
	MealService ms;
	
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public List<String> getAllUsers(){
		
		return ms.getAllUsers();
	}
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(User user) {
		
		return ms.addUser(user);
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public String deleteUser(User user) {
		
		return ms.deleteUser(user);
	}
	
	@RequestMapping(value = "/modifyUser", method = RequestMethod.POST)
	public String modifyUser(User user) {
		
		return ms.modifyUser(user);
	}
	

}
