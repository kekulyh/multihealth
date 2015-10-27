package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.MedicationNewsDao;
import com.spring.domain.MedicationNews;

@Repository
public class MedicationNewsDaoImpl extends MedicationBaseDaoImpl<MedicationNews> implements MedicationNewsDao {

	@Override
	public List<MedicationNews> medicationNewsList() {
		// TODO Auto-generated method stub
		String hql = "select n from com.spring.domain.MedicationNews n order by n.medicationNewsDate desc";
		
		List<MedicationNews> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public MedicationNews getMedicationNews(int medicationNewsId) {
		// TODO Auto-generated method stub
		return this.selectById(medicationNewsId);
	}

	@Override
	public void addMedicationNews(MedicationNews medicationNews) {
		// TODO Auto-generated method stub
		this.create(medicationNews);
	}

	@Override
	public void updateMedicationNews(MedicationNews medicationNews) {
		// TODO Auto-generated method stub
		this.update(medicationNews);
	}

	@Override
	public void deleteMedicationNews(MedicationNews medicationNews) {
		// TODO Auto-generated method stub
		this.delete(medicationNews);
	}
	
	//get news list by page
	@Override
	public List<MedicationNews> medicationNewsListPage(int page, int everyPageAmount) {
		// TODO Auto-generated method stub
		
		int start = ( (page - 1) * everyPageAmount ) ;
		int max = everyPageAmount;
		
		String hql = "select n from com.spring.domain.MedicationNews n order by n.medicationNewsDate desc";
		List<MedicationNews> list = this.findFirstToMaxCallback(hql, start, max);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getMedicationNewsCount() {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.MedicationNews n";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

	@Override
	public MedicationNews getMedicationNewsByTitle(MedicationNews medicationNews) {
		// TODO Auto-generated method stub
		String hql = "select n from com.spring.domain.MedicationNews n where n.medicationNewsTitle='+medicationNews.getMedicationNewsTitle()+'";
		
		List<MedicationNews> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			//medicineName已存在
			return list.get(0);
		}else{
			//medicineName不存在
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
}
