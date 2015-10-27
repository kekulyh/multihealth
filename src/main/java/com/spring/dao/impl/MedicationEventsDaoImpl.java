package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.MedicationEventsDao;
import com.spring.domain.MedicationEvents;
import com.spring.domain.Medicine;

@Repository
public class MedicationEventsDaoImpl extends MedicationBaseDaoImpl<MedicationEvents> implements MedicationEventsDao {

	@Override
	public void addMedicationEvents(MedicationEvents medicationEvents) {
		// TODO Auto-generated method stub
		this.create(medicationEvents);
	}

	@Override
	public void updateMedicationEvents(MedicationEvents medicationEvents) {
		// TODO Auto-generated method stub
		this.update(medicationEvents);
	}

	@Override
	public void deleteMedicationEvents(MedicationEvents medicationEvents) {
		// TODO Auto-generated method stub
		this.delete(medicationEvents);
	}

	@Override
	public MedicationEvents getMedicationEvents(int medicationEventsId) {
		// TODO Auto-generated method stub
		return this.selectById(medicationEventsId);
	}

	@Override
	public List<MedicationEvents> medicationEventsList() {
		// TODO Auto-generated method stub
		String hql = "select e from com.spring.domain.MedicationEvents e order by e.medicationEventsDate desc";
		
		List<MedicationEvents> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public List<MedicationEvents> medicationEventsListPage(int page, int everyPageAmount) {
		// TODO Auto-generated method stub
		int start = ( (page - 1) * everyPageAmount ) ;
		int max = everyPageAmount;
		
		String hql = "select e from com.spring.domain.MedicationEvents e order by e.medicationEventsDate desc";
		List<MedicationEvents> list = this.findFirstToMaxCallback(hql, start, max);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getMedicationEventsCount() {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.MedicationEvents e";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

	@Override
	public MedicationEvents getMedicationEventsByTitle(MedicationEvents medicationEvents) {
		// TODO Auto-generated method stub
		String hql = "select e from com.spring.domain.MedicationEvents e where e.medicationEventsTitle='+medicationEvents.getMedicationEventsTitle()+'";
		
		List<MedicationEvents> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			//medicineName已存在
			return list.get(0);
		}else{
			//medicineName不存在
			return null;
		}
	}

}
