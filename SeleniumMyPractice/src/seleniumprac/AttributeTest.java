package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.ebay.com/");
		
		String s= driver.findElement(By.id("gh-ac")).getAttribute("placeholder");
		System.out.println(s);
		
		String p= driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(p);
	}

}
