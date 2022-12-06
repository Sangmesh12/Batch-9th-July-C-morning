package neoStoxPomClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class NeoStoxUtility 
{
   public static String readpropertyfile(String key) throws IOException
   {
	
	Properties prop=new Properties();
	
	FileInputStream myfile=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\9th july C Morining\\NeoStox.properties");
	    
	prop.load(myfile);
	
	String value = prop.getProperty(key);
	return value;
   }
   

  
	public static void scrool(WebDriver driver,WebElement element)
	{
		
	JavascriptExecutor scriptExecutor = (JavascriptExecutor)driver;

	scriptExecutor.executeScript("arguments[0].scrollIntoView()", element);
	}
		
	public static void waitmehod(WebDriver driver,int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
	}
	public  void screenshotgenral(WebDriver driver,String name) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
		 File destination = new File("C:\\Users\\User\\Desktop\\SOFTWARE TESTING\\AUTOMATION\\SELENIUM\\screensshots\\"+name+".jpeg");
		 
FileHandler.copy(src, destination);
		 
	}
	
}
