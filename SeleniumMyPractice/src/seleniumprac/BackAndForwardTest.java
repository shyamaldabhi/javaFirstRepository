package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());// google
		
		driver.navigate().forward();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//about

		
	}

}
