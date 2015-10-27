package com.spring.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="multihealthmedicine_medicationevents")
public class MedicationEvents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicationevents_id")
	private int medicationEventsId;
	
	private String medicationEventsTitle;
	
	private String medicationEventsContent;
	
	private String medicationEventsAddress;
	
	private String medicationEventsDate;
	
	private String medicationEventsImage;
	
	private String medicationEventsEditor;
	
	private String medicationEventsEditDate;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="medicationEvents")
	
	public int getMedicationEventsId() {
		return medicationEventsId;
	}

	public void setMedicationEventsId(int medicationEventsId) {
		this.medicationEventsId = medicationEventsId;
	}

	public String getMedicationEventsTitle() {
		return medicationEventsTitle;
	}

	public void setMedicationEventsTitle(String medicationEventsTitle) {
		this.medicationEventsTitle = medicationEventsTitle;
	}

	public String getMedicationEventsContent() {
		return medicationEventsContent;
	}

	public void setMedicationEventsContent(String medicationEventsContent) {
		this.medicationEventsContent = medicationEventsContent;
	}

	public String getMedicationEventsAddress() {
		return medicationEventsAddress;
	}

	public void setMedicationEventsAddress(String medicationEventsAddress) {
		this.medicationEventsAddress = medicationEventsAddress;
	}

	public String getMedicationEventsDate() {
		return medicationEventsDate;
	}

	public void setMedicationEventsDate(String medicationEventsDate) {
		this.medicationEventsDate = medicationEventsDate;
	}

	public String getMedicationEventsImage() {
		return medicationEventsImage;
	}

	public void setMedicationEventsImage(String medicationEventsImage) {
		this.medicationEventsImage = medicationEventsImage;
	}

	public String getMedicationEventsEditor() {
		return medicationEventsEditor;
	}

	public void setMedicationEventsEditor(String medicationEventsEditor) {
		this.medicationEventsEditor = medicationEventsEditor;
	}

	public String getMedicationEventsEditDate() {
		return medicationEventsEditDate;
	}

	public void setMedicationEventsEditDate(String medicationEventsEditDate) {
		this.medicationEventsEditDate = medicationEventsEditDate;
	}
	
	
	
	
}
