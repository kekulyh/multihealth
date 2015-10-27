package com.spring.service;

import java.util.List;

import com.spring.domain.Consultation;

public interface ConsultationModel extends BaseModel<Consultation>{
	public List<Consultation> personalConList(int id);
	List<Consultation> searchConsultByTitle(String str);
}
