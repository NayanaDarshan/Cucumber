package Step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User tries to book the {string} type car")
	public void user_tries_to_book_the_type_car(String carType) {
		System.out.println("Step 1=====>"+carType);
	    
	   
	}

	@When("User books the {string} type car the pick up location is {string} and drop location {string}")
	public void user_books_the_type_car_the_pick_up_location_is_and_drop_location(String carType, String pickLoc, String dropLoc) {

	 System.out.println("Step 2===>" +carType +"PickLoction==>"+pickLoc + "DropLocation===>"+dropLoc);
	}

	@Then("Driver starts the Journey")
	public void driver_starts_the_journey() {
	    System.out.println("Step 3");
	    
	}

	@Then("Driver ends the Journey")
	public void driver_ends_the_journey() {
		 System.out.println("Step 4");
	    
	}

	@Then("user pays the amout of Rs {int}")
	public void user_pays_the_amout_of_rs(Integer price) {
	   System.out.println("Step 5 ====> User pays amount" +price);
	    
	}

}
