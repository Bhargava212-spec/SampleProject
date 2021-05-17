package com.hcl.cs.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyPets {
	@Id
	private Integer petId;
	private String petName;
	private Integer petAge;
	private String petPlace;
	private String userName;
	public Integer getPetId() {
		return petId;
	}
	public void setPetId(Integer petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public Integer getPetAge() {
		return petAge;
	}
	public void setPetAge(Integer petAge) {
		this.petAge = petAge;
	}
	public String getPetPlace() {
		return petPlace;
	}
	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public MyPets(Integer petId, String petName, Integer petAge, String petPlace, String userName) {
		super();
		this.petId = petId;
		this.petName = petName;
		this.petAge = petAge;
		this.petPlace = petPlace;
		this.userName = userName;
	}
	public MyPets() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
