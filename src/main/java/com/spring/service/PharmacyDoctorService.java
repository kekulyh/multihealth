package com.spring.service;

import java.util.List;

import com.spring.domain.PharmacyDoctor;

public interface PharmacyDoctorService extends MedicationBaseService<PharmacyDoctor> {
	
	//add pharmacy doctor
	public void addPharmacyDoctor(PharmacyDoctor pharmacyDoctor);
	
	//update pharmacy doctor
	public void updatePharmacyDoctor(PharmacyDoctor pharmacyDoctor);
	
	//delete pharmacy doctor
	public void deletePharmacyDoctor(PharmacyDoctor pharmacyDoctor);
	
	//get doctor by name
	public List<PharmacyDoctor> searchPharmacyDoctorName(PharmacyDoctor pharmacyDoctor);
	
	//get doctor by specialty
	public List<PharmacyDoctor> searchPharmacyDoctorSpecialty(PharmacyDoctor pharmacyDoctor);
	
	//get doctor by pharmacy
	public List<PharmacyDoctor> searchPharmacyDoctorPharmacy(PharmacyDoctor pharmacyDoctor);
	
	//get doctor by id
	public PharmacyDoctor getPharmacyDoctor(int pharmacyDoctorId);
	
	//get all doctors
	public List<PharmacyDoctor> PharmacyDoctorList();
	
	//get doctor by name
	public PharmacyDoctor getPharmacyDoctorByName(String pharmacyDoctorName);
	
	
}
