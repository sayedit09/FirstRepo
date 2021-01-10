package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovementConcept {
	
	
	WebDriver driver;
	@Test   
	public void test6() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
		
		          WebDriver driver=  new ChromeDriver();
		          
		          driver.manage().window().maximize();
		          driver.manage().deleteAllCookies();
		         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		          driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		          driver.get("http://way2automation.com/index.html");
		          
		             Actions action= new Actions(driver);
		             //Thread.sleep(5000);
		             action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Courses')]"))).build().perform();
		             driver.findElement(By.xpath("//div[@id=\"navbar-collapse-1\"]/ul/li[3]/ul/li//a[contains(text(),'Selenium')]")).click();
		          
		          
	}
	

}
