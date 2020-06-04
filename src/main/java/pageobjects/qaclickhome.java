package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class qaclickhome {
	
	public WebDriver driver;
	public qaclickhome(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	



	@FindBy(xpath="//a[contains(@href,'sign_in')]")
	private WebElement login;
	
	@FindBy(xpath="//div[@class='text-center']/h2")
	private WebElement text;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']")
	private WebElement bar;

	@FindBy(xpath="//div[@class='col-sm-6 col-md-8 hidden-xs video-banner']/p")
	private WebElement news;
	

public loginpage signin()
{
	 login.click();
	 loginpage lg=new loginpage(driver);
	 return lg;
}
public WebElement hometext()
{
	return text;
}
public WebElement barcheck()
{
	return bar;
}
public WebElement upper()
{
	return news;
}


	

}
