package demoCalculator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class CalcualatorWiniumTest {
	static WiniumDriver driver =null;
	static WiniumDriverService service= null;
	static DesktopOptions options =null;

	@BeforeClass
public static  void setUpinvironment() throws IOException{
	options=new DesktopOptions();
	options.setApplicationPath("C:\\Windows\\system32\\calc.exe");

	File driverPath=new File("D:\\Winium.Desktop.Driver (1)\\Winium.Desktop.Driver.exe");
	service= new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
	
	service.start();
	}
	@Before
public void startDriver() {
	driver=new WiniumDriver(service,options);
}
	@Test
	
	
	public void selectCalculatorTest() throws InterruptedException {
	WebElement calcFrame=driver.findElement(By.className("CalcFrame"));
		WebElement menu =calcFrame.findElement(By.id("MenuBar"));
		WebElement viewMenu= menu.findElement(By.name("View"));
		viewMenu.click();
		viewMenu.findElement(By.name("Scientific")).click();
		  waitfortwoSeconds();
		calcFrame.findElement(By.id("132")).click();
		  waitfortwoSeconds();
		calcFrame.findElement(By.id("93")).click();
		  waitfortwoSeconds();
		  calcFrame.findElement(By.id("134")).click();
		  waitfortwoSeconds();
		  calcFrame.findElement(By.id("121")).click();
	
		  waitfortwoSeconds();
	
}
	@Test
	public void selectStandardViewSubtractNumberTest () throws InterruptedException{
		WebElement calcFrame=driver.findElement(By.className("CalcFrame"));
		WebElement menu =calcFrame.findElement(By.id("MenuBar"));
		WebElement viewMenu= menu.findElement(By.name("View"));
		viewMenu.click();
		viewMenu.findElement(By.name("Standard")).click();
		 waitfortwoSeconds();
		 calcFrame.findElement(By.id("134")).click();
		  waitfortwoSeconds();
		calcFrame.findElement(By.id("94")).click();
		  waitfortwoSeconds();
		  calcFrame.findElement(By.id("132")).click();
		  waitfortwoSeconds();
		  calcFrame.findElement(By.id("121")).click();
		  waitfortwoSeconds();
		
		}
	@After
	public void stopDriver() {
		driver.close();
		
	}
	@AfterClass
	public static void  tearDown() {
		service.stop();
	}
	public void waitfortwoSeconds()throws InterruptedException {
		Thread.sleep(2000);
		
	}
}
