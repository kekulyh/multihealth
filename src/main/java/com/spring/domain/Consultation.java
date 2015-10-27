package com.spring.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Consulation_S")
public class Consultation implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="Id" ,nullable=false)
	private Integer id;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Contents")
	private String contents;
	
	@Column(name="Cdate")
	private String cdate;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "U_id")
	private User user;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="consult")
	private Set<ConsultComms>concomms;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="consult")
	private Set<DocConsultComm>docconcomms;
	
	@Column(name="DocId")
	private String doctorid;
	
	@Column(name="Anonymous")
	private String anonymous;

	@Column(name="RecordNum")
	private Integer recordnum;
	
	@Column(name="LastUpdateTime")
	private String listupdatetime;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}

	public String getAnonymous() {
		return anonymous;
	}

	public void setAnonymous(String anonymous) {
		this.anonymous = anonymous;
	}

	public Set<ConsultComms> getConcomms() {
		return concomms;
	}

	public void setConcomms(Set<ConsultComms> concomms) {
		this.concomms = concomms;
	}

	public Integer getRecordnum() {
		return recordnum;
	}

	public void setRecordnum(Integer recordnum) {
		this.recordnum = recordnum;
	}

	public String getListupdatetime() {
		return listupdatetime;
	}

	public void setListupdatetime(String listupdatetime) {
		this.listupdatetime = listupdatetime;
	}

	public Set<DocConsultComm> getDocconcomms() {
		return docconcomms;
	}

	public void setDocconcomms(Set<DocConsultComm> docconcomms) {
		this.docconcomms = docconcomms;
	}
	
	

}
