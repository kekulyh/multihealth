package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.MedicationEventsDao;
import com.spring.dao.impl.MedicationEventsDaoImpl;
import com.spring.domain.MedicationEvents;
import com.spring.service.MedicationEventsService;

@Service
@Transactional
public class MedicationEventsServiceImpl implements MedicationEventsService {
	
	@Autowired
	private MedicationEventsDao medicationEventsDao = new MedicationEventsDaoImpl();
	
	public MedicationEventsDao getMedicationEventsDao() {
		return medicationEventsDao;
	}

	public void setMedicationEventsDao(MedicationEventsDao medicationEventsDao) {
		this.medicationEventsDao = medicationEventsDao;
	}
	
	

	@Override
	public void addMedicationEvents(MedicationEvents medicationEvents) {
		// TODO Auto-generated method stub
		medicationEventsDao.addMedicationEvents(medicationEvents);
	}

	@Override
	public void updateMedicationEvents(MedicationEvents medicationEvents) {
		// TODO Auto-generated method stub
		medicationEventsDao.updateMedicationEvents(medicationEvents);
	}

	@Override
	public void deleteMedicationEvents(MedicationEvents medicationEvents) {
		// TODO Auto-generated method stub
		medicationEventsDao.deleteMedicationEvents(medicationEvents);
	}

	@Override
	public MedicationEvents getMedicationEvents(int medicationEventsId) {
		// TODO Auto-generated method stub
		return medicationEventsDao.getMedicationEvents(medicationEventsId);
	}

	@Override
	public List<MedicationEvents> medicationEventsList() {
		// TODO Auto-generated method stub
		return medicationEventsDao.medicationEventsList();
	}

	@Override
	public List<MedicationEvents> medicationEventsListPage(int page, int everyPageAmount) {
		// TODO Auto-generated method stub
		return medicationEventsDao.medicationEventsListPage(page, everyPageAmount);
	}

	@Override
	public int getMedicationEventsCount() {
		// TODO Auto-generated method stub
		return medicationEventsDao.getMedicationEventsCount();
	}
	
	@Override
	public MedicationEvents getMedicationEventsByTitle(MedicationEvents medicationEvents) {
		// TODO Auto-generated method stub
		return medicationEventsDao.getMedicationEventsByTitle(medicationEvents);
	}
	
	
	
	
	
	
	//Without extending BaseServiceImpl, need to implement these methods
	@Override
	public void create(MedicationEvents t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MedicationEvents t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MedicationEvents t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MedicationEvents selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicationEvents> findAll(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicationEvents> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
