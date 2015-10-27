package com.spring.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.MedicationBaseDao;
import com.spring.service.MedicationBaseService;

@Transactional
public class MedicationBaseServiceImpl<T> implements MedicationBaseService<T> {
	
	
	private MedicationBaseDao<T> baseDao;
	
	public MedicationBaseDao<T> getBaseDaoImpl() {
		return baseDao;
	}
	
	public void setBaseDao(MedicationBaseDao<T> baseDao) {
		this.baseDao = baseDao;
	}

	@Override
	public void create(T t) {
		// TODO Auto-generated method stub
		baseDao.create(t);
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		baseDao.delete(t);
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		baseDao.update(t);	
	}

	@Override
	public T selectById(int id) {
		// TODO Auto-generated method stub
		return baseDao.selectById(id);
	}

	@Override
	public List<T> findAll(String hql) {
		// TODO Auto-generated method stub
		return baseDao.findAll(hql);
	}

	@Override
	public List<T> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		return baseDao.find(hql, params);
	}
	
	
	
}
