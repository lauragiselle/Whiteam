package com.mybank.domain;

public class SavingsAccount extends Account{
	private double interesRate;

	public SavingsAccount(double balance, double interesRate) {
		super(balance);
		this.interesRate = interesRate;
	}
	
//	incrementar saldo en funcion del interes, sera llamado con un timer, 
//	ej todos los meses incrementar saldo en funcion dekl interes
}
