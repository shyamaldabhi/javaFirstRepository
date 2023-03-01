package selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		WebDriver driver= new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.linkText("Help")).click();

		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String mainwindow = iter.next();
		String childwindow = iter.next();
		System.out.println(mainwindow);
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle()); //help page
		driver.close();//close only help window
		Thread.sleep(2000); //we don`t have to use thread.sleep
		
		driver.switchTo().window(mainwindow);
		System.out.println(driver.getTitle()); //Gmail page
		driver.quit(); //kill the page close the window and cannot use driver after calling quit
		
	}

}
