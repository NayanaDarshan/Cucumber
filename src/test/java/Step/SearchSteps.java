package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.asserts.Assertion;

import Implementation.Product;
import Implementation.Search;

public class SearchSteps {
	
	Product Product;
	Search search;
	
	@Given("I have a search field in Amazon Page")
	public void i_have_a_search_field_in_amazon_page() {
	   System.out.println("The step number is 1");
	}

	@When("I searched a product with name {string} and price of product is {int}")
	public void i_searched_a_product_with_name_and_price_of_product_is(String productName, Integer price) {
      System.out.println(" The product is ==>"+productName+ "and price: ==>" +price);
      
      Product = new Product(productName, price);
	}

	@Then("The product {string} should display")
	public void the_product_should_display(String productName) {
	    
	    
	   search = new Search();
	   String name= search.getdisplayedProductName(Product);
	    System.out.println("The product is displayed ====>"+name);
	    
	    org.testng.Assert.assertEquals(name, Product.getProductName());
	}

}
