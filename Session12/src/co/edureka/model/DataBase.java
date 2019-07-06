package co.edureka.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class DataBase {

	// Attributes
	String dbName;
	int tableCount;
	
	// Dependency	  
	Connection connection; // Has-A Relationship | 1 to 1
	
	// Dependency
	List<String> tables;   // Has-A Relationship | 1 to many
	
	// Till Time DataBase() Constructor is not executed i.e. Object of DataBase is not Created
	// Object of Connection will not be created
	// Hence, Connection Object Constructions is dependent on DataBase object Construction
	// HIGH COUPLING
	/*public DataBase() {
		connection = new Connection(); // Not Good. Why ? As Connection Object Construction is Highly Dependent on DataBase Object Construction
	}*/
	
	public DataBase() {
		System.out.println(">> DataBase Constructor Executed | Default");
	}
	
	// Now we can create a separate object of connection and can pass its reference to the below constructor
	// With help of Constructor we can achieve Lower Coupling !!
	//@Autowired
	public DataBase(Connection connection) {
		this.connection = connection;
		System.out.println(">> DataBase Constructor Executed | Constructor Injection");
	}

	public DataBase(String dbName, int tableCount, Connection connection) {
		this.dbName = dbName;
		this.tableCount = tableCount;
		this.connection = connection;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public int getTableCount() {
		return tableCount;
	}

	public void setTableCount(int tableCount) {
		this.tableCount = tableCount;
	}

	public Connection getConnection() {
		return connection;
	}
	
	
	public List<String> getTables() {
		return tables;
	}

	public void setTables(List<String> tables) {
		System.out.println(">> Setter Method for List of Tables Executed");
		this.tables = tables;
	}

	// Now we can create a separate object of connection and can pass its reference to the below setter method as well !!
	// With help of setter method we can achieve Lower Coupling !!
	@Autowired
	public void setConnection(Connection connection) {
		this.connection = connection;
		System.out.println(">> Setter Method Executed");
	}

	@Override
	public String toString() {
		return "DataBase [dbName=" + dbName + ", tableCount=" + tableCount + ", connection=" + connection + "]";
	}
	
}
