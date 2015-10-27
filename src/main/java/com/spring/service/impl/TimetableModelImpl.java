package com.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.TimetableDao;
import com.spring.domain.Timetable;
import com.spring.service.TimetableModel;
@Service(value="timetableService")

public class TimetableModelImpl extends BaseModelImpl<Timetable> implements TimetableModel{
	@Resource(name="timetableDao")
	private TimetableDao timetableDao;

	@Override
	public List<Timetable> queryTimetable(int id) {
		// TODO Auto-generated method stub
		return timetableDao.queryTimetable(id);
	}

}
