package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//Thread.sleep(3000);
		
		driver.findElement(By.linkText("About")).click();
		//driver.findElement(By.partialLinkText("abo")).click();
		
		wait.until(ExpectedConditions.titleContains("Google - About Google, Our Culture & Company News"));
		String expectedTitle= "Google - About Google, Our Culture & Company News";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedUrl= "https://about.google";
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		if(expectedTitle.equals(actualTitle)& actualUrl.contains(expectedUrl)) {
	System.out.println("pass");
		}else {
			System.out.println("fail");
		
		}
		
	}
}

