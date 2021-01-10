package com.parameters;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	WebDriver driver;
	@Test
	@Parameters({"env","browser","url","emailid","password"})
	public void webLogin(String env,String browser,String url,String emailid,String password) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		driver.getWindowHandle();
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(1));
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(emailid);
		driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id=\"login\"]")).click();
		
		}
	
	
}
