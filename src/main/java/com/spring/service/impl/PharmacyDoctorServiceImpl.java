package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.PharmacyDoctorDao;
import com.spring.dao.impl.PharmacyDoctorDaoImpl;
import com.spring.domain.PharmacyDoctor;
import com.spring.service.PharmacyDoctorService;

@Service
@Transactional
public class PharmacyDoctorServiceImpl implements PharmacyDoctorService {
	
	@Autowired
	private PharmacyDoctorDao pharmacyDoctorDao = new PharmacyDoctorDaoImpl();
	
	public PharmacyDoctorDao getPharmacyDoctorDao() {
		return pharmacyDoctorDao;
	}

	public void setPharmacyDoctorDao(PharmacyDoctorDao pharmacyDoctorDao) {
		this.pharmacyDoctorDao = pharmacyDoctorDao;
	}

	
	
	@Override
	public void addPharmacyDoctor(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		pharmacyDoctorDao.addPharmacyDoctor(pharmacyDoctor);
	}

	@Override
	public void updatePharmacyDoctor(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		pharmacyDoctorDao.updatePharmacyDoctor(pharmacyDoctor);
	}

	@Override
	public void deletePharmacyDoctor(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		pharmacyDoctorDao.deletePharmacyDoctor(pharmacyDoctor);
	}
	
	@Override
	public List<PharmacyDoctor> searchPharmacyDoctorName(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		return pharmacyDoctorDao.searchPharmacyDoctorName(pharmacyDoctor);
	}

	@Override
	public List<PharmacyDoctor> searchPharmacyDoctorSpecialty(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		return pharmacyDoctorDao.searchPharmacyDoctorSpecialty(pharmacyDoctor);
	}

	@Override
	public List<PharmacyDoctor> searchPharmacyDoctorPharmacy(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		return pharmacyDoctorDao.searchPharmacyDoctorPharmacy(pharmacyDoctor);
	}

	@Override
	public PharmacyDoctor getPharmacyDoctor(int pharmacyDoctorId) {
		// TODO Auto-generated method stub
		return pharmacyDoctorDao.getPharmacyDoctor(pharmacyDoctorId);
	}

	@Override
	public List<PharmacyDoctor> PharmacyDoctorList() {
		// TODO Auto-generated method stub
		return pharmacyDoctorDao.PharmacyDoctorList();
	}
	
	@Override
	public PharmacyDoctor getPharmacyDoctorByName(String pharmacyDoctorName) {
		// TODO Auto-generated method stub
		return pharmacyDoctorDao.getPharmacyDoctorByName(pharmacyDoctorName);
	}
	
	
	
	
	
	
	
	//Without extending BaseServiceImpl<Medicine>, need to implement these methods
	@Override
	public void create(PharmacyDoctor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PharmacyDoctor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PharmacyDoctor t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PharmacyDoctor selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PharmacyDoctor> findAll(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PharmacyDoctor> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	
	
	
	
	
	
	
	
}
