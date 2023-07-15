package com.pro.pojo;

public class AccountNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private int accountNumber;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public AccountNotFoundException(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	public AccountNotFoundException() {
		super();

	}

	@Override
	public String toString() {
		return "AccountNotFoundException [accountNumber=" + accountNumber + "]";
	}

}
