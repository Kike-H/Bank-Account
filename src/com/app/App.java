package com.app; 

class App {
	public static void main(String[] args) {
		// Shared bank account
		BankAccount shared_account = new BankAccount("12345-678", 1000.00);

		//Threads for the shared_account
		AccountThread t1 = new AccountThread(shared_account, 300.00, 50.00);
		AccountThread t2 = new AccountThread(shared_account, 203.75, 100.00);

		//Execute
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		//Print the balance
		System.out.println("Balance: "+shared_account.getBalance()+" Acount number: "+shared_account.getNumberAccount());
	} 
}
