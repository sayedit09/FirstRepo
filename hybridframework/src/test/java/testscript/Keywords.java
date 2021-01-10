package testscript;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Keywords {
	
	 static ChromeDriver driver;
	 static FileInputStream file;
	        Properties pro;
	
	public void openbrowser() throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		file = new FileInputStream("D:\\workspace2\\hybridframework\\src\\test\\resources\\objectrepository\\objectrepository.properties");
		pro = new Properties();
		pro.load(file);
		driver.manage().window().maximize();
		//Alert alert = driver.switchTo().alert();

	}
	
public void navigate(String testData) {

		driver.get(testData);
	}
	
	
	public void click(String objectName) throws Exception {
		driver.findElement(By.xpath(pro.getProperty(objectName))).click();
		Thread.sleep(3000);
	}
   
	
	/*public void verifyidPopup(String objectName) {
		
		//driver.findElement(By.xpath(Driver.switchTo().alert()));
		
	
		
		Alert alert = driver.switchTo().alert();
		 alert.accept();
		driver.findElement(By.xpath(pro.getProperty(objectName))).alert.accept();
	}*/
	

	public void input(String testData, String objectName){


		driver.findElement(By.xpath(pro.getProperty(objectName))).sendKeys(testData);
		
		
		
	}
public void selectlist(String objectName,String testData ){
	
	Select select=new Select(driver.findElement(By.xpath(pro.getProperty(objectName))));
	select.selectByVisibleText(testData);
	System.out.println(testData);
	
}


public String verifypagetitle() {
	String actualValue=driver.getTitle();
	return actualValue;
}


}
