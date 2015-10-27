package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.NewsCommsDao;
import com.spring.domain.NewsComms;
import com.spring.service.NewsCommsModel;

@Service(value="newscommsService")
public class NewsCommsModelImpl extends BaseModelImpl<NewsComms> implements NewsCommsModel{
	@Resource(name="newscommsDao")
	private NewsCommsDao newscommsDao;

	@Override
	public List<NewsComms> queryNewsComms(int id) {
		// TODO Auto-generated method stub
		return newscommsDao.queryNewsComms(id);
	}

	@Override
	public List<NewsComms> personalNewsComms(int id) {
		// TODO Auto-generated method stub
		return newscommsDao.personalNewsComms(id);
	}
}
