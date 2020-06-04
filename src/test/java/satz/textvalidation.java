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

public class textvalidation extends base {
	public static Logger log=LogManager.getLogger(textvalidation.class.getName());
	qaclickhome qa;
	public WebDriver driver;
	@Test
	public  void checktitle() throws IOException
	{
		// TODO Auto-generated method stub
		
		
		log.error("faikled title");
		Assert.assertTrue(qa.hometext().getText().equalsIgnoreCase("FEATURED COURSES1"));
	
		
		
				
		}
	
	
	@Test
	public void checkheader()
	{
		qa=new qaclickhome(driver);
		String beer=qa.upper().getText();
		System.out.println(beer);
		log.info("checked");
	}
	@AfterTest
	public void closing()
	{
		driver.close();
		driver=null;
		
	}
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=invoke();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	

}
