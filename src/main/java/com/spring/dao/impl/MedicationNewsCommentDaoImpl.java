package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.MedicationNewsCommentDao;
import com.spring.domain.MedicationNewsComment;

@Repository
public class MedicationNewsCommentDaoImpl extends MedicationBaseDaoImpl<MedicationNewsComment> implements MedicationNewsCommentDao {

	@Override
	public void addNewsComment(MedicationNewsComment medicationNewsComment) {
		// TODO Auto-generated method stub
		this.create(medicationNewsComment);
	}

	@Override
	public void updateNewsComment(MedicationNewsComment medicationNewsComment) {
		// TODO Auto-generated method stub
		this.update(medicationNewsComment);
	}

	@Override
	public void deleteNewsComment(MedicationNewsComment medicationNewsComment) {
		// TODO Auto-generated method stub
		this.delete(medicationNewsComment);
	}

	@Override
	public MedicationNewsComment getNewsComment(int medicationNewsCommentId) {
		// TODO Auto-generated method stub
		return this.selectById(medicationNewsCommentId);
	}

	@Override
	public List<MedicationNewsComment> getNewsCommentByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.MedicationNewsComment c where c.pharmacyUser='" + pharmacyUserId + "'";
		
		List<MedicationNewsComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public List<MedicationNewsComment> getNewsCommentByNewsId(int medicationNewsId) {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.MedicationNewsComment c where c.medicationNews='" + medicationNewsId + "'";
		
		List<MedicationNewsComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public List<MedicationNewsComment> getAllComment() {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.MedicationNewsComment c";
		
		List<MedicationNewsComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}
	
	//hibernatetemplate 批量删除
	@Override
	public void deleteAllNewsCommentOfNewsId(int medicationNewsId) {
		// TODO Auto-generated method stub
		
	}
	
	//hibernatetemplate 批量删除
	@Override
	public void deleteNewsCommentOfPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("rawtypes")
	@Override
	public int getNewsCommentCountByNewsId(int medicationNewsId) {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.MedicationNewsComment c where c.medicationNews='" + medicationNewsId + "'";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public int getNewsCommentCountByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.MedicationNewsComment c where c.pharmacyUser='" + pharmacyUserId + "'";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public int getAllNewsCommentNumber() {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.MedicationNewsComment";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

}
