package com.microservice.widget.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="widget")
public class Widget {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	

	@Column(name="name")
	private String name;
	

	@Column(name="description")
	private String description;
	
	
	
	public Integer getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
		
	public String getDescription(){
		return description;
	}

	
	public void setId(Integer id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	
	public void setDescription(String description){
		this.description=description;
	}
	
	
	
}
