package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.ConsultationDao;
import com.spring.domain.ConsultComms;
import com.spring.domain.Consultation;
@Repository(value="consultDao")
public class ConsultationDaoImpl extends BaseDaoImpl<Consultation> implements ConsultationDao{

	@Override
	public List<Consultation> personalConList(int id) {
		String hql =  "select a from com.spring.domain.Consultation a where a.user.id="+id;
		List<Consultation> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	@Override
	public List<Consultation> searchConsultByTitle(String str) {
		String hql = "select u from com.spring.domain.Consultation u where u.title like '%"+ str +"%'";
		List<Consultation> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	

}
