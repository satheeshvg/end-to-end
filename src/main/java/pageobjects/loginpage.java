package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public WebDriver driver;
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='user_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='user_password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement login;
	@FindBy(xpath="//a[@class='link-below-button']")
	WebElement forg;
	
	
public WebElement emailid()
{
	return email;
}
public WebElement password()
{
	return password;
}
public WebElement login()
{
	 return login;
	 
}
public forgotpassword iforgot()
{
	forg.click();
	forgotpassword fp=new forgotpassword(driver);
	return fp;
}
	

}
