package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgotpassword {
	public WebDriver driver;
	public forgotpassword(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
@FindBy(xpath="//input[@id='user_email']")
private WebElement forgot;

@FindBy(xpath="//input[@type='submit']")
private WebElement submit;

public WebElement forgotpass()
{
	
	return forgot;
}

public WebElement submit()
{
	return submit;
}

}
