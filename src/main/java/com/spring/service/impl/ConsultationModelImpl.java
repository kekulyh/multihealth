package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.spring.dao.ConsultationDao;
import com.spring.domain.Consultation;
import com.spring.service.ConsultationModel;
@Service(value="consultService")

public class ConsultationModelImpl extends BaseModelImpl<Consultation>implements ConsultationModel {
	@Resource(name = "consultDao")
	private ConsultationDao consultDao;

	@Override
	public List<Consultation> personalConList(int id) {
		// TODO Auto-generated method stub
		return consultDao.personalConList(id);
	}

	@Override
	public List<Consultation> searchConsultByTitle(String str) {
		// TODO Auto-generated method stub
		return consultDao.searchConsultByTitle(str);
	}
	
}
