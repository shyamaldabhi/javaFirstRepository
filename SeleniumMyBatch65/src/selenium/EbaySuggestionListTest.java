package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbaySuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver(); 		
		driver.get("https://www.ebay.ca/");
		
		driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println(all.size());
		/*
		for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}
		*/
		
		for(WebElement a :all) {
			System.out.println(a.getText());
		}
	}

}
