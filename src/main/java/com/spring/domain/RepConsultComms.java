//package com.spring.domain;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//@Entity
//@Table(name="RepConsultComms_S")
//public class RepConsultComms {
//	@Id
//	@GeneratedValue
//	@Column(name="Id" ,nullable=false)
//	private Integer id;
//	
//	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//	@JoinColumn(name="Comm_id")
//	private ConsultComms consultcomms;
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public ConsultComms getConsultcomms() {
//		return consultcomms;
//	}
//
//	public void setConsultcomms(ConsultComms consultcomms) {
//		this.consultcomms = consultcomms;
//	}
//
//	
//	
//
//}
