package com.service;
import com.beans.Customer;
import com.exception.InsufficientFundsException;
import com.exception.OverTheLimitException;
import com.main.Withdrawl;


public class WithdrawlService {

  public void withdraw(Customer c,double amount) throws InsufficientFundsException,OverTheLimitException{
		   if(amount > Withdrawl.limit)
			    throw new OverTheLimitException("Limit 50000 Exceeded");
		   if(amount>c.getBalance())
			    throw new InsufficientFundsException("Insufficient Funds");
		   c.setBalance(c.getBalance()-amount);
	}
}