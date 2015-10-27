package com.spring.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ConsultComms_S")

public class ConsultComms {
	@Id
	@GeneratedValue
	@Column(name="Id" ,nullable=false)
	private Integer id;
	@Column(name="Commcontents")
	private String commconcents;
	@Column(name="Commdate")
	private String commdate;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "U_id")
	private User user;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "C_id")
	private Consultation consult;

//	@OneToOne(mappedBy = "consultcomms")
//	private RepConsultComms repconcomms;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Comm_id")
	private ConsultComms consultcomms;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCommconcents() {
		return commconcents;
	}

	public void setCommconcents(String commconcents) {
		this.commconcents = commconcents;
	}

	

	public String getCommdate() {
		return commdate;
	}

	public void setCommdate(String commdate) {
		this.commdate = commdate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Consultation getConsult() {
		return consult;
	}

	public void setConsult(Consultation consult) {
		this.consult = consult;
	}

	public ConsultComms getConsultcomms() {
		return consultcomms;
	}

	public void setConsultcomms(ConsultComms consultcomms) {
		this.consultcomms = consultcomms;
	}

	
}
