package com.cts.swmd.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Visitor {
	private String firstName;
	private String lastName;
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate dateOfbirth;
	
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(LocalDate dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
