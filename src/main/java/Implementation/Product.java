package Implementation;

import java.util.ArrayList;

public class Product {
	
	private String productName;
	private int price;
	
	public Product(String productName, int price) {
		this.productName= productName;
		this.price=price;
		
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static  ArrayList<String> getProductList() {
		
		ArrayList< String> productnames= new ArrayList<String>();
		
		productnames.add("Ipad");
		productnames.add("Macbook");
		productnames.add("iphone");
		productnames.add("computer");
		
		return productnames;
		
	}

}
