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
@Table(name="multihealthmedicine_medicine")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicine_id")
	private int medicineId;
	
	private String medicineName;
	
	private String medicineSymptom;
	
	private String medicineUsage;
	
	private String medicineSideEffect;
	
	private String medicineOverdoseEffect;
	
	private String medicinePrecaution;
	
	private String medicineImage;
	
	private int medicineCommentCount;
	
	private String medicineEditor;
	
	private String medicineEditDate;
	
	
	
	
	
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="medicine")
	
	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getMedicineSymptom() {
		return medicineSymptom;
	}

	public void setMedicineSymptom(String medicineSymptom) {
		this.medicineSymptom = medicineSymptom;
	}

	public String getMedicineUsage() {
		return medicineUsage;
	}

	public void setMedicineUsage(String medicineUsage) {
		this.medicineUsage = medicineUsage;
	}

	public String getMedicineSideEffect() {
		return medicineSideEffect;
	}

	public void setMedicineSideEffect(String medicineSideEffect) {
		this.medicineSideEffect = medicineSideEffect;
	}

	public String getMedicineOverdoseEffect() {
		return medicineOverdoseEffect;
	}

	public void setMedicineOverdoseEffect(String medicineOverdoseEffect) {
		this.medicineOverdoseEffect = medicineOverdoseEffect;
	}

	public String getMedicinePrecaution() {
		return medicinePrecaution;
	}

	public void setMedicinePrecaution(String medicinePrecaution) {
		this.medicinePrecaution = medicinePrecaution;
	}

	public String getMedicineImage() {
		return medicineImage;
	}

	public void setMedicineImage(String medicineImage) {
		this.medicineImage = medicineImage;
	}

	public int getMedicineCommentCount() {
		return medicineCommentCount;
	}

	public void setMedicineCommentCount(int medicineCommentCount) {
		this.medicineCommentCount = medicineCommentCount;
	}

	public String getMedicineEditor() {
		return medicineEditor;
	}

	public void setMedicineEditor(String medicineEditor) {
		this.medicineEditor = medicineEditor;
	}

	public String getMedicineEditDate() {
		return medicineEditDate;
	}

	public void setMedicineEditDate(String medicineEditDate) {
		this.medicineEditDate = medicineEditDate;
	} 
	
	
}
