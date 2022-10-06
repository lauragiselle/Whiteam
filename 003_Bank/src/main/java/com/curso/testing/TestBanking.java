package com.curso.testing;

import com.curso.domain.Account;
import com.curso.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {
		
		String firstName = "Luis";
		String lastName = "Ramos";
		double balance = 500.000;
		
		if (firstName != null &&
			lastName != null &&
			balance > 0) {
			
			Customer c = new Customer(firstName, lastName);
			Account a = new Account(500.000);

			System.out.println("Retiro de dinero: " + a.withdraw(150.000));
			System.out.println("Ingreso de dinero: " + a.deposit(22.50));
			System.out.println("Retiro de dinero: " + a.withdraw(47.62));
			System.out.println("Retiro de dinero: " + a.withdraw(400.000));

			System.out.printf("El cliente %s %s tiene un saldo de %f", c.getFirstName(), c.getLastName(), a.getBalance());
		} else {
			System.out.println("Debe ingresar bien los datos");
		}
	}

}
