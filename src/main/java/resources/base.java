package resources;

 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class base {

	
	
	public  WebDriver driver;
	public Properties prop;
	
	public  WebDriver invoke() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\file.properties");
		prop.load(fis);
		if(System.getProperty("browser").contains("chrome"))
		{
		ChromeOptions c=new ChromeOptions();
		if(System.getProperty("browser").contains("headless"))
		{
			c.addArguments("headless","user-agent=mine");
		}
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver83.exe");
		driver=new ChromeDriver(c);
		
		
		
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			 System.out.println("firefox");
		}
		else
		{
			System.out.println("IE");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public String screenshot(String result,WebDriver driver) throws IOException
	{
		String path=System.getProperty("user.dir")+"\\reports\\"+result+".png";
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(path));
		return path;
	}
	
	
}

