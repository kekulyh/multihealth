package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.MedicineDao;
import com.spring.dao.impl.MedicineDaoImpl;
import com.spring.domain.Medicine;
import com.spring.service.MedicineService;

@Service
@Transactional
public class MedicineServiceImpl implements MedicineService {
	
	@Autowired
	private MedicineDao medicineDao = new MedicineDaoImpl();
	
	public MedicineDao getMedicineDao() {
		return medicineDao;
	}

	public void setMedicineDao(MedicineDao medicineDao) {
		this.medicineDao = medicineDao;
	}
	
	
	@Override
	public void addMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		medicineDao.addMedicine(medicine);
	}

	@Override
	public void updateMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		medicineDao.update(medicine);
	}

	@Override
	public void deleteMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		medicineDao.delete(medicine);
	}
	
	@Override
	public List<Medicine> searchMedicineName(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineDao.searchMedicineName(medicine);
	}
	
	@Override
	public List<Medicine> searchMedicineSymptom(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineDao.searchMedicineSymptom(medicine);
	}
	
	@Override
	public Medicine getMedicine(int medicineId) {
		// TODO Auto-generated method stub
		return medicineDao.getMedicine(medicineId);
	}
	
	@Override
	public Medicine getMedicineByName(Medicine medicine) {
		// TODO Auto-generated method stub
		return medicineDao.getMedicineByName(medicine);
	}
	
	@Override
	public List<Medicine> medicineList() {
		// TODO Auto-generated method stub
		return medicineDao.medicineList();
	}
	
	@Override
	public List<Medicine> medicineCommentCountList() {
		// TODO Auto-generated method stub
		return medicineDao.medicineCommentCountList();
	}
	
	
	
	//Without extending BaseServiceImpl<Medicine>, need to implement these methods
	@Override
	public void create(Medicine t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Medicine t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Medicine t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Medicine selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Medicine> findAll(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Medicine> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}



	

	

	
}
