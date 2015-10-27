package com.spring.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.spring.dao.MedicationBaseDao;

public class MedicationBaseDaoImpl<T> implements MedicationBaseDao<T>  {
	
	private Class<T> entityClass;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//通过反射获取子类确定的泛型类
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public MedicationBaseDaoImpl() {
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		entityClass = (Class) params[0];
	}
	
	//add
	@Override
	public void create(T t) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(t);
	}
	
	//delete
	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(t);
	}
	
	//update
	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(t);
	}
	
	//select by id
	@Override
	public T selectById(int id) {
		// TODO Auto-generated method stub
		return (T) hibernateTemplate.get(entityClass, id);
	}
	
	//find all
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(String hql) {
		// TODO Auto-generated method stub
		List<T> entities = hibernateTemplate.find(hql);
		return entities;
	}
	
	//find by parameter
	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(String hql, Object... params) {
		// TODO Auto-generated method stub
		List<T> entities = hibernateTemplate.find(hql, params);
		return entities;
	}
	
	//find first to max using HibernateCallback
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<T> findFirstToMaxCallback(final String hql, final int First, final int Max) {
		// TODO Auto-generated method stub
		
		List<T> entities = hibernateTemplate.executeFind(new HibernateCallback() {
			public Object doInHibernate(Session arg0) throws HibernateException, SQLException {
				Query query = arg0.createQuery(hql);
				query.setFirstResult(First);
				query.setMaxResults(Max);
				return query.list();
			}
		});
		
		return entities;
	}
	
	//find first to max using findByCriteria
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findFirstToMaxCriteria(int First, int Max) {
		// TODO Auto-generated method stub
		
		DetachedCriteria criteria=DetachedCriteria.forClass(entityClass);
		List<T> entities = hibernateTemplate.findByCriteria(criteria, First, Max);
		
		return entities;
	}
	
	
	
}
