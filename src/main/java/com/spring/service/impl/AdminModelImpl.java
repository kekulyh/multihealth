package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.AdminDao;
import com.spring.dao.impl.AdminDaoImpl;
import com.spring.domain.Admin;
import com.spring.service.AdminModel;
@Service(value="adminService")
//@Service

public class AdminModelImpl extends BaseModelImpl<Admin> implements AdminModel{
	@Resource(name="adminDao")
	//@Autowired
	private AdminDao adminDao;

	@Override
	public Admin login(Admin a) {
		
		return adminDao.login(a);
	}

	
}
