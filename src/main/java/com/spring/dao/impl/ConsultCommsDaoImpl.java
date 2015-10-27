package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.ConsultCommsDao;
import com.spring.domain.ConsultComms;
@Repository(value="concommsDao")
public class ConsultCommsDaoImpl extends BaseDaoImpl<ConsultComms> implements ConsultCommsDao{

	@Override
	public List<ConsultComms> queryConComms(int id) {
		String hql =  "select a from com.spring.domain.ConsultComms a where a.consult.id="+id;
		List<ConsultComms> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

	@Override
	public List<ConsultComms> personalConComms(int id) {
		String hql =  "select a from com.spring.domain.ConsultComms a where a.user.id="+id;
		List<ConsultComms> list = this.queryAll(hql);
		if(list.size()>0 && list != null){
			return list;
		}
		return null;
	}

}
