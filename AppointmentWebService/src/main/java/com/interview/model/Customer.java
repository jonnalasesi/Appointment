package com.interview.model;

import java.util.Date;

public class Customer {
	private int id;
	private int StoreNumber;
	private String firstName;
	private String lastName;
	private String email;
	private Date Appointment;
	

	public Customer(int id, int storeNumber, String firstName, String lastName, String email, Date appointment) {
		super();
		this.id = id;
		StoreNumber = storeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Appointment = appointment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStoreNumber() {
		return StoreNumber;
	}

	public void setStoreNumber(int storeNumber) {
		StoreNumber = storeNumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAppointment() {
		return Appointment;
	}

	public void setAppointment(Date appointment) {
		Appointment = appointment;
	}
	

}