package com.mybank.domain;

public class TestBanking4 {

	public static void main(String[] args) {
		
		Customer[] customers = new Customer[4];
		Bank bank = new Bank(customers);
		
		Account[] accountsC1 = new Account[2];
		accountsC1[0] = new SavingsAccount(500, 0);
		accountsC1[1] = new CheckingAccount(200);
		
		Account[] accountsC2 = new Account[2];
		accountsC2[0] = new CheckingAccount(200);
		
		Account[] accountsC3 = new Account[2];
		accountsC3[0] = new SavingsAccount(1500, 0);
		accountsC3[1] = new CheckingAccount(200);

		Account[] accountsC4 = new Account[2];
		accountsC4[0] = new SavingsAccount(200, 0);
		accountsC4[1] = new CheckingAccount(150);
		
		bank.addCustomer("Jane", "Simms", accountsC1);
		bank.addCustomer("Owen", "Bryant", accountsC2);
		bank.addCustomer("Tim", "Soley", accountsC3);
		bank.addCustomer("Maria", "Soley", accountsC4);
		
		for (int i = 0; i < customers.length; i++) {
			System.out.printf("Customer: %s, %s %n",
					bank.getCustomer(i).getLastName(),
					bank.getCustomer(i).getFirstName());
			
			if (bank.getCustomer(i) == bank.getCustomer(1)) {
				System.out.printf("Saving account: current balance is %.1f %n",
						bank.getCustomer(i).getAccount(0).getBalance());
			} else {
				System.out.printf("Saving account: current balance is %.2f %n",
						bank.getCustomer(i).getAccount(0).getBalance());
				System.out.printf("Checking account: current balance is %.2f %n",
						bank.getCustomer(i).getAccount(1).getBalance());	
			}
		}
		

	}

}
