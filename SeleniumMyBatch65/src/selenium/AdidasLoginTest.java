package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-email")).sendKeys("sdghghgh@hghg.com");
		driver.findElement(By.id("login-password")).sendKeys("hfhfhfhfhfhfhfh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Email Log in']")).click();
		
		Thread.sleep(2000);

		String expectedErr = "Your request timed out – please retry";
		String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();  //how to read the text from any location
		System.out.println(actualErr);

		if (expectedErr.equals(actualErr)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		
	}
	}
}
