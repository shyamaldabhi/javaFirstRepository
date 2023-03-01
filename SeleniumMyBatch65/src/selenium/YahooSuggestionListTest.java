package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver(); 		
		driver.get("https://ca.yahoo.com/?p=us");
		
		driver.findElement(By.name("p")).sendKeys("Canada");
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(all.size());
/*
		for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}
		*/
		
		for(WebElement a:all) {
		System.out.println(a.getText());
	}
	}
}
