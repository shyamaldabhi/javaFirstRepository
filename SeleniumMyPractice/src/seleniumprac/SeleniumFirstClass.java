package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/"); 
		
		driver.findElement(By.id("email")).sendKeys("bacacajcajcjhscsfacgac");
		driver.findElement(By.id("pass")).sendKeys("cauvcashvcasjcvasjhcasb");
		driver.findElement(By.name("login")).click();
	}

}
 