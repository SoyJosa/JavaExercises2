package com;

public class Organisation {
	private int orgId;
	private String orgName;
	private int noOfBranches;
	private char orgRating;
	private String[] financialStatus;
	
	public Organisation(int orgId, String orgName, int noOfVranches, String[] financialStatus) {
		this.orgId = orgId;
		this.orgName = orgName;
		this.noOfBranches = noOfVranches;
		this.financialStatus = financialStatus;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfVranches) {
		this.noOfBranches = noOfVranches;
	}

	public char getOrgRating() {
		return orgRating;
	}

	public void setOrgRating(char orgRating) {
		this.orgRating = orgRating;
	}

	public String[] getFinancialStatus() {
		return financialStatus;
	}

	public void setFinancialStatus(String[] financialStatus) {
		this.financialStatus = financialStatus;
	}
	
	

}
