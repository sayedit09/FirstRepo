package seleniumPractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HiddenElements {

	WebDriver  driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sayed sarfaraz\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}
	
	
	@Test
	public void elementTest() {
		
		
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.xpath("//input[@id=\"hide-textbox\"] ")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        
        // Identifying the element using ID attribute and Entering the value in the text box  
  js.executeScript("document.getElementById('displayed-text').value='text123'");  
			
	}
	/*
	 * @AfterMethod public void tearnDown() { driver.quit();
	 * 
	 * 
	 * }
	 */
}
