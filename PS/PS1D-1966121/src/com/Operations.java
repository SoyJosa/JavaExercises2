package com;

import java.util.ArrayList;

public abstract class Operations {
	private ArrayList<Customer> customerList;
	private ArrayList<Account> AccountList;
	
	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	
	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}
	
	public ArrayList<Account> getAccountList() {
		return AccountList;
	}
	
	public void setAccountList(ArrayList<Account> accountList) {
		AccountList = accountList;
	}
	
	public boolean addCustomer(Customer X) {
		if(!customerList.contains(X)) {
			customerList.add(X);
			return true;
		}else {
			return false;
		}
	}
	
	public ArrayList<Account> calculateBillandAddAccountsToList(int x){
		for(Customer aux: customerList) {
			if(aux.getType() == "3g" && aux.getPlantype() == 1) {
				Account y = new Account(x*50, aux);
				AccountList.add(y);
			}else if(aux.getType() == "3g" && aux.getPlantype() == 2) {
				Account y = new Account(x * 75, aux);
				AccountList.add(y);						
			}else if(aux.getType() == "4g" && aux.getPlantype() == 1) {
				Account y = new Account(x * 70, aux);
				AccountList.add(y);
			}else if(aux.getType() == "4g" && aux.getPlantype() == 2) {
				Account y = new Account(x * 100, aux);
				AccountList.add(y);
			}
		}
		return AccountList;
	}
	
	public abstract ArrayList<Account> heighestAmoutPaidUsers();
	

}
