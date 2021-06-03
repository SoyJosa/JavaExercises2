package com;

import java.util.ArrayList;

public abstract class OrgFunctionalities {
	
	private ArrayList<Organisation> orgList;

	public OrgFunctionalities(ArrayList<Organisation> orgList) {
		this.orgList = orgList;
	}
	
	public boolean addOrganisation(Organisation X) {
		if(!orgList.contains(X)) {
			orgList.add(X);
			return true;
		}else {
			return false;
		}		
	}
	
	public Organisation getRating(int X){
		Organisation orgR = null;
		for(Organisation org : orgList) {
			if(org.getOrgId() == X) {
				String[] status = org.getFinancialStatus();
				if("Positive".equals(status[0]) && "Positive".equals(status[1]) && "Positive".equals(status[2]) && "Positive".equals(status[3])) {
					org.setOrgRating('A');
					orgR = org;
				}else if(("Positive".equals(status[0]) || "Positive".equals(status[1]) || "Positive".equals(status[2]) || "Positive".equals(status[3])) && ("Positive".equals(status[0]) || "Positive".equals(status[1]) || "Positive".equals(status[2]) || "Positive".equals(status[3])) ) {
					org.setOrgRating('B');
					orgR = org;
				}else {
					org.setOrgRating('C');
					orgR = org;
				}
			}
		}
		
		return orgR;
	}

	public ArrayList<Organisation> getOrgList(char x) {
		ArrayList<Organisation> newOrgList = new ArrayList<Organisation>();
		
		for(Organisation org : orgList) {
			if(org.getOrgRating() == x) {
				newOrgList.add(org);
			}
		}
		
		return newOrgList;
	}
	
	public abstract double getDiscountonBill(int X, double Y);

	public ArrayList<Organisation> getOrgList() {
		return orgList;
	}
	
	public void setOrgList(ArrayList<Organisation> orgList) {
		this.orgList = orgList;
	}
	
	

}
