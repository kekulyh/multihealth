package com.spring.service;

import java.util.List;

import com.spring.domain.Timetable;

public interface TimetableModel extends BaseModel<Timetable>{
	public List<Timetable> queryTimetable(int id);
}
