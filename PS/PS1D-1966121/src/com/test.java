package com;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		customerList.add(new Customer("Mark Z",1007,"3g",1));
		customerList.add(new Customer("Larry P",1004,"3g",2));
		customerList.add(new Customer("Sundar L",1022,"3g",1));
		customerList.add(new Customer("Bill G",1009,"4g",1));
		
		ArrayList<Account> AList = new ArrayList<Account>();
		
		AList.add(new Account(600,new Customer("Louis R",1017,"4g",2)));
		
		Operations2 ope = new Operations2();
		
		ope.setCustomerList(customerList);
		ope.setAccountList(AList);
		
		if(ope.addCustomer(new Customer("Sandy G",1001,"4g",2))) {
			System.out.println("Customer added\n");			
		}else {
			System.out.println("Faild\n");	
		}
		
		ope.calculateBillandAddAccountsToList(30);
		
		System.out.println("The heighest");
		ope.heighestAmoutPaidUsers();
		
		System.out.println("\nUser Names:");
		ope.contactUserNames();

	}

}
