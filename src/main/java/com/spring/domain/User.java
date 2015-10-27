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
import javax.persistence.Table;


@Entity
@Table(name="User_S")
public class User implements Serializable{
	@Id
	@GeneratedValue
	@Column(name="Id" ,nullable=false)
	private int id;
	
	
	
	@Column(name="Name")
	
	private String name;
	
	
	@Column(name="Password")
	private String password;

	@Column(name="Tel")
	private String tel;
	
	
	
	@Column(name="Email")
	
	private String email;
	
	@Column(name="attachment")
	private String attachment;
	@Column(name="role")
	private String role;
	
	@Column(name="Description")
	private String description;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="user")
	private Set<Appointment>appointments; 
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="user")
	private Set<Consultation>consulations;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="user")
	private Set<ConsultComms>concomms;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="user")
	private Set<NewsComms>newscommsset;
	
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(Set<Appointment> appointments) {
		this.appointments = appointments;
	}
	public Set<Consultation> getConsulations() {
		return consulations;
	}
	public void setConsulations(Set<Consultation> consulations) {
		this.consulations = consulations;
	}
	public Set<ConsultComms> getConcomms() {
		return concomms;
	}
	public void setConcomms(Set<ConsultComms> concomms) {
		this.concomms = concomms;
	}
	public Set<NewsComms> getNewscommsset() {
		return newscommsset;
	}
	public void setNewscommsset(Set<NewsComms> newscommsset) {
		this.newscommsset = newscommsset;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
