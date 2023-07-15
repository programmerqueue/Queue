package com.pro.daoImpl;

import java.util.LinkedList;
import java.util.List;

import com.pro.dao.BankAccountDao;
import com.pro.pojo.AccountNotFoundException;
import com.pro.pojo.BankAccount;

public class BankAccountDaoImpl implements BankAccountDao {
	List<BankAccount> accountList = new LinkedList<BankAccount>();

	@Override
	public void addNewBankAccount(BankAccount bankAccount) {
		accountList.add(bankAccount);

	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		/*
		 * before deleting the bank account object from list first we need to check if
		 * it exists otherwise we need to raise an exception
		 */
		if (!accountList.contains(bankAccount)) {
			try {
				throw new AccountNotFoundException(bankAccount.getAccountNumber());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		accountList.remove(bankAccount);

	}

	@Override
	public void updateNewBankAccount(BankAccount bankAccount) {
		if (!accountList.contains(bankAccount)) {
			try {
				throw new AccountNotFoundException(bankAccount.getAccountNumber());
			} catch (AccountNotFoundException e) {
				e.printStackTrace();
			}
		}
		int indexOf = accountList.indexOf(bankAccount);
		accountList.set(indexOf, bankAccount);
	}

	@Override
	public List<BankAccount> showAllAccounts() {
		return accountList; 

	}

}
