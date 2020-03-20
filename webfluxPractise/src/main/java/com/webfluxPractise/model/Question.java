package com.webfluxPractise.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("questions")
public class Question {

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column("id")
	private Long id;
	@Column("title")
	private String title;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	
	
	
	

}
