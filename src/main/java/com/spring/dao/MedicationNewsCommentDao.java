package com.spring.dao;

import java.util.List;

import com.spring.domain.MedicationNewsComment;

public interface MedicationNewsCommentDao extends MedicationBaseDao<MedicationNewsComment> {
	
	//add comment
	public void addNewsComment(MedicationNewsComment medicationNewsComment);
	
	//update comment
	public void updateNewsComment(MedicationNewsComment medicationNewsComment);
	
	//delete comment
	public void deleteNewsComment(MedicationNewsComment medicationNewsComment);
	
	//get comment
	public MedicationNewsComment getNewsComment(int medicationNewsCommentId);
	
	
	//get all the comments by pharmacy user id
	public List<MedicationNewsComment> getNewsCommentByPharmacyUserId(int pharmacyUserId);
	
	//get all the comments by news id
	public List<MedicationNewsComment> getNewsCommentByNewsId(int medicationNewsId);
	
	
	//get all the comments
	public List<MedicationNewsComment> getAllComment();
	
	
	//delete comment under the specific news
	public void deleteAllNewsCommentOfNewsId(int medicationNewsId);
	
	//delete comment of user 
	public void deleteNewsCommentOfPharmacyUserId(int pharmacyUserId);	
	
	
	//get comment count by news id
	public int getNewsCommentCountByNewsId(int medicationNewsId);
	
	//get comment count by user id
	public int getNewsCommentCountByPharmacyUserId(int pharmacyUserId);
	
	//get all the news comment number
	public int getAllNewsCommentNumber();
	
	

}
