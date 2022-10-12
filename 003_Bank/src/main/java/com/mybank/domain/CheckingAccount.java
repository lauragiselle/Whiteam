package com.mybank.domain;

public class CheckingAccount extends Account{
	private double overdraftAmount;

	public CheckingAccount(double balance, double overdraftAmount) {
		super(balance);
		this.overdraftAmount = overdraftAmount;
	}
	public CheckingAccount(double balance) {
		this(balance, 0.0);
	}
	
	@Override
	public boolean withdraw(double amount) {
		boolean transaction = true;

		if (this.balance < amount) {
			double overdraftNeeded = amount - this.balance;
			
			if (overdraftAmount < overdraftNeeded) {
				transaction = false;
			} else {
//				decrement overdraftAmount by overdraftNeeded
				this.balance = 0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
			}
		} else {
			this.balance = this.balance - amount;
		}
		return transaction;
	}
}
