package com;

public class Customer {
	private String userName;
	private int connectionId;
	private String type;
	private int plantype;
	
	public Customer(String userName, int connectionId, String type, int plantype) {
		super();
		this.userName = userName;
		this.connectionId = connectionId;
		this.type = type;
		this.plantype = plantype;
	}
	
	public void setPlantype(int plantype) {
		this.plantype = plantype;
	}
	
	public int getPlantype() {
		return plantype;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public String getUserName() {
		return userName;
	}
	
	public int getConnectionId() {
		return connectionId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setConnectionId(int connectionId) {
		this.connectionId = connectionId;
	}

}
