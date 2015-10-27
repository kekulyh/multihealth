package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.DoctorDao;
import com.spring.domain.Doctor;
import com.spring.service.DoctorModel;
@Service(value="doctorService")
public class DoctorModelImpl extends BaseModelImpl<Doctor> implements DoctorModel{
	
	@Resource(name="doctorDao")
	private DoctorDao doctorDao;

	@Override
	public Doctor login(Doctor doctor) {
		return doctorDao.login(doctor);
	}

	@Override
	public Doctor searchByName(String name) {
		
		return doctorDao.searchByName(name);
	}


}
