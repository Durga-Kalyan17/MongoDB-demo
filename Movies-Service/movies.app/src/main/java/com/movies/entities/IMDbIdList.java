package com.movies.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IMDbIdList {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column
	String  IMDbIdArr;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIMDbIdArr() {
		return IMDbIdArr;
	}

	public void setIMDbIdArr(String response) {
		IMDbIdArr = response;
	}
	
	
	public IMDbIdList() {
	}

	public IMDbIdList(Long id, String iMDbIdArr) {
		this.id = id;
		this.IMDbIdArr = iMDbIdArr;
	}
	
	@Override
	public String toString() {
		return "IMDbIdList [id=" + id + ", IMDbIdArr=" + IMDbIdArr + "]";
	}

}
