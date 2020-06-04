package satz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.forgotpassword;
import pageobjects.loginpage;
import pageobjects.qaclickhome;
import resources.base;



public class test extends base {
	public static Logger log=LogManager.getLogger(test.class.getName());
	public WebDriver driver;
	@Test(dataProvider="getdata")
	public  void pagenavigation(String username,String password) throws IOException, InterruptedException {
	
		driver=invoke();
		log.info("Driver got invoked");
		driver.get(prop.getProperty("url"));
		log.info("URL launched");

		qaclickhome qa=new qaclickhome(driver);
		loginpage lg=qa.signin();
		Thread.sleep(6000);
		lg.emailid().sendKeys(username);
		lg.password().sendKeys(password);
		Thread.sleep(3000);
		lg.login().click();
		forgotpassword fp=lg.iforgot();
		fp.forgotpass().sendKeys("abd@123.com");
		fp.submit().click();
		log.info("validated a data");
		driver.close();
		}
	
	@AfterTest
	public void closing()
	{
		driver=null;
	}
	
	
	
	
	
	
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[2][2];
		data[0][0]="kjbhkhjb@khkhbg.com";
		data[0][1]="234";
		data[1][0]="kjbhkhjb@khkhbg.com";
		data[1][1]="234";
		
		
		return data;
	}
	

}
