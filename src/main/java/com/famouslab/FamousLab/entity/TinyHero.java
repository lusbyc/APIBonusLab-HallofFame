package com.famouslab.FamousLab.entity;

public class TinyHero {
	private String name;
	private String invented;
	private String year;
	
	public TinyHero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TinyHero(String name, String invented, String year) {
		super();
		this.name = name;
		this.invented = invented;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvented() {
		return invented;
	}
	public void setInvented(String invented) {
		this.invented = invented;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return name + " " + invented + " " + year;
	}
	
	
	
	
}
