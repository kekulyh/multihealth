package com.spring.domain;

import java.io.Serializable;

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
@Table(name="NewComms_S")
public class NewsComms implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="Id" ,nullable=false)
	private int id;
	
	@Column(name="Commcontents")
	private String commcontents;
	
	@Column(name="Ncdate")
	private String ncdate;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "News_id")
	private News news;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name = "U_id")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommcontents() {
		return commcontents;
	}

	public void setCommcontents(String commcontents) {
		this.commcontents = commcontents;
	}

	public String getNcdate() {
		return ncdate;
	}

	public void setNcdate(String ncdate) {
		this.ncdate = ncdate;
	}

	public News getNews() {
		return news;
	}

	public void setNews(News news) {
		this.news = news;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
