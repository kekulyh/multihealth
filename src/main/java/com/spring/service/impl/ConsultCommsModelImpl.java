package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.ConsultCommsDao;
import com.spring.domain.ConsultComms;
import com.spring.service.ConsultCommsModel;

@Service(value="concommsService")
public class ConsultCommsModelImpl extends BaseModelImpl<ConsultComms> implements ConsultCommsModel{
	@Resource(name="concommsDao")
	private ConsultCommsDao concommsDao;

	@Override
	public List<ConsultComms> queryConComms(int id) {
		return concommsDao.queryConComms(id);
	}

	@Override
	public List<ConsultComms> personalConComms(int id) {
		
		return concommsDao.personalConComms(id);
	}
}
