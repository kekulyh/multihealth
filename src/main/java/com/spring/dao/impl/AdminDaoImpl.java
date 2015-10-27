package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.spring.dao.AdminDao;
import com.spring.domain.Admin;
@Repository(value="adminDao")
//@Service(value="adminDao")
//@Repository
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

	@Override
	public Admin login(Admin a) {
		String hql =  "select a from com.spring.domain.Admin a where a.name='"
				+ a.getName() + "' and a.password='" + a.getPassword() + "'";
		List<Admin>list = this.queryAll(hql);
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
