package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.MedicineCommentDao;
import com.spring.dao.impl.MedicineCommentDaoImpl;
import com.spring.domain.MedicineComment;
import com.spring.service.MedicineCommentService;

@Service
@Transactional
public class MedicineCommentServiceImpl implements MedicineCommentService {
	
	@Autowired
	private MedicineCommentDao medicineCommentDao = new MedicineCommentDaoImpl();

	public MedicineCommentDao getMedicineCommentDao() {
		return medicineCommentDao;
	}

	public void setMedicineCommentDao(MedicineCommentDao medicineCommentDao) {
		this.medicineCommentDao = medicineCommentDao;
	}

	
	
	
	@Override
	public void addMedicineComment(MedicineComment medicineComment) {
		// TODO Auto-generated method stub
		medicineCommentDao.addMedicineComment(medicineComment);
	}

	@Override
	public void updateMedicineComment(MedicineComment medicineComment) {
		// TODO Auto-generated method stub
		medicineCommentDao.updateMedicineComment(medicineComment);
	}

	@Override
	public void deleteMedicineComment(MedicineComment medicineComment) {
		// TODO Auto-generated method stub
		medicineCommentDao.deleteMedicineComment(medicineComment);
	}

	@Override
	public MedicineComment getMedicineComment(int medicineCommentId) {
		// TODO Auto-generated method stub
		return medicineCommentDao.getMedicineComment(medicineCommentId);
	}

	@Override
	public List<MedicineComment> getMedicineCommentByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		return medicineCommentDao.getMedicineCommentByPharmacyUserId(pharmacyUserId);
	}

	@Override
	public List<MedicineComment> getMedicineCommentByMedicineId(int medicineId) {
		// TODO Auto-generated method stub
		return medicineCommentDao.getMedicineCommentByMedicineId(medicineId);
	}

	@Override
	public List<MedicineComment> getAllComment() {
		// TODO Auto-generated method stub
		return medicineCommentDao.getAllComment();
	}

	@Override
	public void deleteAllMedicineCommentOfMedicineId(int medicineId) {
		// TODO Auto-generated method stub
		medicineCommentDao.deleteAllMedicineCommentOfMedicineId(medicineId);
	}

	@Override
	public void deleteMedicineCommentOfPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		medicineCommentDao.deleteMedicineCommentOfPharmacyUserId(pharmacyUserId);
	}

	@Override
	public int getMedicineCommentCountByMedicineId(int medicineId) {
		// TODO Auto-generated method stub
		return medicineCommentDao.getMedicineCommentCountByMedicineId(medicineId);
	}

	@Override
	public int getMedicineCommentCountByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		return medicineCommentDao.getMedicineCommentCountByPharmacyUserId(pharmacyUserId);
	}

	@Override
	public int getAllMedicineCommentNumber() {
		// TODO Auto-generated method stub
		return medicineCommentDao.getAllMedicineCommentNumber();
	}
	
	@Override
	public List<MedicineComment> getMedicineCommentOnPageByMedicineId(int medicineId, int page, int everyPageAmount) {
		// TODO Auto-generated method stub
		return medicineCommentDao.getMedicineCommentOnPageByMedicineId(medicineId, page, everyPageAmount);
	}
	
	
	
	
	
	//Without extending BaseServiceImpl, need to implement these methods
	@Override
	public void create(MedicineComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MedicineComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MedicineComment t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MedicineComment selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicineComment> findAll(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicineComment> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	
	
	
}
