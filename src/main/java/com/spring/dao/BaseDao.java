package com.spring.dao;

import java.util.List;

public interface BaseDao<T> {
	public void add(T t);
	public void del(T t);
	public void update(T t);
	public List<T> queryAll(String hql);
	public T queryOne(String hql,Integer id);
	public List<T> search(String table,String name);
	public List<T> h_Page(String hql, int firstResult, int MaxResults);

}
