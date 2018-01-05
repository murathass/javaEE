package com.murathas.model;

public class Passenger {
	
	private String firstName;
	private String lasstName;
	private String dob;
	private String gender;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasstName() {
		return lasstName;
	}
	public void setLasstName(String lasstName) {
		this.lasstName = lasstName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
