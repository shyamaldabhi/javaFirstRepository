package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[contains(@class,'td-footer-links')]//a"));
		System.out.println(allLinks.size());
		
		for(WebElement a : allLinks) {
			System.out.println(a.getText());
		}
	}

}
