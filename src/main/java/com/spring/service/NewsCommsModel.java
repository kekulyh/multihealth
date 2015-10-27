package com.spring.service;

import java.util.List;

import com.spring.domain.NewsComms;

public interface NewsCommsModel extends BaseModel<NewsComms>{
	public List<NewsComms> queryNewsComms(int id);
	public List<NewsComms> personalNewsComms(int id);
}
