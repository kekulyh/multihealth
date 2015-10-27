package com.spring.dao;

import com.spring.domain.User;

public interface UserDao extends BaseDao<User>{
	public User login(User user);
	public User rearchUser(String name);
}
