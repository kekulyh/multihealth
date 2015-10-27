package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.DoctorDao;
import com.spring.domain.Doctor;

@Repository(value="doctorDao")
public class DoctorDaoImpl extends BaseDaoImpl<Doctor> implements DoctorDao{

	@Override
	public Doctor login(Doctor doctor) {
		
		String hql =  "select a from com.spring.domain.Doctor a where a.name='"
				+ doctor.getName() + "' and a.password='" + doctor.getPassword() + "'";
		List<Doctor>list = this.queryAll(hql);
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public Doctor searchByName(String name) {
		
		String hql =  "select a from com.spring.domain.Doctor a where a.name='"
				+ name+"'";
		List<Doctor>list = this.queryAll(hql);
		if(list != null && list.size()>0){
			return list.get(0);
		}
		return null;
	}

}
