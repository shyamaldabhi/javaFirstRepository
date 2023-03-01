package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li"));
		System.out.println(allLinks.size());
		
		for(WebElement a : allLinks) {
			System.out.println(a.getText());
		}
	}

}
