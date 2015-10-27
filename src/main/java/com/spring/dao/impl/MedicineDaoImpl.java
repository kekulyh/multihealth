package com.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.dao.MedicineDao;
import com.spring.domain.Medicine;

@Repository
public class MedicineDaoImpl extends MedicationBaseDaoImpl<Medicine> implements MedicineDao {
	
	@Override
	public void addMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		this.create(medicine);
	}

	@Override
	public void updateMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		this.update(medicine);
	}

	@Override
	public void deleteMedicine(Medicine medicine) {
		// TODO Auto-generated method stub
		this.delete(medicine);
	}
	
	@Override
	public List<Medicine> searchMedicineName(Medicine medicine) {
		// TODO Auto-generated method stub
		String hql = "select m from com.spring.domain.Medicine m where m.medicineName like '%" + medicine.getMedicineName() + "%' order by m.medicineName";
		
		List<Medicine> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			//medicineName已存在
			return list;
		}else{
			//medicineName不存在
			return null;
		}
	}
	
	@Override
	public List<Medicine> searchMedicineSymptom(Medicine medicine) {
		// TODO Auto-generated method stub
		String hql = "select m from com.spring.domain.Medicine m where m.medicineSymptom like '%" + medicine.getMedicineSymptom() + "%' order by m.medicineName";
		
		List<Medicine> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			//medicineSymptom已存在
			return list;
		}else{
			//medicineSymptom不存在
			return null;
		}
	}
	
	@Override
	public Medicine getMedicine(int medicineId) {
		// TODO Auto-generated method stub
		return this.selectById(medicineId);
	}
	
	@Override
	public List<Medicine> medicineList() {
		// TODO Auto-generated method stub
		String hql = "select m from com.spring.domain.Medicine m order by m.medicineName";
		
		List<Medicine> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {			
			return list;
		}else{
			return null;
		}
	}

	@Override
	public List<Medicine> medicineCommentCountList() {
		// TODO Auto-generated method stub
		
//		//find first to max using HibernateCallback
		String hql = "select m from com.spring.domain.Medicine m order by m.medicineCommentCount desc";
		List<Medicine> list = this.findFirstToMaxCallback(hql, 0, 10);
		
		//find first to max using findByCriteria
//		List<Medicine> list = this.findFirstToMaxCriteria(0, 10);
		
		if (list != null && list.size()>0) {			
			return list;
		}else{
			return null;
		}
		
	}

	@Override
	public Medicine getMedicineByName(Medicine medicine) {
		// TODO Auto-generated method stub
		String hql = "select m from com.spring.domain.Medicine m where m.medicineName='+medicine.getMedicineName()+'";
		
		List<Medicine> list = this.findAll(hql);
		
		if (list != null && list.size()>0) {
			//medicineName已存在
			return list.get(0);
		}else{
			//medicineName不存在
			return null;
		}
	}

	
	
	
	
	
}
