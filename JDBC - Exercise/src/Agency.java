package One;

public class Agency {
	private int idAgency;
	private String agName;
	private int agZipCode;
	private String email;
		
	public Agency(int idAgency, String agName, int agZipCode, String email) {
		this.idAgency = idAgency;
		this.agName = agName;
		this.agZipCode = agZipCode;
		this.email = email;
	}
	
	public int getIdAgency() {
		return idAgency;
	}
	
	public void setIdAgency(int idAgency) {
		this.idAgency = idAgency;
	}
	
	public String getAgName() {
		return agName;
	}
	
	public void setAgName(String agName) {
		this.agName = agName;
	}
	
	public int getAgZipCode() {
		return agZipCode;
	}
	
	public void setAgZipCode(int agZipCode) {
		this.agZipCode = agZipCode;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Agency [idAgency=" + idAgency + ", agName=" + agName + ", agZipCode=" + agZipCode + ", email=" + email
				+ "]";
	}
}
