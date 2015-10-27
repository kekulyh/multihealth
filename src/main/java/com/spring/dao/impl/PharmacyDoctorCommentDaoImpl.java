package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.PharmacyDoctorCommentDao;
import com.spring.domain.PharmacyDoctorComment;

@Repository
public class PharmacyDoctorCommentDaoImpl extends MedicationBaseDaoImpl<PharmacyDoctorComment> implements PharmacyDoctorCommentDao {

	@Override
	public void addPharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment) {
		// TODO Auto-generated method stub
		this.create(pharmacyDoctorComment);
	}

	@Override
	public void updatePharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment) {
		// TODO Auto-generated method stub
		this.update(pharmacyDoctorComment);
	}

	@Override
	public void deletePharmacyDoctorComment(PharmacyDoctorComment pharmacyDoctorComment) {
		// TODO Auto-generated method stub
		this.delete(pharmacyDoctorComment);
	}

	@Override
	public PharmacyDoctorComment getPharmacyDoctorComment(int pharmacyDoctorCommentId) {
		// TODO Auto-generated method stub
		return this.selectById(pharmacyDoctorCommentId);
	}

	@Override
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.PharmacyDoctorComment c where c.pharmacyUser='" + pharmacyUserId + "'";
		
		List<PharmacyDoctorComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentByPharmacyDoctorId(int pharmacyDoctorId) {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.PharmacyDoctorComment c where c.pharmacyDoctor='" + pharmacyDoctorId + "'";
		
		List<PharmacyDoctorComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public List<PharmacyDoctorComment> getAllComment() {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.PharmacyDoctorComment c";
		
		List<PharmacyDoctorComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	//hibernatetemplate 批量删除
	@Override
	public void deleteAllPharmacyDoctorCommentOfPharmacyDoctorId(int pharmacyDoctorId) {
		// TODO Auto-generated method stub
		
	}

	//hibernatetemplate 批量删除
	@Override
	public void deletePharmacyDoctorCommentOfPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getPharmacyDoctorCommentCountByPharmacyDoctorId(int pharmacyDoctorId) {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.PharmacyDoctorComment c where c.pharmacyDoctor='" + pharmacyDoctorId + "'";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getPharmacyDoctorCommentCountByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.PharmacyDoctorComment c where c.pharmacyUser='" + pharmacyUserId + "'";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getAllPharmacyDoctorCommentNumber() {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.PharmacyDoctorComment";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

	@Override
	public List<PharmacyDoctorComment> getPharmacyDoctorCommentOnPageByPharmacyDoctorId(int pharmacyDoctorId, int page,
			int everyPageAmount) {
		// TODO Auto-generated method stub
		int start = ( (page - 1) * everyPageAmount ) ;
		int max = everyPageAmount;
		
		String hql = "select c from com.spring.domain.PharmacyDoctorComment c where c.pharmacyDoctor='" + pharmacyDoctorId + "'";
		List<PharmacyDoctorComment> list = this.findFirstToMaxCallback(hql, start, max);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}
	
	
}
