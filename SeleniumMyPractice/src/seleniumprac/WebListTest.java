package seleniumprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebListTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='KxwPGc AghGtd']/a"));
		System.out.println(allLinks.size());
		
		for(int i=0;i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
			//output = 10 because of whole footer
		}	

	}

}
