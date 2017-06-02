package com.javasree.spring.dao;

import java.util.List;

import com.javasree.spring.model.User;

public interface UserDAO {
	
	public void addUser(User user);
	public void updateUser(User user);
	public List<User> listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
}
