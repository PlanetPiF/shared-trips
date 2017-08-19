package com.planetpif.model;

public class Passenger {

	private String firstName;
	private String lastName;
	private String userName;
	private String phoneNumber;

	private boolean isDriving;

	// Names + Phone constructor
	public Passenger(String firstName, String lastName, String phoneNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isDriving() {
		return isDriving;
	}

	public void setDriving(boolean isDriving) {
		this.isDriving = isDriving;
	}

}
