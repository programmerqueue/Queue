package com.pro.pojo;

public class BankAccount {

	private int accountNumber;
	private String customerName;
	private int accountBalance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public BankAccount(int accountNumber, String customerName, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}

	public BankAccount() {
		super();
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", customerName=" + customerName + ", accountBalance="
				+ accountBalance + "]";
	}

}
