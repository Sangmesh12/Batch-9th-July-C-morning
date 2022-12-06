package neoStoxTestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neoStoxBase.NeoStoxBase;
import neoStoxPomClasses.NeoStoxHomepage;
import neoStoxPomClasses.NeoStoxLoginPage;
import neoStoxPomClasses.NeoStoxWelcomePage;
import neoStoxUtility.NeoStoxUtility;


@Listeners(neoStoxListeners.Listener.class)
public class NeoStoxTestClassesUserID extends NeoStoxBase
{
	 NeoStoxLoginPage login;
	 NeoStoxHomepage home;
	 NeoStoxWelcomePage welcome;
	 String screenshot="NeoStoxUserID";
	
	@BeforeClass
	public void launchbrowser() throws IOException
	{
		launchBrowser();
		login=new NeoStoxLoginPage(driver);
		home=new NeoStoxHomepage(driver);
		welcome=new NeoStoxWelcomePage(driver);
		
	}
	
	@BeforeMethod
	public void loginfunction() throws IOException, InterruptedException
	{
	
		NeoStoxUtility.waitmehod(driver, 1000);
		login.enteruserid(NeoStoxUtility.readpropertyfile("id"));
		login.clickonsignup();
		NeoStoxUtility.waitmehod(driver, 2000);
		login.enterpassword(NeoStoxUtility.readpropertyfile("pass"));
		Thread.sleep(9000);
		login.clickonsubmit();
		Thread.sleep(1000);
		welcome.clickonOk();
		Thread.sleep(1000);
		welcome.clickonclose();
		
	}
	
	
	
  @Test
  public void validateUserID() throws IOException 
  {
	  Assert.assertEquals(home.validateprofile(driver), NeoStoxUtility.readpropertyfile("actualUserId"),"actual and expected userID are not matchinh then TC is failed");
	  
	  Reporter.log("actual and expected userID are  matching then TC is passed", true);
	  
	  NeoStoxUtility.waitmehod(driver, 2000);
	    
  }
  
  @AfterMethod
  public void clickonlogout() 
  {
	  home.logoutfromstox(driver);
  }
  
  @AfterClass
  public void closingbrowser()
  {
	  Reporter.log("closing browser", true);
	  driver.close();
  }
  
  
}
