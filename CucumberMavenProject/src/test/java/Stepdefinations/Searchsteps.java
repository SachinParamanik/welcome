package Stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {
	@Given("Search field should be present on the path to Automation Search")
	public void search_field_should_be_present_on_the_path_to_automation_search() {
	    System.out.println("Step 1:I landed on search page");
	}

	@When("i search for a course\"Cucumber BDD for Selenium \"having price {int}")
	public void i_search_for_a_course_cucumber_bdd_for_selenium_having_prive(Integer price) {
		System.out.println("Step 2:Search the course with name having price"+price);
	}

	@Then("Course {string} should be displayed")
	public void course_should_be_displayed(String Coursename) {
		System.out.println("Step 3:Course "+Coursename);
	}



}
