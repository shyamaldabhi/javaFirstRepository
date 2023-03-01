package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {

		//our organzi - size 7 and text
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://mississauga.ca/");
		driver.findElement(By.xpath("//ul[@class='main-nav-links']/li[3]//button")).click();
		Thread.sleep(2000);
		
		List<WebElement> org = driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//a"));
		System.out.println(org.size());
		Thread.sleep(2000);
		
		for(WebElement a:org) {
			System.out.println(a.getText());
		if(a.getText().equals("Jobs and volunteer")) {
			a.click();
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			break;
		}
	}
	}
	}
