package com.spring.dao;

import java.util.List;

public interface MedicationBaseDao<T> {
	
	//add
	public void create(T t);
	
	//delete
	public void delete(T t);
	
	//update
	public void update(T t);
	
	//select by id
	public T selectById(int id);
	
	//find all
	public List<T> findAll(String hql);
	
	//find by parameter 
	public List<T> find(String hql, Object... params);
	
	//find first to max using HibernateCallback
	public List<T> findFirstToMaxCallback(String hql, int First, int Max);
	
	//find first to max using findByCriteria
	public List<T> findFirstToMaxCriteria(int First, int Max);
	
}
