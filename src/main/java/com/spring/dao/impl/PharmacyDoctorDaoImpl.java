package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.PharmacyDoctorDao;
import com.spring.domain.PharmacyDoctor;
import com.spring.domain.PharmacyUser;

@Repository
public class PharmacyDoctorDaoImpl extends MedicationBaseDaoImpl<PharmacyDoctor> implements PharmacyDoctorDao {
	
	@Override
	public void addPharmacyDoctor(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		this.create(pharmacyDoctor);
	}

	@Override
	public void updatePharmacyDoctor(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		this.update(pharmacyDoctor);
	}

	@Override
	public void deletePharmacyDoctor(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		this.delete(pharmacyDoctor);
	}
	
	@Override
	public List<PharmacyDoctor> searchPharmacyDoctorName(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		String hql = "select d from com.spring.domain.PharmacyDoctor d where d.pharmacyDoctorName like '%" + pharmacyDoctor.getPharmacyDoctorName() + "%' order by d.pharmacyDoctorName";
		
		List<PharmacyDoctor> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			//doctorName已存在
			return list;
		}else{
			//doctorName不存在
			return null;
		}
	}

	@Override
	public List<PharmacyDoctor> searchPharmacyDoctorSpecialty(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		String hql = "select d from com.spring.domain.PharmacyDoctor d where d.pharmacyDoctorSpecialty like '%" + pharmacyDoctor.getPharmacyDoctorSpecialty() + "%' order by d.pharmacyDoctorName";
		
		List<PharmacyDoctor> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			//doctorSpecialty已存在
			return list;
		}else{
			//doctorSpecialty不存在
			return null;
		}
	}

	@Override
	public List<PharmacyDoctor> searchPharmacyDoctorPharmacy(PharmacyDoctor pharmacyDoctor) {
		// TODO Auto-generated method stub
		String hql = "select d from com.spring.domain.PharmacyDoctor d where d.pharmacyDoctorPharmacy like '%" + pharmacyDoctor.getPharmacyDoctorPharmacy() + "%'";
		
		List<PharmacyDoctor> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			//doctorAddress已存在
			return list;
		}else{
			//doctorAddress存在
			return null;
		}
	}

	@Override
	public PharmacyDoctor getPharmacyDoctor(int pharmacyDoctorId) {
		// TODO Auto-generated method stub
		return this.selectById(pharmacyDoctorId);
	}

	@Override
	public List<PharmacyDoctor> PharmacyDoctorList() {
		// TODO Auto-generated method stub
		String hql = "select d from com.spring.domain.PharmacyDoctor d order by d.pharmacyDoctorName";
		
		List<PharmacyDoctor> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			
			return list;
		}else{
			
			return null;
		}
	}

	@Override
	public PharmacyDoctor getPharmacyDoctorByName(String pharmacyDoctorName) {
		// TODO Auto-generated method stub
		String hql = "select d from com.spring.domain.PharmacyDoctor d where d.pharmacyDoctorName='" + pharmacyDoctorName + "'";
		
		List<PharmacyDoctor> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list.get(0);
		}else{
			return null;
		}
	}

	
	
	
	
	
	
	
	
}
