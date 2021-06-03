package com;

public class Account {
	private double amountToPay;
	private Customer customer;
	
	public Account() {
		super();
	}
	
	public Account(double amountToPay, Customer customer) {
		super();
		this.amountToPay = amountToPay;
		this.customer = customer;
	}

	public double getAmountToPay() {
		return amountToPay;
	}

	public void setAmountToPay(double amountToPay) {
		this.amountToPay = amountToPay;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	

}
