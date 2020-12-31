/**
 * 
 */
package automateDragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author GLB-171
 *
 */
public class DragAndDrop {
	private WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() throws Exception
	  {
		 // System.setProperty("webdriver.gecko.driver", "D:\\workspace2\\Appone\\Drivers\\chromedriver.exe");
		  System.setProperty("webdriver.gecko.driver"," E:\\workspace2 (5)\\workspace2\\Appone\\Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		   driver.manage().window().maximize();
		  }
	  
	  @Test
	  public void loginSuccess() throws InterruptedException
	  {
		  
		  driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		  Thread.sleep(2000);
		  Actions action = new Actions(driver);
		 // Thread.sleep(2000);
         WebElement start = driver.findElement(By.xpath("//span[contains(text(),'Draggable 2')]"));
         // WebElement start = driver.findElement(By.linkText("Draggable 1"));
      
         WebElement end = driver.findElement(By.xpath("//div[@id='mydropzone']"));
        
          action.dragAndDrop(start,end).perform();
         // Thread.sleep(3000);
          //driver.close();

}
}