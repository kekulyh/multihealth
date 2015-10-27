package com.spring.service;

import java.util.List;

import com.spring.domain.Appointment;

public interface AppointmentModel extends BaseModel<Appointment>{
	public List<Appointment> listAppointment(int id);
	public List<Appointment>userListAppointment(int uid);
}
