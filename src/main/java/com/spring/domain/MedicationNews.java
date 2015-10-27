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
@Table(name="multihealthmedicine_medicationnews")
public class MedicationNews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="medicationnews_id")
	private int medicationNewsId;
	
	private String medicationNewsTitle;
	
	private String medicationNewsAuthor;
	
	private String medicationNewsContent;
	
	private String medicationNewsDate;
	
	private int medicationNewsCommentCount;
	
	private String medicationNewsImage;
	
	private String medicationNewsEditor;
	
	private String medicationNewsEditDate;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="medicationNews")
	
	//display brief content on news page
	public String getBriefNewsContent() {
		if (medicationNewsContent == null) {
			return "";
		}else{
			int len = medicationNewsContent.length() > 100?100:medicationNewsContent.length();
			return medicationNewsContent.substring(0, len);
		}
	}

	public int getMedicationNewsId() {
		return medicationNewsId;
	}

	public void setMedicationNewsId(int medicationNewsId) {
		this.medicationNewsId = medicationNewsId;
	}

	public String getMedicationNewsTitle() {
		return medicationNewsTitle;
	}

	public void setMedicationNewsTitle(String medicationNewsTitle) {
		this.medicationNewsTitle = medicationNewsTitle;
	}

	public String getMedicationNewsAuthor() {
		return medicationNewsAuthor;
	}

	public void setMedicationNewsAuthor(String medicationNewsAuthor) {
		this.medicationNewsAuthor = medicationNewsAuthor;
	}

	public String getMedicationNewsContent() {
		return medicationNewsContent;
	}

	public void setMedicationNewsContent(String medicationNewsContent) {
		this.medicationNewsContent = medicationNewsContent;
	}

	public String getMedicationNewsDate() {
		return medicationNewsDate;
	}

	public void setMedicationNewsDate(String medicationNewsDate) {
		this.medicationNewsDate = medicationNewsDate;
	}

	public int getMedicationNewsCommentCount() {
		return medicationNewsCommentCount;
	}

	public void setMedicationNewsCommentCount(int medicationNewsCommentCount) {
		this.medicationNewsCommentCount = medicationNewsCommentCount;
	}

	public String getMedicationNewsEditor() {
		return medicationNewsEditor;
	}

	public void setMedicationNewsEditor(String medicationNewsEditor) {
		this.medicationNewsEditor = medicationNewsEditor;
	}

	public String getMedicationNewsEditDate() {
		return medicationNewsEditDate;
	}

	public void setMedicationNewsEditDate(String medicationNewsEditDate) {
		this.medicationNewsEditDate = medicationNewsEditDate;
	}

	public String getMedicationNewsImage() {
		return medicationNewsImage;
	}

	public void setMedicationNewsImage(String medicationNewsImage) {
		this.medicationNewsImage = medicationNewsImage;
	}
	
	
	
	
	
	
}
