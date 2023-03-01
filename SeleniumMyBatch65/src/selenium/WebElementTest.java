package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");

		//ClassName objName= new ClassName();
		FirefoxDriver driver= new FirefoxDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("ahsdVAHDFSHVAHSDVASVCSDCMD");
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("ashgacnytbrvecwxsbrtfvdscax");
		
		WebElement LoginButton = driver.findElement(By.name("login"));
		LoginButton.click();
	}

}
