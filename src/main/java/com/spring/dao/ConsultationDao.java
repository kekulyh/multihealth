package com.spring.dao;

import java.util.List;

import com.spring.domain.Consultation;

public interface ConsultationDao extends BaseDao<Consultation>{
	
	public List<Consultation> personalConList(int id);
	public List<Consultation> searchConsultByTitle(String str);
}
