package com.curso.testing;

import com.curso.domain.Bank;
import com.curso.domain.Customer;

public class TestBanking2 {

	public static void main(String[] args) {

		Customer[] listCustomers = new Customer[5];
		System.out.println(listCustomers.length);
		Bank banco = new Bank(listCustomers);

		banco.addCustomer("Jane", "Simms");
		banco.addCustomer("Owen", "Bryant");
		banco.addCustomer("Tim", "Soley");
		banco.addCustomer("Maria", "Soley");
		
		System.out.println("Numero de customers " + banco.getNumberOfCustmers());

		
		for (int i = 0; i < listCustomers.length; i++) {
			if (listCustomers[i] != null) {
				Customer newCustomer = banco.getCustomer(i);
				System.err.println("El cliente " + i + " es " + newCustomer.getLastName() + " " + newCustomer.getFirstName());				
			}
		}
	}
}
