package com.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.dao.UserDao;
import com.spring.domain.User;
import com.spring.principle.UserPrinciple;
import com.spring.service.UserModel;
@Service(value="userService")

public class UserModelImpl extends BaseModelImpl<User> implements UserModel{
	@Resource(name="userDao")
	private UserDao userDao;
	@Override
	public User login(User user) {
		return userDao.login(user);
	}
	@Override
	public User rearchUser(String name) {
		
		return userDao.rearchUser(name);
	}
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		 UserPrinciple verifiedUser = null;
//		 User user = userDao.rearchUser(username);
//		
//		 try {
//		
//		 List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
//		 authList.add(new GrantedAuthorityImpl("ROLE_SERVICE"));
//		
//		 verifiedUser = new UserPrinciple(user.getName(),
//		 user.getPassword(),authList);
//		 } catch (Exception e) {
//		 e.printStackTrace();
//		 throw new UsernameNotFoundException("Error in retrieving user");
//		 }
//		
//		 return verifiedUser;
//	}
	
}
