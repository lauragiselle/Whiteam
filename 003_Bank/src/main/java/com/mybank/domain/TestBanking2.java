package com.mybank.domain;

public class TestBanking2 {

	public static void main(String[] args) {
		
		Customer[] listCustomers = new Customer[5];
		System.out.println(listCustomers.length);
		
		Bank bank = new Bank(listCustomers);
		Account[] accounts = new Account[2];
		accounts[0] = new Account(500.00);
		
		
		bank.addCustomer("Jane", "Simms", accounts);
		bank.addCustomer("Owen", "Bryant", accounts);
		bank.addCustomer("Tim", "Soley", accounts);
		bank.addCustomer("Maria", "Soley", accounts);
		
		System.out.println("Numero de customers " + bank.getNumberOfCustmers());

		for (int i = 0; i < listCustomers.length; i++) {
			if (listCustomers[i] != null) {
				Customer newCustomer = bank.getCustomer(i);
				System.out.println("El cliente " + i + " es " + newCustomer.getLastName() + " " + newCustomer.getFirstName());				
			}
		}
	}
}
