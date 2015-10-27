package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.AppointmentDao;
import com.spring.domain.Appointment;
import com.spring.service.AppointmentModel;
@Service(value="appointmentService")
public class AppointmentModelImpl extends BaseModelImpl<Appointment> implements AppointmentModel{

	@Resource(name="appointmentDao")
	private AppointmentDao appointmentDao;

	@Override
	public List<Appointment> listAppointment(int id) {
		// TODO Auto-generated method stub
		return appointmentDao.listAppointment(id);
	}

	@Override
	public List<Appointment> userListAppointment(int uid) {
		// TODO Auto-generated method stub
		return appointmentDao.userListAppointment(uid);
	}
}
