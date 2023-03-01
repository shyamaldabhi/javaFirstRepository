package seleniumprac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/");
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("C:\\testing\\screenshot.png"));
		
		
	}

}
