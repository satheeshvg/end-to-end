package satz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.qaclickhome;
import resources.base;

public class navigationbar extends base  {
	public static Logger log=LogManager.getLogger(navigationbar.class.getName());
	public WebDriver driver;

	@Test
	public  void checknavigationbar() throws IOException {
		// TODO Auto-generated method stub
		
		qaclickhome qa=new qaclickhome(driver);
		Assert.assertTrue(qa.barcheck().isDisplayed());
		log.info("navigationbar check done");
	
		}
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=invoke();
		driver.get(prop.getProperty("url"));
	}
	@AfterTest
	public void closing()
	{
		driver.close();
		driver=null;
	}
	
	
	
	

}
