package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF
{
	@FindBy(id="logout")
	WebElement btn_logout;
	WebDriver driver;
	public HomePage_PF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);//initialize the webelement...
	}

	public void LogoutisDisplay()
	{
		if(btn_logout.isDisplayed())
		{
			btn_logout.click();
		}
		else
		{
			System.out.println("Logout button is not enable..");
		}
	}
	public void ClickLogout()
	{
		btn_logout.click();
	}
}
