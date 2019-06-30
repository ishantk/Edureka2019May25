package co.edureka.model;

// Instead of hbm file we can also use annotations :)

public class Person {

	Integer pid;
	String name;
	String email;
	
	Address address; // HAS-A Relationship (1 to 1)
	
	public Person() {
	
	}

	public Person(Integer pid, String name, String email, Address address) {
		this.pid = pid;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
}
