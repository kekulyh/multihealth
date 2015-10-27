//package com.spring.service.impl;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.GrantedAuthorityImpl;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.spring.dao.UserDao;
//import com.spring.dao.impl.UserDaoImpl;
//import com.spring.domain.User;
//import com.spring.principle.UserPrinciple;
//
//@Service
//public class MyUserDetailService implements UserDetailsService {
//	
//	private UserDao userDao = new UserDaoImpl();
//	public MyUserDetailService() {
//		// TODO Auto-generated constructor stub
//	}
//	public MyUserDetailService(UserDao userDao) {
//		this.userDao = userDao;
//		
//	}
//
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		 User user = userDao.rearchUser(username);
//		
//		 try {
//		
//		 List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
//		 authList.add(new GrantedAuthorityImpl("ROLE_SERVICE"));
//		
//		 UserPrinciple verifiedUser = new UserPrinciple(user.getName(),user.getPassword(),authList);
//		 return verifiedUser;
//		 } catch (Exception e) {
//		 e.printStackTrace();
//		 throw new UsernameNotFoundException("Error in retrieving user");
//		 }
//	
//
//	}
//
//}
