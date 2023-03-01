package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		//ClassName objName= new ClassName();
		FirefoxDriver driver= new FirefoxDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("ahsdVAHDFSHVAHSDVASVCSDCMD");
		driver.findElement(By.cssSelector("#pass")).sendKeys("ashgacnytbrvecwxsbrtfvdscax");
		driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
	}

}
