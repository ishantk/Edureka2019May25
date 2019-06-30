package co.edureka.model;


// Bean : Structure of Object
public class Connection {

	String url;
	String userName;
	String password;
	
	public Connection() {
		System.out.println(">> Connection Object Constructed | Default");
	}

	public Connection(String url, String userName, String password) {
		System.out.println(">> Connection Object Constructed | Parameterized");
		this.url = url;
		this.userName = userName;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// myInit and myDestroy can be any name of your choice
	public void myInit(){
		System.out.println(">> myInit of Connection");
	}
	
	public void myDestroy(){
		System.out.println(">> myDestroy of Connection");
	}

	@Override
	public String toString() {
		return "Connection [url=" + url + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
