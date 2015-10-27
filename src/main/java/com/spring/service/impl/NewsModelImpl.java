package com.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.NewsDao;
import com.spring.domain.News;
import com.spring.service.NewsModel;

@Service(value="newsService")
public class NewsModelImpl extends BaseModelImpl<News> implements NewsModel{
	@Resource(name="newsDao")
	private NewsDao newsDao;
}
