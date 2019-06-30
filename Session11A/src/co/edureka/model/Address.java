package co.edureka.model;

public class Address {

	Integer aid;
	String adrsLine;
	String city;
	Integer zipCode;
	String state;
	
	Person person; // Has-A Relationship (1 to 1)
	
	public Address() {
	
	}

	public Address(Integer aid, String adrsLine, String city, Integer zipCode, String state, Person person) {
		this.aid = aid;
		this.adrsLine = adrsLine;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.person = person;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", zipCode=" + zipCode + ", state="
				+ state + ", person=" + person + "]";
	}
	
	
	
}
