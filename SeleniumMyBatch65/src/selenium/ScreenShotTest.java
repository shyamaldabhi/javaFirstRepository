package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		//add commons.io jar to the project
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE); //This isfor firefox, chrome driver or any class
		//File scrnFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //this line is for WebDriver
		FileUtils.copyFile(screenShotFile, new File("C:\\testing\\screenshot.png"));
	}

}
