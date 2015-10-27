package com.spring.service;

import java.util.List;

import com.spring.domain.Medicine;

public interface MedicineService extends MedicationBaseService<Medicine> {
	
	//add medicine
	public void addMedicine(Medicine medicine);
	
	//update medicine
	public void updateMedicine(Medicine medicine);
	
	//delete medicine
	public void deleteMedicine(Medicine medicine);
	
	//get medicine by name
	public List<Medicine> searchMedicineName(Medicine medicine);
	
	//get medicine by symptom
	public List<Medicine> searchMedicineSymptom(Medicine medicine);
	
	//get medicine by id
	public Medicine getMedicine(int medicineId);
	
	//get medicine by name
	public Medicine getMedicineByName(Medicine medicine);
	
	//get medicine list
	public List<Medicine> medicineList();
	
	//get medicine comment count
	public List<Medicine> medicineCommentCountList();
	
}
