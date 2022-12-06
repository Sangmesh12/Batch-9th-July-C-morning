package neoStoxPomClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxHomepage 
{
	
	@FindBy(id = "lbl_username") private WebElement profilename;
	
	@FindBy(id = "lbl_curbalancetop") private WebElement accountbalance;
	
	@FindBy(xpath = "//span[text()='Logout']") private WebElement logout;
	
	
	public NeoStoxHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateprofile(WebDriver driver) throws IOException
	{
		String pname = profilename.getText();
		
	
		Reporter.log("taking screenshot", true);
		
		return pname;
		
		
	}
	
	public String validatefund(WebDriver driver) throws IOException
	{
		String fund = accountbalance.getText();
		
		return fund;
		
		
	}
	
	public void logoutfromstox(WebDriver driver)
	{
		
		profilename.click();
		Reporter.log("clicking on profilename", true);
		NeoStoxUtility.waitmehod(driver, 1500);
		logout.click();
		Reporter.log("logout from stox", true);
	}
	
	
	
	
	
	

}
