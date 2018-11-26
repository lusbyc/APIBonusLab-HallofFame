package com.famouslab.FamousLab.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// this class is being used to pull more than 1 character aka person from swapi.co
@JsonIgnoreProperties(ignoreUnknown=true)
public class FameResult {
	
	private int count;
	private String next; // retrieves the url for the next page
	
	private ArrayList<Fame> results;

	public FameResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public ArrayList<Fame> getResults() {
		return results;
	}

	public void setResults(ArrayList<Fame> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "FameResult [count=" + count + ", next=" + next + ", results=" + results + "]";
	}
	
	

}
