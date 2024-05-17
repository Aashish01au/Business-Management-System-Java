package com.spring.SpringProject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctApoint_tbl")
public class DoctAppointForm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullName;
	private String email;
	private String phone;
	private String date;
	private String time;
	private String enterArea;
	private String enterCity;
	private String enterState;
	private int postCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getEnterArea() {
		return enterArea;
	}

	public void setEnterArea(String enterArea) {
		this.enterArea = enterArea;
	}

	public String getEnterCity() {
		return enterCity;
	}

	public void setEnterCity(String enterCity) {
		this.enterCity = enterCity;
	}

	public String getEnterState() {
		return enterState;
	}

	public void setEnterState(String enterState) {
		this.enterState = enterState;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

}
