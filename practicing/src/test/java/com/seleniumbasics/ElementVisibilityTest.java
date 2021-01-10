package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementVisibilityTest {

	WebDriver driver;

	@Test
	public void test4() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//1 isDisplayed(): Applicable for all elements
		driver.get("https://www.freecrm.com/register/");
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();//for submit button
		System.out.println(b1);//true
		
		//2  isEnabled() method
		boolean b2=driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);//false
		
		//Agree Checkbox
		driver.findElement(By.name("agreeTerms")).click(); // submit button is enabled now
		boolean b3 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b3);//true
	      
		//3  isSelected(): Only Applicable for radiobutton,dropdown ,checkbox
		boolean b4= driver.findElement(By.id("agreeTerms")).isSelected();
		System.out.println(b4);//true
		
		//de-select the checkbox
		driver.findElement(By.name("agreeTerms")).click();
		boolean b5= driver.findElement(By.id("agreeTerms")).isSelected();
		System.out.println(b5);//false
		

	}

}
