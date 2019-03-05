package com.spring.three;

import java.util.ArrayList;
	
	@Override
	public double getBalance(long accountId) {
		
		BankAccountepositoryImpl(){
		BankAccount b= new BankAccount(12345,"rishi","savings",20000);
		BankAccount b1= new BankAccount(12346,"rishee","current",25000);
		BankAccount b2= new BankAccount(12347,"rishindra","savings",10000);
		
		ArrayList<BankAccount> BA= new ArrayList<BankAccount>();
		
		BA.add(b);
		BA.add(b1);
		BA.add(b2);
		System.out.println(BA.get(accountId));
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
