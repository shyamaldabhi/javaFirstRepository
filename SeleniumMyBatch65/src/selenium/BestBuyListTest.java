package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BestBuyListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
		
		List<WebElement> all = driver.findElements(By.xpath("(//div[@class='scrollWrapper_YCQ-X'])[1]/a"));
		
		System.out.println(all.size());
		
		for(WebElement a:all) {
			System.out.println(a.getText());
			
		}
		//print size and text list of shop
	}

}
