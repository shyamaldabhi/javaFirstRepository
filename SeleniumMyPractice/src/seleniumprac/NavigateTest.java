package seleniumprac;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.facebook.com/"); 
	driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
