package com.spring.dao;

import java.util.List;

import com.spring.domain.MedicineComment;

public interface MedicineCommentDao extends MedicationBaseDao<MedicineComment> {
	
	//add comment
	public void addMedicineComment(MedicineComment medicineComment);
	
	//update comment
	public void updateMedicineComment(MedicineComment medicineComment);
	
	//delete comment
	public void deleteMedicineComment(MedicineComment medicineComment);
	
	//get comment
	public MedicineComment getMedicineComment(int medicineCommentId);
	
	
	//get all the comments by pharmacy user id
	public List<MedicineComment> getMedicineCommentByPharmacyUserId(int pharmacyUserId);
	
	//get all the comments by medicine id
	public List<MedicineComment> getMedicineCommentByMedicineId(int medicineId);
	
	
	//get all the comments
	public List<MedicineComment> getAllComment();
	
	
	//delete comment under the specific medicine
	public void deleteAllMedicineCommentOfMedicineId(int medicineId);
	
	//delete comment of user 
	public void deleteMedicineCommentOfPharmacyUserId(int pharmacyUserId);	
	
	
	//get comment count by medicine id
	public int getMedicineCommentCountByMedicineId(int medicineId);
	
	//get comment count by user id
	public int getMedicineCommentCountByPharmacyUserId(int pharmacyUserId);
	
	//get all the medicine comment number
	public int getAllMedicineCommentNumber();
	
	//get comments by medicine id on a page 
	public List<MedicineComment> getMedicineCommentOnPageByMedicineId(int medicineId, int page, int everyPageAmount);
	
	
	
}
