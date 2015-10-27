package com.spring.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DoctorS")
public class Doctor implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="Id" ,nullable=false)
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="RegisterDate")
	private String registerData;
	
	@Column(name="Description")
	private String Description;
	
	@Column(name="Attachment")
	private String attachment;
	
	@Column(name="Tel")
	private String tel;
	
	@Column(name="Brief")
	private String brief;
	
	@Column(name="Degree")
	private String degree;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="doctor")
	private Set<Timetable> timetables;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="doctor")
	private Set<Appointment>appointments; 
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="doctor")
	private Set<DocConsultComm> docconcomms;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegisterData() {
		return registerData;
	}
	public void setRegisterData(String registerData) {
		this.registerData = registerData;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public Set<Timetable> getTimetables() {
		return timetables;
	}
	public void setTimetables(Set<Timetable> timetables) {
		this.timetables = timetables;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Set<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
	public Set<DocConsultComm> getDocconcomms() {
		return docconcomms;
	}
	public void setDocconcomms(Set<DocConsultComm> docconcomms) {
		this.docconcomms = docconcomms;
	}
	
	
}
