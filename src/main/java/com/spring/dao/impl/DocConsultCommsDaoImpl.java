package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.DocConsultCommDao;
import com.spring.domain.ConsultComms;
import com.spring.domain.DocConsultComm;
@Repository(value="docconcommsDao")
public class DocConsultCommsDaoImpl extends BaseDaoImpl<DocConsultComm> implements DocConsultCommDao{

	@Override
	public List<DocConsultComm> queryDocConComms(int id) {
		String hql =  "select a from com.spring.domain.DocConsultComm a where a.consult.id="+id;
		List<DocConsultComm> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	@Override
	public List<DocConsultComm> docConComms(int id) {
		String hql =  "select a from com.spring.domain.DocConsultComm a where a.doctor.id="+id;
		List<DocConsultComm> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

}
