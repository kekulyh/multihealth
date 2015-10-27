package com.spring.dao;

import java.util.List;

import com.spring.domain.Appointment;

public interface AppointmentDao extends BaseDao<Appointment>{
	List<Appointment>listAppointment(int id); 
	List<Appointment>userListAppointment(int uid);
}
