package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cat {
	
	@Id
	@GeneratedValue
	private Long id;
	private Boolean hasWhiskers;
	private String name;
	private Boolean evil;
	private Long length;
	
	public Cat(){
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Boolean getHasWhiskers() {
		return hasWhiskers;
	}
	public void setHasWhiskers(Boolean hasWhiskers) {
		this.hasWhiskers = hasWhiskers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getEvil() {
		return evil;
	}
	public void setEvil(Boolean evil) {
		this.evil = evil;
	}
	public Long getLength() {
		return length;
	}
	public void setLength(Long length) {
		this.length = length;
	}


	
	

}
