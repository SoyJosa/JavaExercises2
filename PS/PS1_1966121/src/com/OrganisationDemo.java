package com;

import java.util.ArrayList;

public class OrganisationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Organisation> orgList = new ArrayList<Organisation>();
		
		String[] status1 = {"Positive","Positive","Positive","Positive"};
		String[] status2 = {"Negative","Positive","Negative","Positive"};
		String[] status3 = {"Negative","Negative","Negative","Negative"};
		
		orgList.add( new Organisation(1022, "ASE", 8, status1 ) );
		orgList.add( new Organisation(1004, "HM", 5, status2 ) );
		orgList.add( new Organisation(1001, "ORG", 2, status3 ) );
		
		OrgBilling demo = new OrgBilling(orgList);
		
		// addOrganisation 
		System.out.println("Testing addOrganisation method");
		if(demo.addOrganisation(new Organisation(1008, "CAT", 2, status3 ))) {
			System.out.println("Org was added to the list");
		}else {
			System.out.println("Org was not added to the list");
		}
		
		// getRating
		System.out.println("\nTesting getRating method");
		Organisation org = demo.getRating(1022);
		
		for(Organisation orgaux : orgList) {
			demo.getRating(orgaux.getOrgId());
		}
		
		System.out.println("Org ID: "+org.getOrgId()+ 
				"\nRating assined: "+org.getOrgRating());
		
		// getOrgList
		System.out.println("\nTesting getOrgList method");
		ArrayList<Organisation> orgListC = demo.getOrgList('C');
		
		for(Organisation orgaux : orgListC) {
			System.out.println("Org id: "+orgaux.getOrgId()+ " Name: " +orgaux.getOrgName());
		}
		
		// getDiscountonBill
		System.out.println("\nTesting getDiscountonBill method");
		double dis = demo.getDiscountonBill(1022,10000);
		
		System.out.println("Org 1022 discount of: "+dis);

	}

}
