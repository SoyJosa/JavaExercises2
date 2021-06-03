package com;

import java.util.ArrayList;

public class OrgBilling extends OrgFunctionalities{

	public OrgBilling(ArrayList<Organisation> orgList) {
		super(orgList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDiscountonBill(int X, double Y) {
		// TODO Auto-generated method stub
		char rate = 0;
		for(Organisation org : getOrgList()) {
			if(org.getOrgId() == X) {
				rate = org.getOrgRating();
			}
		}
		
		switch(rate) {
		case 'A':
			return Y*0.2;
		case 'B':
			return Y*0.1;
		case 'C':
			return Y*0.05;
		default:
			return 0;
		
		}
	}

}
