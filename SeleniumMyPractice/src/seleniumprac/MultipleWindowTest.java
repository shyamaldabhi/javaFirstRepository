package seleniumprac;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Help")).click();

		Set <String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainwindow = iter.next();
		String childwindow =iter.next();
		System.out.println(mainwindow);
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(mainwindow);
		System.out.println(driver.getTitle());		
	}

}
