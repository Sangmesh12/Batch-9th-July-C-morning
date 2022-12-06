package neoStoxPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeoStoxWelcomePage 
{
  @FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement ok;
  
  @FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement close;
  
  public NeoStoxWelcomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void clickonOk()
  {
	  
	  ok.click();
	  Reporter.log("clicking on OK button", true);
  }
  
  public void clickonclose()
  {
	  close.click();
	  Reporter.log("clicking on close button", true);
  }
  
	
	
}
