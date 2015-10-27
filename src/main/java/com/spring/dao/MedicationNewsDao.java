package com.spring.dao;

import java.util.List;

import com.spring.domain.MedicationNews;

public interface MedicationNewsDao extends MedicationBaseDao<MedicationNews> {
	
	//get all the news
	public List<MedicationNews> medicationNewsList();
	
	//get news by id
	public MedicationNews getMedicationNews(int medicationNewsId);
	
	//add news
	public void addMedicationNews(MedicationNews medicationNews);
	
	//update news
	public void updateMedicationNews(MedicationNews medicationNews);
	
	//delete news
	public void deleteMedicationNews(MedicationNews medicationNews);
	
	//get news page
	public List<MedicationNews> medicationNewsListPage(int page, int everyPageAmount);
	
	//get news count
	public int getMedicationNewsCount();
	
	//get news by title
	public MedicationNews getMedicationNewsByTitle(MedicationNews medicationNews);
	
}
