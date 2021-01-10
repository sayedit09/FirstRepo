package com.seleniumbasics;

import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class WaitTypes {


	WebDriver driver;
	@Test
	public void test1() throws Exception {
	
  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
   driver=	new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);//implicit wait
   driver.get("http://www.naveenautomationlabs.com/");
   Thread.sleep(10000);
  //fluent wait
      Wait<WebDriver> fluentWait =new FluentWait<WebDriver>(driver)
    .withTimeout(50, TimeUnit.SECONDS)
    .pollingEvery(2, TimeUnit.SECONDS)
    .ignoring(SocketTimeoutException.class);
     WebElement content= fluentWait.until(new Function<WebDriver, WebElement>() {

		public WebElement apply(WebDriver driver) {
			// TODO Auto-generated method stub
			return driver.findElement(By.xpath("//input[@id='gscw_email_input']"));
			
		
		}
	
  
	});
     content.findElement(By.xpath("//input[@id=\"gscw_name_input\"]")).sendKeys("1234");
    content.sendKeys("asd@gmail.com");
     Thread.sleep(2000);
     
  /*   
  //  Explicit Wait     http://www.naveenautomationlabs.com/2018/03/difference-between-implicitwait.html
     WebDriverWait explicitWait = new WebDriverWait(driver, 10);
     explicitWait.until(ExpectedConditions.visibilityOf(content));*/
    
}
	@AfterClass
	public void close() {
		System.out.println("test");
		driver.quit();
	}
}