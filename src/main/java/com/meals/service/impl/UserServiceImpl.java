package com.meals.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meals.domain.User;
import com.meals.repository.UserRepository;
import com.meals.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User getUser(String id) {
		Optional<User> user = userRepository.findById(id);
		return user.isPresent() ? user.get() : null;
	}

	@Override
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}

	@Override
	public boolean addUser(User user) {
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean editUser(User user) {
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean deleteUsers(List<String> userIdList) {
		for (String userId : userIdList) {
			userRepository.deleteById(userId);
		}
		return true;
	}

}
