package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.nike.com/ca/");
		
		Actions builder = new Actions(driver);
		WebElement men = driver.findElement(By.linkText("Men"));
		
		builder.moveToElement(men).build().perform();
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("(//div[@id='DesktopMenu-0-1-0']/div[1]/div[2])//a"));
		System.out.println(all.size());

		for(WebElement a:all) {
			System.out.println(a.getText());
		}
	}

}
