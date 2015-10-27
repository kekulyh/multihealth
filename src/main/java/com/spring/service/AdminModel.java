package com.spring.service;

import com.spring.domain.Admin;

public interface AdminModel extends BaseModel<Admin>{
	public Admin login(Admin a);

}
