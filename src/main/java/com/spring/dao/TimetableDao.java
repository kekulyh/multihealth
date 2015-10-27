package com.spring.dao;

import java.util.List;

import com.spring.domain.Timetable;

public interface TimetableDao extends BaseDao<Timetable>{
	public List<Timetable> queryTimetable(int id);

}
