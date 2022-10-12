package com.mybank.domain;

public class TestBanking1 {

	public static void main(String[] args) {
		
		String firstName = "Luis";
		String lastName = "Ramos";
		double balance = 500.000;
		
		if (firstName != null &&
			lastName != null &&
			balance > 0) {
			
			Customer[] customers = new Customer[1];
			
			Account[] accounts = new Account[2];
			accounts[0] = new Account(balance);
			
			Bank bank = new Bank(customers);
			bank.addCustomer(firstName, lastName, accounts);

			System.out.println("Retiro de dinero: " + accounts[0].withdraw(150.000));
			System.out.println("Ingreso de dinero: " + accounts[0].deposit(22.50));
			System.out.println("Retiro de dinero: " + accounts[0].withdraw(47.62));
			System.out.println("Retiro de dinero: " + accounts[0].withdraw(400.000));

			System.out.printf("El cliente %s %s tiene un saldo de %.2f", 
					bank.getCustomer(0).getFirstName(), 
					bank.getCustomer(0).getLastName(), 
					accounts[0].getBalance());
		} else {
			System.out.println("Debe ingresar bien los datos");
		}
	}

}
