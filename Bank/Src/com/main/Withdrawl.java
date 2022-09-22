package com.main;

import com.beans.Customer;
import com.exception.InsufficientFundsException;
import com.exception.OverTheLimitException;

public interface Withdrawl {
	 double limit=50000;
	 void withdraw(Customer c,double amount)
			 throws InsufficientFundsException,OverTheLimitException;
}