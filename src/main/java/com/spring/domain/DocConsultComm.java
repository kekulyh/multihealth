package com.spring.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DocConsultComms_S")
public class DocConsultComm {
	@Id
	@GeneratedValue
	@Column(name="Id" ,nullable=false)
	private Integer id;
	
	@Column(name="Doccomms")
	private String doccomms;
	
	@Column(name="Doccondate")
	private String doccondate;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "C_id")
	private Consultation consult;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "D_id")
	private Doctor doctor;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDoccomms() {
		return doccomms;
	}

	public void setDoccomms(String doccomms) {
		this.doccomms = doccomms;
	}

	public String getDoccondate() {
		return doccondate;
	}

	public void setDoccondate(String doccondate) {
		this.doccondate = doccondate;
	}

	public Consultation getConsult() {
		return consult;
	}

	public void setConsult(Consultation consult) {
		this.consult = consult;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	

}
