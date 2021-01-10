package TestngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NaveenGoogleTest {
	
	WebDriver driver;
	
	//1//4//7...sequence
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (4)\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	
		}
	//2
	@Test(priority=2,description="This is googletest",groups="Title")
	
      public void googleTitleTest() {
		System.out.println("title1");
    	 String title= driver.getTitle();
    	 System.out.println(title);
	}
	//5
	@Test(priority=1,description="This is googlelogo",groups="Logo")
	public void googleLogoTest() {
		
		Boolean logo= driver.findElement(By.xpath(".//*[@id='hplogo']")).isDisplayed();
		System.out.println(logo);
	}
	
	//8
	@Test(priority=3,description="This is googletest",groups="Logo")
	public void mailLinkTest() {
		
		Boolean mail= driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("mail");
		
		
	}
	//3//6//9
	@AfterMethod
	public void tesrDown() {
		System.out.println("test");
		driver.quit();
		
		
		
	}

}
