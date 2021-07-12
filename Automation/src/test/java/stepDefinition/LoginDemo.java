package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;

public class LoginDemo 
{
	WebDriver driver;
	LoginPage_PF loginPF;
	HomePage_PF home;
	
	@Before
	public void browserSetup()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://example.testproject.io/web/");
		loginPF = new LoginPage_PF(driver);
	    home = new HomePage_PF(driver);
	    System.out.println("Before Hook is working..");
		
	}
	@Given("User navigates to Google home page")
	public void browser_open()
	{
		
		//to perform Scroll on application using Selenium
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,350)", "");
	    
	}
	@When("^user enters the valid (.*) and (.*)$")
	public void LoginProcess(String username1,String Password1)
	{   //{string}, {string}
		loginPF.enterUsernamePassword(username1, Password1);	
	}
	
	@And("Click on Login button")
	public void ClickOnLogin()
	{
		loginPF.clickLogin();
	
	}
	
	@Then("Validate the HomePage")
	public void validateLogout() throws InterruptedException
	{
		home.LogoutisDisplay();
		Thread.sleep(2000);
	}
	
	@After
	public void browserquit()
	{
		driver.close();
		System.out.println("After Hook is working..");
	}
}
