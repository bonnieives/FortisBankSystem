package bus;

import java.util.ArrayList;

public class Customer extends User {
	
	// Hello from MARS
	
	private ArrayList<Account> listOfAccounts;
	private ArrayList<Transaction> listOfTransactions;
	
	public Customer() {
		super();
		//addCheckingAccount();
		this.listOfTransactions = null;
	}
	
	public Customer(ArrayList<Account> listOfAccounts, ArrayList<Transaction> listOfTransactions) {
		super();
		//addCheckingAccount();
		this.listOfAccounts = listOfAccounts;
		this.listOfTransactions = listOfTransactions;
	}

	public ArrayList<Account> getListOfAccounts() {
		return listOfAccounts;
	}

	public void setListOfAccounts(ArrayList<Account> listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}

	public ArrayList<Transaction> getListOfTransactions() {
		return listOfTransactions;
	}

	public void setListOfTransactions(ArrayList<Transaction> listOfTransactions) {
		this.listOfTransactions = listOfTransactions;
	}

	@Override
	public String toString() {
		return "Customer [listOfAccounts=" + listOfAccounts + ", listOfTransactions=" + listOfTransactions
				+ ", toString()=" + super.toString() + "]";
	}
	
	private void addCheckingAccount() {
		this.listOfAccounts.add(new CheckingAccount());
	}


	public void addTransaction(Transaction oneTransaction) {
		listOfTransactions.add(oneTransaction);
	}
	
	public void addAccount(Account oneAccount) {
		listOfAccounts.add(oneAccount);
	}
	
	public void removeAccount(Account oneAccount) {
		listOfAccounts.remove(oneAccount);
	}
	
}
