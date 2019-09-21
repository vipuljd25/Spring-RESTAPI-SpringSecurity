package com.pat.project.dao;

import java.util.List;

import com.pat.project.entity.User;

public interface IUserDAO {
	List<User> getAllUser();

	User getUserById(String userId);

	void addUser(User user);

	void updateUser(User user);

	void deleteUsere(String userId);

	boolean userExists(String userId);

	User userDashboardById();

	
}
