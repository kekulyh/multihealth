package com.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.spring.dao.NewsDao;
import com.spring.domain.News;
@Repository(value="newsDao")
public class NewsDaoImpl extends BaseDaoImpl<News> implements NewsDao{

}
