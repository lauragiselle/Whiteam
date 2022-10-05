package com.curso.domain;

public class Account {
	private double balance;

	public Account(double balance) {
		if (balance > 0) {
			this.balance = balance;
		} else {
			System.out.println("El ingreso del balance no puede ser 0 o negativo");
		}
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
