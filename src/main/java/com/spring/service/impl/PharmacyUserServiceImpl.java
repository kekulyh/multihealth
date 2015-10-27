package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.PharmacyUserDao;
import com.spring.dao.impl.PharmacyUserDaoImpl;
import com.spring.domain.PharmacyUser;
import com.spring.service.PharmacyUserService;

@Service
@Transactional
public class PharmacyUserServiceImpl implements PharmacyUserService {
	
	@Autowired
	private PharmacyUserDao pharmacyUserDao = new PharmacyUserDaoImpl();
	
	public PharmacyUserDao getPharmacyUserDao() {
		return pharmacyUserDao;
	}
	
	public void setPharmacyUserDao(PharmacyUserDao pharmacyUserDao) {
		this.pharmacyUserDao = pharmacyUserDao;
	}
	
	
	
	@Override
	public PharmacyUser getPharmacyUserByName(String pharmacyUserName) {
		// TODO Auto-generated method stub
		return pharmacyUserDao.getPharmacyUserByName(pharmacyUserName);
	}

	@Override
	public PharmacyUser getPharmacyUserById(int pharmacyUserId) {
		// TODO Auto-generated method stub
		return pharmacyUserDao.getPharmacyUserById(pharmacyUserId);
	}

	@Override
	public List<PharmacyUser> getAllPharmacyUsers() {
		// TODO Auto-generated method stub
		return pharmacyUserDao.getAllPharmacyUsers();
	}

	@Override
	public void addPharmacyUser(PharmacyUser pharmacyUser) {
		// TODO Auto-generated method stub
		pharmacyUserDao.addPharmacyUser(pharmacyUser);
	}

	@Override
	public void updatePharmacyUser(PharmacyUser pharmacyUser) {
		// TODO Auto-generated method stub
		pharmacyUserDao.updatePharmacyUser(pharmacyUser);
	}

	@Override
	public void deletePharmacyUser(PharmacyUser pharmacyUser) {
		// TODO Auto-generated method stub
		pharmacyUserDao.deletePharmacyUser(pharmacyUser);
	}

	@Override
	public int getPharmacyUserCount() {
		// TODO Auto-generated method stub
		return pharmacyUserDao.getPharmacyUserCount();
	}
	
	
	
	
	
	
	//Without extending BaseServiceImpl, need to implement these methods
	@Override
	public void create(PharmacyUser t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PharmacyUser t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PharmacyUser t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PharmacyUser selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PharmacyUser> findAll(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PharmacyUser> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
