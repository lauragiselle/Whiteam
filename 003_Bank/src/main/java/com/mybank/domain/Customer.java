package com.mybank.domain;

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] accounts;
	private int numberOfAccounts;

	public Customer(String firstName, String lastName, Account[] accounts) {
		this.firstName = firstName;	
		this.lastName = lastName;
		this.accounts = accounts;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public Account getAccount(int numberOfAccount) {
		return accounts[numberOfAccount];
	}
	
	public void addAccount(Account account) {
		for (int i = 0; i < this.accounts.length; i++) {
			if (this.accounts[i] == null) {
				this.accounts[i] = account;
				this.numberOfAccounts += 1;
				break;
			}
		}
	}
	public int getNumOfAccounts() {
		return 0;
	}
}
