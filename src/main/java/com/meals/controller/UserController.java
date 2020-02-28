package com.meals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meals.domain.User;
import com.meals.service.UserService;

@RestController
public class UserController {

	// TODO: Access control and role management to be added to have role based api
	// access

	@Autowired
	UserService userService;

	@GetMapping(value = "/user")
	public User getUser(@RequestParam("") String id) {
		return userService.getUser(id);
	}

	@GetMapping(value = "/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping(value = "/user")
	public boolean addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@PostMapping(value = "/user/edit")
	public boolean editUser(@RequestBody User user) {
		return userService.editUser(user);
	}

	@DeleteMapping(value = "/users")
	public boolean deleteUsers(@RequestBody List<String> Ids) {
		return userService.deleteUsers(Ids);
	}
}
