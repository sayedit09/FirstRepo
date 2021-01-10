package testscript;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Keywords {

	static ChromeDriver driver;
	static FileInputStream file;
	Properties pro;

	public void openbrowser() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (4)\\chromedriver.exe");
		driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		file = new FileInputStream(
				"D:\\workspace2\\practicing\\src\\test\\resources\\objectrepository\\objectrepository.properties");
		pro = new Properties();
		pro.load(file);
		driver.manage().window().maximize();

	}

	public void navigate(String testdata) {

		driver.get(testdata);

	}

	public String verifypagetitle() {
		String actualvalue = driver.getTitle();
		return actualvalue;

	}
	// ---------You can switch between windows as below:
	//Is there any way to connect and focus to new opened browser window?
	/*// Store the current window handle
	String winHandleBefore = driver.getWindowHandle();

	// Perform the click operation that opens new window

	// Switch to new window opened
	for(String winHandle : driver.getWindowHandles()){
	    driver.switchTo().window(winHandle);
	}

	// Perform the actions on new window

	// Close the new window, if that window no more required
	driver.close();

	// Switch back to original browser (first window)
	driver.switchTo().window(winHandleBefore);

	// Continue with original browser (first window) */
	public void click(String object) throws Exception {

		driver.findElement(By.xpath(pro.getProperty(object))).click();
		Thread.sleep(3000);
		
		File scrfile= driver.getScreenshotAs(OutputType.FILE);
		String date= new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());//It is used when..we need the ..SS with system time and date.
		File destfile= new File("D:\\SS folder "+date+".png");
		org.openqa.selenium.io.FileHandler.copy (scrfile,destfile);//from java 8 FileUtils is replaced with FileHandler.
	}
	
	public void getWindowHandle() throws Exception {
		String windowHandle = driver.getWindowHandle();

		//Get the list of window handles
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		//Use the list of window handles to switch between windows
		driver.switchTo().window((String) tabs.get(1));
		
			Thread.sleep(3000);
		}
		
	
	public void input(String testdata,String object) {
		driver.findElement(By.xpath(pro.getProperty(object))).sendKeys(testdata);
		
		
		
	}

	public void selectlist(String testdata, String object) {
		
	Select select =new Select(driver.findElement(By.xpath(pro.getProperty(object))));
	select.selectByVisibleText(testdata);
	System.out.println(testdata);
		
		
	}

}
