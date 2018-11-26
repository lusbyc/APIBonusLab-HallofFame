package com.famouslab.FamousLab.entity;

public class CompleteHero {
private String firstName;
private String lastName;
private String innovation;
private int year;


public CompleteHero() {
	super();
	// TODO Auto-generated constructor stub
}


public CompleteHero(String firstName, String lastName, String innovation, int year) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.innovation = innovation;
	this.year = year;
}


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


public String getInnovation() {
	return innovation;
}


public void setInnovation(String innovation) {
	this.innovation = innovation;
}


public int getYear() {
	return year;
}


public void setYear(int year) {
	this.year = year;
}


@Override
public String toString() {
	return "CompleteHero [firstName=" + firstName + ", lastName=" + lastName + ", innovation=" + innovation + ", year="
			+ year + "]";
}


	
	
}
