package Backup;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	//	
	//@Given("user is on login page")	
	//public void verifyLoginPage()
	//{
	//	
	// System.out.println("Hello World");
	//	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside button - user enters username and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Inside button - user click login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("user is navigate to home page");
	}
	
	




}
