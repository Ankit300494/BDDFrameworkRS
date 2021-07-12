package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF
{
	WebDriver driver;
	@FindBy(id="name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	//Constructor
	public LoginPage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialize the webelement...
	}
	
	public void enterUsernamePassword(String username,String Passwords)
	{
		Username.sendKeys(username);
		Password.sendKeys(Passwords);
	}
	
//	public void enterPassword(String Passwords)
//	{
//		Password.sendKeys(Passwords);
//	}
	
	public void clickLogin()
	{
		btn_login.click();
	}
}
