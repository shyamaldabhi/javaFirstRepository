package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver(); 
		driver.get("https://www.google.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Canada");
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ul[@role='listbox']/li"), 1));

		List<WebElement> all = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(all.size());
		
		/*for(int i=0;i<all.size();i++) {									// IN THIS WE CAN SEARCH 1 OR 2 OR 3
			System.out.println(all.get(i).getText());
		
		}*/
		for(WebElement a : all) {
			System.out.println(a.getText());    ///CAN SEARCH FROM ALL LIST
			
		}
		
		
	}
}
