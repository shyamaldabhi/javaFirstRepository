package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
// hello sign and account
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.ca/");
		
		Actions builer = new Actions(driver);
		WebElement signin = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		
		builer.moveToElement(signin).build().perform();
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//a"));
		System.out.println(all.size());
		
		for(WebElement a : all) {
			System.out.println(a.getText());
		
		}
		}

	}


