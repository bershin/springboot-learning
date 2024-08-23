package com.stacksimplify.restservices.springboot_project.controller;

public class UserDetails {
	String firstName;
	String secondName;
	Integer currentAge;
	
	public UserDetails(String firstName, String secondName, Integer currentAge) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.currentAge = currentAge;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public Integer getCurrentAge() {
		return currentAge;
	}
	public void setCurrentAge(Integer currentAge) {
		this.currentAge = currentAge;
	}
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", secondName=" + secondName + ", currentAge=" + currentAge
				+ "]";
	}
	
}
