package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li")); 
		System.out.println(allLinks.size());
		
		//li = we can directly jump to the tagname which we want
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		
	}
	}
}
