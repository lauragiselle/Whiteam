package com.curso.domain;

public class Account {
	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amt) {
		this.balance = this.balance + amt;
		return true;
	}

	public boolean withdraw(double amt) {
		boolean operacionExitosa = false;
		if (amt <= this.balance) {
			this.balance = this.balance - amt;
			operacionExitosa = true;
		}
		return operacionExitosa;
	}
}
