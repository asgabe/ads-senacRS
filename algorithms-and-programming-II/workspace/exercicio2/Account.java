package com.senac.exercicio2;

public class Account {
	public double balance = 200;
	public String msg = "Account [balance=" + balance + "]";

	public void CashOut(double value) {
		if (value < balance) {
			this.balance = value - this.balance;
		} else {
			this.msg = "Insufficient funds";
		}
	}

	public void CashDeposit(double value) {
		this.balance = value + this.balance;
	}

	public String toString() {
		return this.msg;
	}

}
