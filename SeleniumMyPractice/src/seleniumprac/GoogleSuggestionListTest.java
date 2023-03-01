package seleniumprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canada");
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@role='presentation']//li"));
		System.out.println(all.size());
		
		for(int i=0;i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}
	}

}
