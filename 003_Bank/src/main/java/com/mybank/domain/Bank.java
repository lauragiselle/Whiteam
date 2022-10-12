package com.mybank.domain;

public class Bank {
	private Customer[] listCustomer;
	private int numberOfCustmers;
	
	public Bank(Customer[] listCustomer) {
		this.listCustomer = listCustomer;
		this.numberOfCustmers = 0;
	}
	
	public void addCustomer(String firstName, String lastName, Account[] accounts) {
		Customer newCustomer = new Customer(firstName, lastName, accounts);
		
//		si la lista de customers esta vacia puedo agregar un customer
		for (int i = 0; i < listCustomer.length; i++) {
			if (listCustomer[i] == null) {
				listCustomer[i] = newCustomer;
				this.numberOfCustmers++;
				break; //no es mala practica poner un break dentro de un if
			}
		}
	}
	
	public int getNumberOfCustmers() {
		return this.numberOfCustmers;
	}
	
	public Customer getCustomer(int idCustomer) {
//		intentar usar un solo return para que el codigo sea más claro, buena práctica
		Customer customer = null;
		for (int i = 0; i < listCustomer.length; i++) {
			if (listCustomer[i] == listCustomer[idCustomer]) {
				customer = listCustomer[i];
			}
		}
		return customer;
	}
}
