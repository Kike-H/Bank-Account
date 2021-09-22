package com.app;

public class BankAccount {
	private double balance;
	private String number_account;

	public BankAccount(String number_account, double balance) {
		this.balance = balance;
		this.number_account = number_account;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdrawal(double amount) {
		this.balance -= amount;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getNumberAccount() {
		return this.number_account;
	}
}
