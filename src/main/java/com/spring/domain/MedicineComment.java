package com.spring.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="multihealthmedicine_medicinecomment")
public class MedicineComment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicinecomment_id")
	private int medicineCommentId;
	
	private String medicineCommentUser;
	
	private String medicineCommentDate;
	
	private String medicineCommentContent;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=(CascadeType.ALL))
	@JoinColumn(name="medicine_id")
	private Medicine medicine; 
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=(CascadeType.ALL))
	@JoinColumn(name="pharmacyuser_id")
	private PharmacyUser pharmacyUser;
	
	
	
	public int getMedicineCommentId() {
		return medicineCommentId;
	}

	public void setMedicineCommentId(int medicineCommentId) {
		this.medicineCommentId = medicineCommentId;
	}

	public String getMedicineCommentUser() {
		return medicineCommentUser;
	}

	public void setMedicineCommentUser(String medicineCommentUser) {
		this.medicineCommentUser = medicineCommentUser;
	}

	public String getMedicineCommentDate() {
		return medicineCommentDate;
	}

	public void setMedicineCommentDate(String medicineCommentDate) {
		this.medicineCommentDate = medicineCommentDate;
	}

	public String getMedicineCommentContent() {
		return medicineCommentContent;
	}

	public void setMedicineCommentContent(String medicineCommentContent) {
		this.medicineCommentContent = medicineCommentContent;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public PharmacyUser getPharmacyUser() {
		return pharmacyUser;
	}

	public void setPharmacyUser(PharmacyUser pharmacyUser) {
		this.pharmacyUser = pharmacyUser;
	}

	
	
	
	
	
	
	
	
}
