package com.pat.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pat.project.dao.IUserDAO;
import com.pat.project.entity.User;

@Service
public class UserService implements IUserService {
	@Autowired
	private IUserDAO userDAO;

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUser();
	}

	@Override
	public User getUserById(String userId) {
		User user = userDAO.getUserById(userId);
		return user;
	}

	@Override
	public boolean addUser(User user) {
		if (userDAO.userExists(user.getUserId())) {
			return false;
		} else {
			userDAO.addUser(user);
			return true;
		}
	}

	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);

	}

	@Override
	public void deleteUser(String userId) {
		userDAO.deleteUsere(userId);

	}

	@Override
	public User userDashboardById(String id) {
		
		return userDAO.userDashboardById();
	}

}
