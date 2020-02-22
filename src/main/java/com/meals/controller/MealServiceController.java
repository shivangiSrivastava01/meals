package com.meals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.meals.domain.User;
import com.meals.repository.MealServiceDAO;

@RestController
public class MealServiceController {
	
	@Autowired
    private MealServiceDAO dao;
	
	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public List<User> getAllUsers(){
		
		return dao.list();
	}
	/*
	 * @RequestMapping(value = "/addUser", method = RequestMethod.POST) public
	 * String addUser(User user) {
	 * 
	 * return dao.save(user); }
	 * 
	 * @RequestMapping(value = "/deleteUser", method = RequestMethod.POST) public
	 * String deleteUser(User user) {
	 * 
	 * return dao.delete(user.getId()); }
	 * 
	 * @RequestMapping(value = "/modifyUser", method = RequestMethod.POST) public
	 * String modifyUser(User user) {
	 * 
	 * return dao.update(user); }
	 */
	

}
