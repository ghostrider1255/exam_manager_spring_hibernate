package com.javasree.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.javasree.spring.dao.UserDAO;
import com.javasree.spring.model.User;
import com.javasree.spring.service.UserService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		user.setUserStatus(true);
		this.userDAO.addUser(user);
		
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		this.userDAO.updateUser(user);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public List<User> listUsers() {
		return this.userDAO.listUsers();
	}

	@Override
	@Transactional
	public User getUserById(int id) {
		return this.userDAO.getUserById(id);
	}

	@Override
	@Transactional
	public void removeUser(int id) {
		this.userDAO.removeUser(id);
		
	}
}
