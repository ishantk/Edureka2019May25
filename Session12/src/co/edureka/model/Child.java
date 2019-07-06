package co.edureka.model;

public class Child extends Father{ // IS-A Relationship
	
	int vehicles;
	String companyName;
	public int getVehicles() {
		return vehicles;
	}
	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Child [fname=" + fname + ", lname=" + lname
				+ ", wealth=" + wealth + ", vehicles=" + vehicles + ", companyName=" + companyName+"]";
	}
	
	

}
