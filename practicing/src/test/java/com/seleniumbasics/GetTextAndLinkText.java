package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GetTextAndLinkText {
	
	WebDriver driver;
	@Test
	public void test2 () throws Exception  {
	
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://way2automation.com/");
		
		String s=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/section[1]/div/div/div/div[1]/div")).getText();  //getText
		System.out.println(s);
		driver.findElement(By.linkText("MEMBER LOGIN")).click();   //LinkText
		Thread.sleep(2000);
		java.util.List<WebElement> list =driver.findElements(By.tagName("a")); // To find number of links or image on the page(Just type tagname in the bracket ).
	
		System.out.println(list.size());
		
		
	}
	@AfterClass
	public void close() {
		System.out.println("test");
		driver.close();
	}

}
