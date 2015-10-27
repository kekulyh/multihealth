package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.UserDao;
import com.spring.domain.User;
@Repository(value="userDao")

public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
	
private SessionFactory sessionFactory;
	
	
	@Override
	public User login(User user) {
		String hql =  "select a from com.spring.domain.User a where a.name='"
				+ user.getName() + "' and a.password='" + user.getPassword() + "'";
		List<User>list = this.queryAll(hql);
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	
	@Override
	public User rearchUser(String name) {
		//System.out.println("aaa");
		
		String hql =  "select a from com.spring.domain.User a where a.name='"
				+ name + "'";
		List<User>list = this.queryAll(hql);
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
		//return result.get(0);
	}
}
