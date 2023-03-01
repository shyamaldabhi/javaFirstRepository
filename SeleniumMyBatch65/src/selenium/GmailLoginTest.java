package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
		driver.findElement(By.id("identifierId")).sendKeys("djhdsjhsbvsvb");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		String expectedErr = "Couldn’t find your Google Account";
		String actualErr = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText(); //how to read the text from any location
		System.out.println(actualErr);

		if (expectedErr.equals(actualErr)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
	}

}
}