package com.spring.dao;

import java.util.List;

import com.spring.domain.DocConsultComm;

public interface DocConsultCommDao extends BaseDao<DocConsultComm>{
	
	public List<DocConsultComm> queryDocConComms(int id);
	public List<DocConsultComm> docConComms(int id);

}
