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
@Table(name="multihealthmedicine_pharmacyuser")
public class PharmacyUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pharmacyuser_id")
	private int pharmacyUserId;
	
	private String pharmacyUserName;

	
	/** OneToOne User */
	@OneToOne(optional = false, cascade = CascadeType.REFRESH)
	@JoinColumn(name = "user_id", referencedColumnName = "Id", unique = true)
	private User user;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="pharmacyUser")
	
	
	
	public int getPharmacyUserId() {
		return pharmacyUserId;
	}

	public void setPharmacyUserId(int pharmacyUserId) {
		this.pharmacyUserId = pharmacyUserId;
	}

	public String getPharmacyUserName() {
		return pharmacyUserName;
	}

	public void setPharmacyUserName(String pharmacyUserName) {
		this.pharmacyUserName = pharmacyUserName;
	}
	
	
	
	
	
	
	
}
