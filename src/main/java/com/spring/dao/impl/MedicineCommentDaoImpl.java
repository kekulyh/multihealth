package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.MedicineCommentDao;
import com.spring.domain.MedicineComment;

@Repository
public class MedicineCommentDaoImpl extends MedicationBaseDaoImpl<MedicineComment> implements MedicineCommentDao {

	@Override
	public void addMedicineComment(MedicineComment medicineComment) {
		// TODO Auto-generated method stub
		this.create(medicineComment);
	}

	@Override
	public void updateMedicineComment(MedicineComment medicineComment) {
		// TODO Auto-generated method stub
		this.update(medicineComment);
	}

	@Override
	public void deleteMedicineComment(MedicineComment medicineComment) {
		// TODO Auto-generated method stub
		this.delete(medicineComment);
	}

	@Override
	public MedicineComment getMedicineComment(int medicineCommentId) {
		// TODO Auto-generated method stub
		return this.selectById(medicineCommentId);
	}

	@Override
	public List<MedicineComment> getMedicineCommentByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.MedicineComment c where c.pharmacyUser='" + pharmacyUserId + "'";
		
		List<MedicineComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public List<MedicineComment> getMedicineCommentByMedicineId(int medicineId) {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.MedicineComment c where c.medicine='" + medicineId + "'";
		
		List<MedicineComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	@Override
	public List<MedicineComment> getAllComment() {
		// TODO Auto-generated method stub
		String hql = "select c from com.spring.domain.MedicineComment c";
		
		List<MedicineComment> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

	//hibernatetemplate 批量删除
	@Override
	public void deleteAllMedicineCommentOfMedicineId(int medicineId) {
		// TODO Auto-generated method stub
		
	}

	//hibernatetemplate 批量删除
	@Override
	public void deleteMedicineCommentOfPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getMedicineCommentCountByMedicineId(int medicineId) {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.MedicineComment c where c.medicine='" + medicineId + "'";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getMedicineCommentCountByPharmacyUserId(int pharmacyUserId) {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.MedicineComment c where c.pharmacyUser='" + pharmacyUserId + "'";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

	@SuppressWarnings("rawtypes")
	@Override
	public int getAllMedicineCommentNumber() {
		// TODO Auto-generated method stub
		String hql="select count(*) from com.spring.domain.MedicineComment";
		List list = this.findAll(hql);
		
		return Integer.parseInt( list.get(0).toString() );
	}

	@Override
	public List<MedicineComment> getMedicineCommentOnPageByMedicineId(int medicineId, int page, int everyPageAmount) {
		// TODO Auto-generated method stub

		int start = ( (page - 1) * everyPageAmount ) ;
		int max = everyPageAmount;
		
		String hql = "select c from com.spring.domain.MedicineComment c where c.medicine='" + medicineId + "'";
		List<MedicineComment> list = this.findFirstToMaxCallback(hql, start, max);
		
		if (list != null && list.size()>0) {
			return list;
		}else{
			return null;
		}
	}

}
