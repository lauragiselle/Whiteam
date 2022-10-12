package com.mybank.domain;

public class Account {
	protected double balance;

	protected Account(double balance) { //protected metodo: puedo acceder a el dentro del mismo package
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		this.balance = this.balance + amount;
		return true;
	}

	public boolean withdraw(double amount) {
		boolean operacionExitosa = false;
		if (amount <= this.balance) {
			this.balance = this.balance - amount;
			operacionExitosa = true;
		}
		return operacionExitosa;
	}
}
