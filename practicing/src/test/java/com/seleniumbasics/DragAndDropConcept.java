package com.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DragAndDropConcept {
	
	WebDriver driver;
	@Test
	public void test7() {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);//Switch to frame..if it is present
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.id("draggable")))//1st step  ..clickAndHold
		.moveToElement(driver.findElement(By.xpath(".//*[@id='droppable']")))  //2nd step  ..moveToElement
		.release()                                   //3rd release
		.build()
		.perform();
		
		
		
		
		
	}

}
