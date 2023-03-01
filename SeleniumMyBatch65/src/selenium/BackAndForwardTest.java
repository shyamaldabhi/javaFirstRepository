package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver(); 		
		driver.get("https://www.google.com/"); 
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//about page
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());// google
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//about
	}

}
