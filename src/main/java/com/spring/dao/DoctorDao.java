package com.spring.dao;

import com.spring.domain.Doctor;

public interface DoctorDao extends BaseDao<Doctor> {
	public Doctor login(Doctor doctor);
	public Doctor searchByName(String name);

}
