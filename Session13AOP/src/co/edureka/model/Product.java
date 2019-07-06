package co.edureka.model;

public class Product {

	// Attributes
	int stock;
	int price;
	String name;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int stock, int price, String name) {
		this.stock = stock;
		this.price = price;
		this.name = name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Core Business Method
	public void purchaseProduct(String paymentMethod, String when){
		/*
		if(stock>0){ // 1. Validate Stock 
			System.out.println(">> Process Product Purchase");
			System.out.println(">> Please use "+paymentMethod+"and make the payments"); // 2. Process Payment
			System.out.println(">> Thank you for shopping "+name+" with us!! Shipment will arrive soon in "+when); // 3. Notifying Cutomer and logistics
		}else{
			System.out.println(">> Sorry!! No Products Available !! Try Again Soon !!");
		}
		*/
		System.out.println(">> Thank you for your Time !!");
		System.out.println(">> Shopping is Fun !! We Hope You Enjoyed !!");
	}

	@Override
	public String toString() {
		return "Product [stock=" + stock + ", price=" + price + ", name=" + name + "]";
	}
	
}
