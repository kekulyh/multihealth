package com.spring.service;

import java.util.List;

import com.spring.domain.ConsultComms;

public interface ConsultCommsModel extends BaseModel<ConsultComms>{
	public List<ConsultComms> queryConComms(int id);
	public List<ConsultComms> personalConComms(int id);
}
