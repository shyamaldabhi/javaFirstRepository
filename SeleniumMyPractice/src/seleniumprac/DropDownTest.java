package seleniumprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
		
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText()+"------"+allOptions.get(i).isSelected());
		}
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByValue("2984");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Books");
		
		System.out.println("-------------After Selection----------");
		for(int i=0;i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText()+"-------"+allOptions.get(i).isSelected());
		}
	}

}
