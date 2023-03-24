package entities;

public class Account {
	
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	public Account() {
	}
	
	public Account(String accountHolder, int accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
	}
	
	public Account(String accountHolder, int accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void deposit(double depositValue) {
		balance += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		balance -= 5;
		balance -= withdrawValue;
	}

	public String toString() {
		return "Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: $ " + String.format("%.2f", balance);
	}

}
