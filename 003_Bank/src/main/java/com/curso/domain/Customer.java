package com.curso.domain;

public class Customer {
	private String firstName;
	private String lastName;
	private Account account;

	public Customer(String firstName, String lastName) {
		if (firstName != null) {
			this.firstName = firstName;			
		}
		
		if (lastName != null) {
			this.lastName = lastName;			
		} else {
			System.err.println("");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}
