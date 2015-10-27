package com.spring.service;

import java.util.List;

import com.spring.domain.ConsultComms;
import com.spring.domain.DocConsultComm;

public interface DocConsultCommModel extends BaseModel<DocConsultComm>{
	public List<DocConsultComm> queryDocConComms(int id);
	public List<DocConsultComm> docConComms(int id);
}
