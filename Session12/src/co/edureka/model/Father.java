package co.edureka.model;

public class Father {

	String fname;
	String lname;
	int wealth;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getWealth() {
		return wealth;
	}
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	@Override
	public String toString() {
		return "Father [fname=" + fname + ", lname=" + lname + ", wealth=" + wealth + "]";
	}
	
	
	
	
}
