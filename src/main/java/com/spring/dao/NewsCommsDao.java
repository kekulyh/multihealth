package com.spring.dao;

import java.util.List;

import com.spring.domain.NewsComms;

public interface NewsCommsDao extends BaseDao<NewsComms>{
	public List<NewsComms> queryNewsComms(int id);
	public List<NewsComms> personalNewsComms(int id);
}
