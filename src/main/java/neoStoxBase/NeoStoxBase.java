package neoStoxBase;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import neoStoxUtility.NeoStoxUtility;

public class NeoStoxBase 
{

	 protected static WebDriver driver;
	public void launchBrowser() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\SOFTWARE TESTING\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(NeoStoxUtility.readpropertyfile("url"));
	    Reporter.log("using git branch one", true);
		
	}
	public  void screenshotgenral(String name) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File("C:\\Users\\User\\Desktop\\SOFTWARE TESTING\\AUTOMATION\\SELENIUM\\screensshots\\"+name+".jpeg");
		 
FileHandler.copy(src, destination);
		 
	}
	
	
}
