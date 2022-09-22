package com.main;
import com.beans.Customer;
import com.exception.InsufficientFundsException;
import com.exception.OverTheLimitException;
import com.service.DepositService;
import com.service.WithdrawlService;
public class App {

public static void main(String[] args) {
	Customer c1=new Customer(31,"Nicy",10000);
	Customer c2=new Customer(45,"Nissy",8000);
	
	DepositService depositService=new DepositService();
	depositService.deposit(c1, 2000);
	depositService.deposit(c2, 3000);
	System.out.println("*****After deposit****");
	System.out.println(c1);
	System.out.println(c2);
	
	WithdrawlService withdrawalService=new WithdrawlService();
    try {
	withdrawalService.withdraw(c1,1000);
	withdrawalService.withdraw(c2,80000);
    }
    catch (InsufficientFundsException e) { 
		System.out.println(e.getMessage());
	} 
	catch (OverTheLimitException e) {
		System.out.println(e.getMessage());
	}
	
    System.out.println("*****After withdrawal****");
	System.out.println(c1);
	System.out.println(c2);
	
}
}