package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpage {
	
	public WebDriver driver;
	public mainpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='alert alert-danger']")
	WebElement txt;
	
	
	
public WebElement error()
{
	return txt;
}

	

}
