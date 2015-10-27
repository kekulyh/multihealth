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
@Table(name="multihealthmedicine_pharmacydoctorcomment")
public class PharmacyDoctorComment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pharmacydoctorcomment_id")
	private int pharmacyDoctorCommentId;
	
	private String pharmacyDoctorCommentUser;
	
	private String pharmacyDoctorCommentDate;
	
	private String pharmacyDoctorCommentContent;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=(CascadeType.ALL))
	@JoinColumn(name="pharmacydoctor_id")
	private PharmacyDoctor pharmacyDoctor; 
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=(CascadeType.ALL))
	@JoinColumn(name="pharmacyuser_id")
	private PharmacyUser pharmacyUser;

	
	
	public int getPharmacyDoctorCommentId() {
		return pharmacyDoctorCommentId;
	}

	public void setPharmacyDoctorCommentId(int pharmacyDoctorCommentId) {
		this.pharmacyDoctorCommentId = pharmacyDoctorCommentId;
	}

	public String getPharmacyDoctorCommentUser() {
		return pharmacyDoctorCommentUser;
	}

	public void setPharmacyDoctorCommentUser(String pharmacyDoctorCommentUser) {
		this.pharmacyDoctorCommentUser = pharmacyDoctorCommentUser;
	}

	public String getPharmacyDoctorCommentDate() {
		return pharmacyDoctorCommentDate;
	}

	public void setPharmacyDoctorCommentDate(String pharmacyDoctorCommentDate) {
		this.pharmacyDoctorCommentDate = pharmacyDoctorCommentDate;
	}

	public String getPharmacyDoctorCommentContent() {
		return pharmacyDoctorCommentContent;
	}

	public void setPharmacyDoctorCommentContent(String pharmacyDoctorCommentContent) {
		this.pharmacyDoctorCommentContent = pharmacyDoctorCommentContent;
	}

	public PharmacyDoctor getPharmacyDoctor() {
		return pharmacyDoctor;
	}

	public void setPharmacyDoctor(PharmacyDoctor pharmacyDoctor) {
		this.pharmacyDoctor = pharmacyDoctor;
	}

	public PharmacyUser getPharmacyUser() {
		return pharmacyUser;
	}

	public void setPharmacyUser(PharmacyUser pharmacyUser) {
		this.pharmacyUser = pharmacyUser;
	}
	
	
	
}
