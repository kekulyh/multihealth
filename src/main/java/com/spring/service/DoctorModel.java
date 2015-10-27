package com.spring.service;

import com.spring.domain.Doctor;

public interface DoctorModel extends BaseModel<Doctor>{
	public Doctor login(Doctor doctor);
	public Doctor searchByName(String name);

}
