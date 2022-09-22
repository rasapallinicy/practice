package com.service;

import com.beans.Customer;

public class DepositService {
	public void deposit(Customer c,double amount) {
		c.setBalance(c.getBalance()+amount);
	}
}
