package model.entities;

import model.exceptionsd.WithdrawException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if (amount > balance) {
			throw new WithdrawException("Not enough balance.");
		}
		if (amount > withdrawLimit) {
			throw new WithdrawException("The amount exceeds withdraw limit.");
		}
		balance -= amount;
	}

	@Override
	public String toString() {
		return "New balance: " + String.format("%.2f\n", balance);
	}

}
