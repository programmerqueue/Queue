package com.pro.daoImpl;

import java.util.List;

import com.pro.dao.BankAccountDao;
import com.pro.dao.BankAccountServiceDao;
import com.pro.pojo.BankAccount;

public class BankAccountServiceDaoImpl implements BankAccountServiceDao{
           BankAccountDao dao =  new BankAccountDaoImpl();
	@Override
	public void addNewBankAccount(BankAccount bankAccount) {
		dao.addNewBankAccount(bankAccount);
		
	}

	@Override
	public void removeBankAccount(BankAccount bankAccount) {
		dao.removeBankAccount(bankAccount);
		
	}

	@Override
	public void updateNewBankAccount(BankAccount bankAccount) {
		dao.updateNewBankAccount(bankAccount);
		
	}

	@Override
	public List<BankAccount> showAllAccounts() {
		List<BankAccount> showAllAccounts = dao.showAllAccounts();
		return showAllAccounts;
	}

}
