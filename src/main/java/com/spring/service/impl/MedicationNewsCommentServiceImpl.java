package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.MedicationNewsCommentDao;
import com.spring.dao.impl.MedicationNewsCommentDaoImpl;
import com.spring.domain.MedicationNewsComment;
import com.spring.service.MedicationNewsCommentService;

@Service
@Transactional
public class MedicationNewsCommentServiceImpl implements MedicationNewsCommentService {
	
	@Autowired
	private MedicationNewsCommentDao medicationNewsCommentDao = new MedicationNewsCommentDaoImpl();
	
	public MedicationNewsCommentDao getMedicationNewsCommentDao() {
		return medicationNewsCommentDao;
	}

	public void setMedicationNewsCommentDao(MedicationNewsCommentDao medicationNewsCommentDao) {
		this.medicationNewsCommentDao = medicationNewsCommentDao;
	}

	
	
	@Override
	public void addNewsComment(MedicationNewsComment medicationNewsComment) {
		// TODO Auto-generated method stub
		medicationNewsCommentDao.addNewsComment(medicationNewsComment);
	}

	@Override
	public void updateNewsComment(MedicationNewsComment medicationNewsComment) {
		// TODO Auto-generated method stub
		medicationNewsCommentDao.updateNewsComment(medicationNewsComment);
	}

	@Override
	public void deleteNewsComment(MedicationNewsComment medicationNewsComment) {
		// TODO Auto-generated method stub
		medicationNewsCommentDao.deleteNewsComment(medicationNewsComment);
	}

	@Override
	public MedicationNewsComment getNewsComment(int medicationNewsCommentId) {
		// TODO Auto-generated method stub
		return medicationNewsCommentDao.getNewsComment(medicationNewsCommentId);
	}

	@Override
	public List<MedicationNewsComment> getNewsCommentByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		return medicationNewsCommentDao.getNewsCommentByPharmacyUserId(pharmacyUserId);
	}

	@Override
	public List<MedicationNewsComment> getNewsCommentByNewsId(int medicationNewsId) {
		// TODO Auto-generated method stub
		return medicationNewsCommentDao.getNewsCommentByNewsId(medicationNewsId);
	}

	@Override
	public List<MedicationNewsComment> getAllComment() {
		// TODO Auto-generated method stub
		return medicationNewsCommentDao.getAllComment();
	}

	@Override
	public void deleteAllNewsCommentOfNewsId(int medicationNewsId) {
		// TODO Auto-generated method stub
		medicationNewsCommentDao.deleteAllNewsCommentOfNewsId(medicationNewsId);
	}

	@Override
	public void deleteNewsCommentOfPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		medicationNewsCommentDao.deleteNewsCommentOfPharmacyUserId(pharmacyUserId);
	}
	
	@Override
	public int getNewsCommentCountByNewsId(int medicationNewsId) {
		// TODO Auto-generated method stub
		return medicationNewsCommentDao.getNewsCommentCountByNewsId(medicationNewsId);
	}
	
	@Override
	public int getNewsCommentCountByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		return medicationNewsCommentDao.getNewsCommentCountByPharmacyUserId(pharmacyUserId);
	}
	
	@Override
	public int getAllNewsCommentNumber() {
		// TODO Auto-generated method stub
		return medicationNewsCommentDao.getAllNewsCommentNumber();
	}
	
	
	
	
	
	//Without extending BaseServiceImpl, need to implement these methods
	@Override
	public void create(MedicationNewsComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MedicationNewsComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MedicationNewsComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MedicationNewsComment selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicationNewsComment> findAll(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicationNewsComment> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

		
	
}
