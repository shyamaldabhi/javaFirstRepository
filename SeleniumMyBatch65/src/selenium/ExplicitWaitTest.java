package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExplicitWaitTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");

		driver.findElement(By.name("B2")).click();
		// Thread.sleep(3000);

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();// click on selected button
		// l.dismiss(); //click on non selected button

	}

}
