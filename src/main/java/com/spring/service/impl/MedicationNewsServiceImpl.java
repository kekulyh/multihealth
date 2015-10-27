package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.MedicationNewsDao;
import com.spring.dao.impl.MedicationNewsDaoImpl;
import com.spring.domain.MedicationNews;
import com.spring.service.MedicationNewsService;

@Service
@Transactional
public class MedicationNewsServiceImpl implements MedicationNewsService {
	
	@Autowired
	private MedicationNewsDao medicationNewsDao = new MedicationNewsDaoImpl();
	
	public MedicationNewsDao getMedicationNewsDao() {
		return medicationNewsDao;
	}

	public void setMedicationNewsDao(MedicationNewsDao medicationNewsDao) {
		this.medicationNewsDao = medicationNewsDao;
	}
	
	
	
	@Override
	public List<MedicationNews> medicationNewsList() {
		// TODO Auto-generated method stub
		return medicationNewsDao.medicationNewsList();
	}

	@Override
	public MedicationNews getMedicationNews(int medicationNewsId) {
		// TODO Auto-generated method stub
		return medicationNewsDao.getMedicationNews(medicationNewsId);
	}
	
	@Override
	public void addMedicationNews(MedicationNews medicationNews) {
		// TODO Auto-generated method stub
		medicationNewsDao.addMedicationNews(medicationNews);
	}

	@Override
	public void updateMedicationNews(MedicationNews medicationNews) {
		// TODO Auto-generated method stub
		medicationNewsDao.updateMedicationNews(medicationNews);
	}

	@Override
	public void deleteMedicationNews(MedicationNews medicationNews) {
		// TODO Auto-generated method stub
		medicationNewsDao.deleteMedicationNews(medicationNews);
	}

	@Override
	public List<MedicationNews> medicationNewsListPage(int page, int everyPageAmount) {
		// TODO Auto-generated method stub
		return medicationNewsDao.medicationNewsListPage(page, everyPageAmount);
	}
	
	@Override
	public int getMedicationNewsCount() {
		// TODO Auto-generated method stub
		return medicationNewsDao.getMedicationNewsCount();
	}
	
	@Override
	public MedicationNews getMedicationNewsByTitle(MedicationNews medicationNews) {
		// TODO Auto-generated method stub
		return medicationNewsDao.getMedicationNewsByTitle(medicationNews);
	}
	
	
	
	
	
	
	//Without extending BaseServiceImpl, need to implement these methods
	@Override
	public void create(MedicationNews t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MedicationNews t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MedicationNews t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MedicationNews selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicationNews> findAll(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MedicationNews> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}




	


	
	
	
	
	
	
	
}
