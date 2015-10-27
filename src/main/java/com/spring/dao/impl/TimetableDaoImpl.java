package com.spring.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.spring.dao.TimetableDao;
import com.spring.domain.Admin;
import com.spring.domain.Timetable;
@Repository(value="timetableDao")
public class TimetableDaoImpl extends BaseDaoImpl<Timetable> implements TimetableDao{

	@Override
	public List<Timetable> queryTimetable(int id) {
		String hql =  "select a from com.spring.domain.Timetable a where a.doctor.id="+id;
		List<Timetable>list = this.queryAll(hql);
		if(list != null && list.size()>0){
			return list;
		}
		return null;
	}
	

}
