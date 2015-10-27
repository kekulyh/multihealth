package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.NewsCommsDao;
import com.spring.domain.ConsultComms;
import com.spring.domain.NewsComms;
@Repository(value="newscommsDao")
public class NewsCommsDaoImpl extends BaseDaoImpl<NewsComms> implements NewsCommsDao{

	@Override
	public List<NewsComms> queryNewsComms(int id) {
		String hql =  "select a from com.spring.domain.NewsComms a where a.news.id="+id;
		List<NewsComms> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	@Override
	public List<NewsComms> personalNewsComms(int id) {
		String hql =  "select a from com.spring.domain.NewsComms a where a.user.id="+id;
		List<NewsComms> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

}
