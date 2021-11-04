package com.example.demo.controller;

public class Student {
	private String firstName;
	private String lastName;
	
	// Constructor:
	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Getters and Setters:
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

	@Override
	public String toString() {
		return "Student [firstNamee=" + firstName + ", lastNamee=" + lastName + "]";
	}
	
}
