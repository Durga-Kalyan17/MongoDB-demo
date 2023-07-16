package com.mongodbdemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * @author DurgaKalyan
 * 
 */
@Document(collection = "Player")
public class Player {

	/**
	 * @Override toString() mehtod
	 *  
	 */
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", role=" + role + ", jerseyNumber=" + jerseyNumber
				+ ", country=" + country + "]";
	}
	
	/**
	 * getter & setter mehtods
	 *  
	 */
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Id
	private int id;
	@NotBlank
	private String name;
	@NotBlank
	private String role;
	
	private int jerseyNumber;
	@NotNull
	private String country;
}
