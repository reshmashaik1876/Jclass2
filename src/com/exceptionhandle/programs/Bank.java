package com.exceptionhandle.programs;

public class Bank {
	private int accountId;
	//private int amount;
	private int balance;
	public Bank(int accountId, int balance) {
		super();
		this.accountId = accountId;
		//this.amount = amount;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
//	public int getAmount() {
//		return amount;
//	}
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deopist(int accountid, int amount, int balance) {
		
	}
}
