package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDef {

	WebDriver driver=null;

	@Given("User navigates to facebook website")
	public void user_navigates_to_facebook_website() 
	{

		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		System.out.println("navigate to fb website");
	}
	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {

		System.out.println("user validates homepage title");
		driver.quit();


	}
		@Then("User entered the {string} username")
		public void user_entered_the_username(String username) {
	
			System.out.println("user enteres " + username + "username");
	
			
	}
		@Then("User entered the {string} password")
		public void user_entered_the_password(String pass) {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("user enters " +pass + "password");
			 
		}
		@Then("User {string} successfully Logged in")
		public void user_successfully_logged_in(String string) {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println(string +"logged in ");
			System.out.println("--------------------");
	
		}




}
