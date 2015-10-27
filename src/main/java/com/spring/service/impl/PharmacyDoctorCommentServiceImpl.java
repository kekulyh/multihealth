package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.PharmacyDoctorCommentDao;
import com.spring.dao.impl.PharmacyDoctorCommentDaoImpl;
import com.spring.domain.PharmacyDoctorComment;
import com.spring.service.PharmacyDoctorCommentService;

@Service
@Transactional
public class PharmacyDoctorCommentServiceImpl implements PharmacyDoctorCommentService {
	
	@Autowired
	private PharmacyDoctorCommentDao pharmacyDoctorCommentDao = new PharmacyDoctorCommentDaoImpl();
	
	public PharmacyDoctorCommentDao getPharmacyDoctorCommentDao() {
		return pharmacyDoctorCommentDao;
	}

	public void setPharmacyDoctorCommentDao(PharmacyDoctorCommentDao pharmacyDoctorCommentDao) {
		this.pharmacyDoctorCommentDao = pharmacyDoctorCommentDao;
	}
	
	

	@Override
	public void addPharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment) {
		// TODO Auto-generated method stub
		pharmacyDoctorCommentDao.addPharmacyDoctorComment(pharmacyDoctorComment);
	}

	@Override
	public void updatePharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment) {
		// TODO Auto-generated method stub
		pharmacyDoctorCommentDao.updatePharmacyDoctorComment(pharmacyDoctorComment);
	}

	@Override
	public void deletePharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment) {
		// TODO Auto-generated method stub
		pharmacyDoctorCommentDao.deletePharmacyDoctorComment(pharmacyDoctorComment);
	}

	@Override
	public PharmacyDoctorComment getPharmacyDoctorComment(int pharmacyDoctorCommentId) {
		// TODO Auto-generated method stub
		return pharmacyDoctorCommentDao.getPharmacyDoctorComment(pharmacyDoctorCommentId);
	}

	@Override
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		return pharmacyDoctorCommentDao.getPharmacyDoctorCommentByPharmacyUserId(pharmacyUserId);
	}

	@Override
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentByPharmacyDoctorId(int pharmacyDoctorId) {
		// TODO Auto-generated method stub
		return pharmacyDoctorCommentDao.getPharmacyDoctorCommentByPharmacyDoctorId(pharmacyDoctorId);
	}

	@Override
	public List<PharmacyDoctorComment> getAllComment() {
		// TODO Auto-generated method stub
		return pharmacyDoctorCommentDao.getAllComment();
	}

	@Override
	public void deleteAllPharmacyDoctorCommentOfPharmacyDoctorId(int pharmacyDoctorId) {
		// TODO Auto-generated method stub
		pharmacyDoctorCommentDao.deleteAllPharmacyDoctorCommentOfPharmacyDoctorId(pharmacyDoctorId);
	}

	@Override
	public void deletePharmacyDoctorCommentOfPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		pharmacyDoctorCommentDao.deletePharmacyDoctorCommentOfPharmacyUserId(pharmacyUserId);
	}

	@Override
	public int getPharmacyDoctorCommentCountByPharmacyDoctorId(int pharmacyDoctorId) {
		// TODO Auto-generated method stub
		return pharmacyDoctorCommentDao.getPharmacyDoctorCommentCountByPharmacyDoctorId(pharmacyDoctorId);
	}

	@Override
	public int getPharmacyDoctorCommentCountByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		return pharmacyDoctorCommentDao.getPharmacyDoctorCommentCountByPharmacyUserId(pharmacyUserId);
	}

	@Override
	public int getAllPharmacyDoctorCommentNumber() {
		// TODO Auto-generated method stub
		return pharmacyDoctorCommentDao.getAllPharmacyDoctorCommentNumber();
	}
	
	@Override
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentOnPageByPharmacyDoctorId(int pharmacyDoctorId, int page,
			int everyPageAmount) {
		// TODO Auto-generated method stub
		return pharmacyDoctorCommentDao.getPharmacyDoctorCommentOnPageByPharmacyDoctorId(pharmacyDoctorId, page, everyPageAmount);
	}
	
	
	
	
	
	//Without extending BaseServiceImpl, need to implement these methods
	@Override
	public void create(PharmacyDoctorComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(PharmacyDoctorComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(PharmacyDoctorComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PharmacyDoctorComment selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PharmacyDoctorComment> findAll(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PharmacyDoctorComment> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
}
