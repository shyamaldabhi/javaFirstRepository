package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		// driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Dabhi");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("gdgdgdg");
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Aug");
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("10");
		Thread.sleep(2000);

		WebElement Year = driver.findElement(By.id("year"));
		Select y = new Select(Year);
		y.selectByValue("2000");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
