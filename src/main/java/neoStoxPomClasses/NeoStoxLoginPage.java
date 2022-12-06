package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxLoginPage 
{

@FindBy(id = "MainContent_signinsignup_txt_mobilenumber") private WebElement userid;
	
	@FindBy(id = "lnk_signup1") private WebElement signup;
	
	@FindBy(id = "txt_accesspin") private WebElement password;
	
	@FindBy(id = "lnk_submitaccesspin") private WebElement submit;
	
	public NeoStoxLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserid(String id)
	{
		userid.sendKeys(id);
		Reporter.log("sending user name", true);
	}
	
	public void clickonsignup()
	{
		signup.click();
		Reporter.log("clicking on signup button", true);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
		Reporter.log("sending password", true);
	}
	
	public void clickonsubmit()
	{
		submit.click();
		Reporter.log("clicking on submit button", true);
	}
	
}
