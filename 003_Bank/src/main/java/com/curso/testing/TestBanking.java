package com.curso.testing;

import com.curso.domain.Account;
import com.curso.domain.Customer;

public class TestBanking {

	public static void main(String[] args) {
		Customer c = new Customer("Luis", "Ramos");
		Account a = new Account(500.000);

		System.out.println(a.withdraw(150.000));
		System.out.println(a.deposit(22.50));
		System.out.println(a.withdraw(47.62));
		System.out.println(a.withdraw(400.000));

		System.out.printf("El cliente %s %s tiene un saldo de %f", c.getFirstName(), c.getLastName(), a.getBalance());
	}

}
