package com;

import java.util.ArrayList;
import java.util.Comparator;

public class Operations2 extends Operations{

	

	@Override
	public ArrayList<Account> heighestAmoutPaidUsers() {
		// TODO Auto-generated method stub
		//o2 -> o2.getAmountToPay - o1.getAmountToPay() )
		Account aux = getAccountList().stream()
				.max( Comparator.comparing(o -> o.getAmountToPay()))
				.get();
		
		System.out.println(aux.getCustomer().getUserName());
		
		return null;
	}
	
	public void contactUserNames() {
		String one = "";
		String two = "";
		for(Account aux: getAccountList()) {
			if( aux.getCustomer().getType() == "3g") {
				one += aux.getCustomer().getUserName() + "";
			}else {
				two += aux.getCustomer().getUserName()+" ";
			}
		}
		
		System.out.println(one+":"+two);
	}
}
