package com.pat.project.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.pat.project.entity.User;

@Transactional
@Repository
public class UserDAO implements IUserDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUser() {
		List<User> test = new ArrayList<User>();
		System.out.println("inside DAO");
		String query = "FROM User";
		System.out.println("inside DAO");
		test = (List<User>) entityManager.createQuery(query).getResultList();
		System.out.println(test);
		return test;
	}

	@Override
	public User getUserById(String userId) {
	 User user = new User();
	 user.setUserId(userId);
		return entityManager.find(User.class, user);
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

	@Override
	public void updateUser(User user) {

		User userToBeUpdated = getUserById(user.getUserId());
		userToBeUpdated.setName(user.getName());
		userToBeUpdated.setPassword(user.getPassword());
		entityManager.flush();

	}

	@Override
	public void deleteUsere(String userId) {
		entityManager.remove(getUserById(userId));

	}

	@Override
	public boolean userExists(String userId) {
		String query = "FROM User as usr WHERE usr.userId = ?";
		int count = entityManager.createQuery(query).setParameter(1, userId).getResultList().size();
		return count > 0 ? true : false;
	}

	//Query Dalana hai
	@Override
	public User userDashboardById() {
		
		return null;
	}

}
