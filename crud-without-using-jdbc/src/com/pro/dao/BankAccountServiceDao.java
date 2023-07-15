package com.pro.dao;

import java.util.List;

import com.pro.pojo.BankAccount;

public interface BankAccountServiceDao {
	void addNewBankAccount(BankAccount bankAccount);

	void removeBankAccount(BankAccount bankAccount);

	void updateNewBankAccount(BankAccount bankAccount);

	List<BankAccount> showAllAccounts();
}
