package neoStoxListeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.NeoStoxBase;

public class Listener extends NeoStoxBase implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		String name = result.getName();
	Reporter.log( name+ " Test is failed please have a look again", true);
	Reporter.log( name+" Test is failed, taken screenshot",true);
	try {
		screenshotgenral(name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	
	public void onTestSuccess(ITestResult result)
	{
	String name = result.getName();
		
	Reporter.log(name+ " Test is completed successfully", true);
	
	try {
		screenshotgenral(name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public void onTestSkipped(ITestResult result)
	{
		String name = result.getName();
	Reporter.log( name+" Test is skipped please retry", true);
	try {
		screenshotgenral(name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
