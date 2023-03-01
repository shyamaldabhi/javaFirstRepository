package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver(); 		
		driver.get("https://www.google.com/"); 
		
		/*- Using WebElement we cannot verify,element is present or not
		
		if(driver.findElement(By.linkText("About")).isDisplayed()) {
			System.out.println("Element Present");
		}else {
			System.out.println("Not Present");
		}
		*/
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
		
	}

}
