package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.PharmacyUserDao;
import com.spring.domain.PharmacyUser;

@Repository
public class PharmacyUserDaoImpl extends MedicationBaseDaoImpl<PharmacyUser> implements PharmacyUserDao {
	
	@Override
	public PharmacyUser getPharmacyUserByName(String pharmacyUserName) {
		// TODO Auto-generated method stub
		String hql = "select u from com.spring.domain.PharmacyUser u where u.pharmacyUserName='" + pharmacyUserName + "'";
		
		List<PharmacyUser> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list.get(0);
		}else{
			return null;
		}
	}

	@Override
	public PharmacyUser getPharmacyUserById(int pharmacyUserId) {
		// TODO Auto-generated method stub
		return this.selectById(pharmacyUserId);
	}

	@Override
	public List<PharmacyUser> getAllPharmacyUsers() {
		// TODO Auto-generated method stub
		String hql = "select u from com.spring.domain.PharmacyUser";
		
		List<PharmacyUser> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public void addPharmacyUser(PharmacyUser pharmacyUser) {
		// TODO Auto-generated method stub
		this.create(pharmacyUser);
	}

	@Override
	public void updatePharmacyUser(PharmacyUser pharmacyUser) {
		// TODO Auto-generated method stub
		this.update(pharmacyUser);
	}

	@Override
	public void deletePharmacyUser(PharmacyUser pharmacyUser) {
		// TODO Auto-generated method stub
		this.delete(pharmacyUser);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getPharmacyUserCount() {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.PharmacyUser";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}
	
	
	
	
	
	
	
	
	
	
	
}
