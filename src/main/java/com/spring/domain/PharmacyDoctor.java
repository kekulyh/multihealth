package com.spring.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="multihealthmedicine_pharmacydoctor")
public class PharmacyDoctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pharmacydoctor_id")
	private int pharmacyDoctorId;
	
	private String pharmacyDoctorName;
	
	private String pharmacyDoctorAge;
	
	private String pharmacyDoctorGender;
	
	private String pharmacyDoctorSpecialty;
	
	private String pharmacyDoctorTel;
	
	private String pharmacyDoctorPharmacy;
	
	private String pharmacyDoctorPharmacyAddress;
	
	private String pharmacyDoctorDescription;
	
	private String pharmacyDoctorImage;
	
	private int pharmacyDoctorCommentCount;
	
	
	
	/** OneToOne Doctor */
	@OneToOne(optional = false, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "doctor_id", referencedColumnName = "Id", unique = true)
	private Doctor doctor;
	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="pharmacyDoctor")
	
	
	
	public int getPharmacyDoctorId() {
		return pharmacyDoctorId;
	}

	public void setPharmacyDoctorId(int pharmacyDoctorId) {
		this.pharmacyDoctorId = pharmacyDoctorId;
	}

	public String getPharmacyDoctorName() {
		return pharmacyDoctorName;
	}

	public void setPharmacyDoctorName(String pharmacyDoctorName) {
		this.pharmacyDoctorName = pharmacyDoctorName;
	}

	public String getPharmacyDoctorAge() {
		return pharmacyDoctorAge;
	}

	public void setPharmacyDoctorAge(String pharmacyDoctorAge) {
		this.pharmacyDoctorAge = pharmacyDoctorAge;
	}

	public String getPharmacyDoctorGender() {
		return pharmacyDoctorGender;
	}

	public void setPharmacyDoctorGender(String pharmacyDoctorGender) {
		this.pharmacyDoctorGender = pharmacyDoctorGender;
	}

	public String getPharmacyDoctorSpecialty() {
		return pharmacyDoctorSpecialty;
	}

	public void setPharmacyDoctorSpecialty(String pharmacyDoctorSpecialty) {
		this.pharmacyDoctorSpecialty = pharmacyDoctorSpecialty;
	}

	public String getPharmacyDoctorTel() {
		return pharmacyDoctorTel;
	}

	public void setPharmacyDoctorTel(String pharmacyDoctorTel) {
		this.pharmacyDoctorTel = pharmacyDoctorTel;
	}
	
	public String getPharmacyDoctorPharmacy() {
		return pharmacyDoctorPharmacy;
	}

	public void setPharmacyDoctorPharmacy(String pharmacyDoctorPharmacy) {
		this.pharmacyDoctorPharmacy = pharmacyDoctorPharmacy;
	}
	
	public String getPharmacyDoctorPharmacyAddress() {
		return pharmacyDoctorPharmacyAddress;
	}

	public void setPharmacyDoctorPharmacyAddress(String pharmacyDoctorPharmacyAddress) {
		this.pharmacyDoctorPharmacyAddress = pharmacyDoctorPharmacyAddress;
	}

	public String getPharmacyDoctorDescription() {
		return pharmacyDoctorDescription;
	}

	public void setPharmacyDoctorDescription(String pharmacyDoctorDescription) {
		this.pharmacyDoctorDescription = pharmacyDoctorDescription;
	}

	public String getPharmacyDoctorImage() {
		return pharmacyDoctorImage;
	}

	public void setPharmacyDoctorImage(String pharmacyDoctorImage) {
		this.pharmacyDoctorImage = pharmacyDoctorImage;
	}

	public int getPharmacyDoctorCommentCount() {
		return pharmacyDoctorCommentCount;
	}

	public void setPharmacyDoctorCommentCount(int pharmacyDoctorCommentCount) {
		this.pharmacyDoctorCommentCount = pharmacyDoctorCommentCount;
	}

	
	
	
	
}
