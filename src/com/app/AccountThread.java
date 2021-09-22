package com.app;

public class AccountThread extends Thread {
	
	private BankAccount bank_account;
	private double amount_to_deposit;
	private double amount_to_withdrawals;

	public AccountThread(BankAccount bank_account, double amount_to_deposit, double amount_to_withdraw) {
		this.bank_account = bank_account;
		this.amount_to_deposit = amount_to_deposit;
		this.amount_to_withdrawals = amount_to_withdraw;
	}

	@Override
	public void run() {
		this.bank_account.deposit(this.amount_to_deposit);
		this.bank_account.withdrawal(this.amount_to_withdrawals);
	}

}
