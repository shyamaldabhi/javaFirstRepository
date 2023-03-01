package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		
		String s= driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(s);
		
		//getAttribute("value"); = Once you type and want to read then this code is written
		
		String p= driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(p);
	}

}
