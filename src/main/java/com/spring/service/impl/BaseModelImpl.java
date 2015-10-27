package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.BaseDao;
import com.spring.service.BaseModel;

public class BaseModelImpl<T> implements BaseModel<T> {
	@Resource(name="baseDao")
	//@Autowired
	private BaseDao<T> bdao;
	
	public BaseDao<T> getBdao() {
		return bdao;
	}

	public void setBdao(BaseDao<T> bdao) {
		this.bdao = bdao;
	}

	@Override
	public void add(T t) {
		bdao.add(t);
		
	}

	@Override
	public void del(T t) {
		bdao.del(t);	
	}

	@Override
	public void update(T t) {
		bdao.update(t);
		
	}

	@Override
	public List<T> queryAll(String hql) {
		
		return bdao.queryAll(hql);
	}

	@Override
	public T queryOne(String hql, Integer id) {
		
		return bdao.queryOne(hql, id);
	}

	@Override
	public List<T> search(String table, String name) {
		
		return bdao.search(table, name);
	}

	@Override
	public List<T> h_Page(String hql, int firstResult, int MaxResults) {
		// TODO Auto-generated method stub
		return bdao.h_Page(hql, firstResult, MaxResults);
	}

}
