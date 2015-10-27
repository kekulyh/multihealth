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
@Table(name="multihealthmedicine_medicationnewscomment")
public class MedicationNewsComment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicationnewscomment_id")
	private int medicationNewsCommentId;
	
	private String medicationNewsCommentUser;
	
	private String medicationNewsCommentDate;
	
	private String medicationNewsCommentContent;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=(CascadeType.ALL))
	@JoinColumn(name="medicationnews_id")
	private MedicationNews medicationNews; 
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=(CascadeType.ALL))
	@JoinColumn(name="pharmacyuser_id")
	private PharmacyUser pharmacyUser;

	
	
	public int getMedicationNewsCommentId() {
		return medicationNewsCommentId;
	}

	public void setMedicationNewsCommentId(int medicationNewsCommentId) {
		this.medicationNewsCommentId = medicationNewsCommentId;
	}

	public String getMedicationNewsCommentUser() {
		return medicationNewsCommentUser;
	}

	public void setMedicationNewsCommentUser(String medicationNewsCommentUser) {
		this.medicationNewsCommentUser = medicationNewsCommentUser;
	}

	public String getMedicationNewsCommentDate() {
		return medicationNewsCommentDate;
	}

	public void setMedicationNewsCommentDate(String medicationNewsCommentDate) {
		this.medicationNewsCommentDate = medicationNewsCommentDate;
	}

	public String getMedicationNewsCommentContent() {
		return medicationNewsCommentContent;
	}

	public void setMedicationNewsCommentContent(String medicationNewsCommentContent) {
		this.medicationNewsCommentContent = medicationNewsCommentContent;
	}

	public MedicationNews getMedicationNews() {
		return medicationNews;
	}

	public void setMedicationNews(MedicationNews medicationNews) {
		this.medicationNews = medicationNews;
	}

	public PharmacyUser getPharmacyUser() {
		return pharmacyUser;
	}

	public void setPharmacyUser(PharmacyUser pharmacyUser) {
		this.pharmacyUser = pharmacyUser;
	}

	
	
	
	
	
	
}
