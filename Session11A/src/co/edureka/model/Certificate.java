package co.edureka.model;

public class Certificate {
	
	Integer cid;
	String name;
	
	public Certificate() {
	
	}

	public Certificate(Integer cid, String name) {
		this.cid = cid;
		this.name = name;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certificate [cid=" + cid + ", name=" + name + "]";
	}
}
