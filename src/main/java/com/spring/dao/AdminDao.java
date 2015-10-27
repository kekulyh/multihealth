package com.spring.dao;

import com.spring.domain.Admin;

public interface AdminDao extends BaseDao<Admin> {
	public Admin login(Admin a);

}
