package testscript;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner extends Keywords implements ITestListener  {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		File scrfile= driver.getScreenshotAs(OutputType.FILE);	
		File destfile=new File("D:\\SS folder\\pass.png");
		try {
			org.openqa.selenium.io.FileHandler.copy(scrfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	}

	public void onTestSuccess(ITestResult arg0) {
		
		File scrfile= driver.getScreenshotAs(OutputType.FILE);
		File destfile= new File("D:\\SS folder\\screenshot.png");
		try {
			org.openqa.selenium.io.FileHandler.copy (scrfile,destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
