package com.spring.dao;

import java.util.List;

import com.spring.domain.PharmacyDoctorComment;

public interface PharmacyDoctorCommentDao extends MedicationBaseDao<PharmacyDoctorComment> {
	
	//add comment
	public void addPharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment);
	
	//update comment
	public void updatePharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment);
	
	//delete comment
	public void deletePharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment);
	
	//get comment
	public PharmacyDoctorComment getPharmacyDoctorComment(int pharmacyDoctorCommentId);
	
	
	//get all the comments by pharmacy user id
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentByPharmacyUserId(int pharmacyUserId);
	
	//get all the comments by pharmacy doctor id
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentByPharmacyDoctorId(int pharmacyDoctorId);
	
	
	//get all the comments
	public List<PharmacyDoctorComment> getAllComment();
	
	
	//delete comment under the specific pharmacy doctor
	public void deleteAllPharmacyDoctorCommentOfPharmacyDoctorId(int pharmacyDoctorId);
	
	//delete comment of user 
	public void deletePharmacyDoctorCommentOfPharmacyUserId(int pharmacyUserId);	
	
	
	//get comment count by pharmacy doctor id
	public int getPharmacyDoctorCommentCountByPharmacyDoctorId(int pharmacyDoctorId);
	
	//get comment count by user id
	public int getPharmacyDoctorCommentCountByPharmacyUserId(int pharmacyUserId);
	
	//get all the pharmacy doctor comment number
	public int getAllPharmacyDoctorCommentNumber();
	
	//get comments by doctor id on a page 
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentOnPageByPharmacyDoctorId(int pharmacyDoctorId, int page, int everyPageAmount);
	
	
}
