package com.spring.dao;

import java.util.List;

import com.spring.domain.MedicationEvents;

public interface MedicationEventsDao extends MedicationBaseDao<MedicationEvents> {
	
	//add event
	public void addMedicationEvents(MedicationEvents medicationEvents);
	
	//update event
	public void updateMedicationEvents(MedicationEvents medicationEvents);
	
	//delete event
	public void deleteMedicationEvents(MedicationEvents medicationEvents);
	
	//get event by id
	public MedicationEvents getMedicationEvents(int medicationEventsId);
	
	//get event list
	public List<MedicationEvents> medicationEventsList();
	
	//get events page
	public List<MedicationEvents> medicationEventsListPage(int page, int everyPageAmount);
	
	//get events count
	public int getMedicationEventsCount();
	
	//get event by title
	public MedicationEvents getMedicationEventsByTitle(MedicationEvents medicationEvents);
	
}
