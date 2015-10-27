package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.AppointmentDao;
import com.spring.domain.Appointment;
import com.spring.domain.ConsultComms;
@Repository(value="appointmentDao")
public class AppointmentDaoImpl extends BaseDaoImpl<Appointment> implements AppointmentDao{

	@Override
	public List<Appointment> listAppointment(int id) {
		String hql =  "select a from com.spring.domain.Appointment a where a.doctor.id="+id;
		List<Appointment> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	@Override
	public List<Appointment> userListAppointment(int uid) {
		String hql =  "select a from com.spring.domain.Appointment a where a.user.id="+uid;
		List<Appointment> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}
}
