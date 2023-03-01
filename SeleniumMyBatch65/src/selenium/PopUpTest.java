package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException  {
		//driver.findElement(By.className("btn-close")).click();
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(2000);
		
		
		
		
		List<WebElement> popup1 = driver.findElements(By.className("_24EHh"));
		System.out.println(popup1.size());
		
		if(popup1.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
		
		if(popup1.size()>0) {
			popup1.get(0).click();
		}
		
		List<WebElement>popup2 =driver.findElements(By.className("btn-close"));
		System.out.println(popup2.size());
		
		if(popup2.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
			
		}
		if(popup2.size()>0) {
			popup2.get(0).click();
		}
		
		driver.findElement(By.id("search-key")).sendKeys("Computer");

		
		//get the popups --> close PopUps and type Computer in the searchbox
				// don't get the popup -->type Computer in the searchbox

	}

}
