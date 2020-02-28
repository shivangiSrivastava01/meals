package com.meals.service;

import java.util.List;

import com.meals.domain.User;

public interface UserService {

	public User getUser(String id);

	public List<User> getAllUsers();

	public boolean addUser(User user);

	public boolean editUser(User user);

	public boolean deleteUsers(List<String> userIdList);
}
