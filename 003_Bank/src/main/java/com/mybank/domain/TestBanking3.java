package com.mybank.domain;

public class TestBanking3 {

	public static void main(String[] args) {

		Customer[] customers = new Customer[4];
		
		Account[] accountsC1 = new Account[2];
		accountsC1[0] = new SavingsAccount(500, 0.03);
		Account[] accountsC2 = new Account[2];
		accountsC2[0] = new CheckingAccount(500);
		Account[] accountsC3 = new Account[2];
		accountsC3[0] = new CheckingAccount(500, 500);
		
		
		Bank bank = new Bank(customers);
		bank.addCustomer("Jane", "Simms", accountsC1);
		bank.addCustomer("Owen", "Bryant", accountsC2);
		bank.addCustomer("Tim", "Soley", accountsC3);
		bank.addCustomer("Maria", "Soley", accountsC3);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Retiro de dinero: " + bank.getCustomer(i).getAccount(0).withdraw(150));
			System.out.println("Deposito de dinero: " + bank.getCustomer(i).getAccount(0).deposit(22.50));
			System.out.println("Retiro de dinero: " + bank.getCustomer(i).getAccount(0).withdraw(47.62));
			System.out.println("Retiro de dinero: " + bank.getCustomer(i).getAccount(0).withdraw(400));
			
			System.out.printf("El cliente %s %s has a balance of %.2f %n",
					bank.getCustomer(i).getLastName(), 
					bank.getCustomer(i).getFirstName(),
					bank.getCustomer(i).getAccount(0).getBalance());
		}

		System.out.println("Deposito de dinero: " + bank.getCustomer(3).getAccount(0).deposit(150));
		System.out.println("Retiro de dinero: " + bank.getCustomer(3).getAccount(0).withdraw(750));
		System.out.printf("El cliente %s %s has a balance of %.2f ",
				bank.getCustomer(3).getLastName(), 
				bank.getCustomer(3).getFirstName(),
				bank.getCustomer(3).getAccount(0).getBalance());
	}

}
