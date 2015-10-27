package com.spring.principle;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class UserPrinciple extends org.springframework.security.core.userdetails.User{

	public UserPrinciple(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		// TODO Auto-generated constructor stub
	}
	
	

	

}
