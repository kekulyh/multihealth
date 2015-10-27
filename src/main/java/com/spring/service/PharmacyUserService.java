package com.spring.service;

import java.util.List;

import com.spring.domain.PharmacyUser;

public interface PharmacyUserService extends MedicationBaseService<PharmacyUser> {
	
	//get user by name
	public PharmacyUser getPharmacyUserByName(String pharmacyUserName);
	
	//get user by id
	public PharmacyUser getPharmacyUserById(int pharmacyUserId);
	
	//get all users
	public List<PharmacyUser> getAllPharmacyUsers();
	
	//add user
	public void addPharmacyUser(PharmacyUser pharmacyUser);
	
	//update user
	public void updatePharmacyUser(PharmacyUser pharmacyUser);
	
	//delete user
	public void deletePharmacyUser(PharmacyUser pharmacyUser);
	
	//get users count
	public int getPharmacyUserCount();
	
	
	
}
