package co.edureka.model;

import java.util.List;

public class Manager {

	Integer mid;
	String name;
	String email;
	
	List<Certificate> certificates; // Has-A Relationship (1 to many)
	
	public Manager() {
	
	}

	public Manager(Integer mid, String name, String email, List<Certificate> certificates) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.certificates = certificates;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", email=" + email + ", certificates=" + certificates + "]";
	}
	
}
