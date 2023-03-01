package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-email")).sendKeys("sdghghgh@hghg.com");
		driver.findElement(By.id("login-password")).sendKeys("hfhfhfhfhfhfhfh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-auto-id='login-form-login']")).click();
		
		Thread.sleep(2000);
		
		String expectedErr = "Your request timed out – please retry";
		String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	} 

}
