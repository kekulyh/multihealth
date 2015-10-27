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
@Table(name="News_S")
public class News implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name="Id" ,nullable=false)
	private int id;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Breiefdescription")
	private String breiefdescription;
	
	@Column(name="Contents")
	private String contents;
	
	@Column(name="Ndate")
	private String ndate;
	
	@Column(name="Newsimg")
	private String newsimg;
	
	@Column(name="Imgdescp")
	private String imgdescp;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="news")
	private Set<NewsComms>newscommsset;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBreiefdescription() {
		return breiefdescription;
	}
	public void setBreiefdescription(String breiefdescription) {
		this.breiefdescription = breiefdescription;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Set<NewsComms> getNewscommsset() {
		return newscommsset;
	}
	public void setNewscommsset(Set<NewsComms> newscommsset) {
		this.newscommsset = newscommsset;
	}
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
	public String getNewsimg() {
		return newsimg;
	}
	public void setNewsimg(String newsimg) {
		this.newsimg = newsimg;
	}
	public String getImgdescp() {
		return imgdescp;
	}
	public void setImgdescp(String imgdescp) {
		this.imgdescp = imgdescp;
	}
	
	
	
}
