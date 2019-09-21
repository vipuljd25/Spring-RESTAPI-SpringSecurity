package com.pat.project.service;

import java.util.List;

import com.pat.project.entity.User;

public interface IUserService {
	List<User> getAllUsers();

	User getUserById(String userId);

	boolean addUser(User user);

	void updateUser(User user);

	void deleteUser(String userId);

	User userDashboardById(String id);
}