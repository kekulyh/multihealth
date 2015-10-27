package com.spring.dao;

import java.util.List;

import com.spring.domain.ConsultComms;

public interface ConsultCommsDao extends BaseDao<ConsultComms>{
	
	public List<ConsultComms> queryConComms(int id);
	public List<ConsultComms> personalConComms(int id);

}
