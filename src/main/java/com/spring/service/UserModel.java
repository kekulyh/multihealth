package com.spring.service;

import com.spring.domain.User;

public interface UserModel extends BaseModel<User>{
	public User login(User user);
	public User rearchUser(String name);

}
