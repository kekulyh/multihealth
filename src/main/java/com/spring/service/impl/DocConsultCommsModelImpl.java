package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.DocConsultCommDao;
import com.spring.domain.ConsultComms;
import com.spring.domain.DocConsultComm;
import com.spring.service.DocConsultCommModel;
@Service(value="docconcommsService")
public class DocConsultCommsModelImpl extends BaseModelImpl<DocConsultComm> implements DocConsultCommModel{
	@Resource(name="docconcommsDao")
	private DocConsultCommDao docconcommsDao;

	@Override
	public List<DocConsultComm> queryDocConComms(int id) {
	
		return docconcommsDao.queryDocConComms(id);
	}

	@Override
	public List<DocConsultComm> docConComms(int id) {
		// TODO Auto-generated method stub
		return docconcommsDao.docConComms(id);
	}

	
	
	
}
