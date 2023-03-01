package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver(); 		
		driver.get("https://www.ebay.ca/"); 
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
		
		for(int i=0;i<allOptions.size();i++) {
			if(allOptions.get(i).isSelected()) {
			System.out.println(allOptions.get(i).getText()+"---------"+allOptions.get(i).isSelected());
			
		}
		 }
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s = new Select(dropdown);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		s.selectByValue("2984");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Books");
		Thread.sleep(2000);
		System.out.println("-------------After Selection----------");
		/*
		for(int i=0;i<allOptions.size();i++) {
			if(allOptions.get(i).isSelected())
			System.out.println(allOptions.get(i).getText()+"---------"+allOptions.get(i).isSelected());
			
		}*/
		
		for(WebElement a : allOptions) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"-----------"+a.isSelected());
		}
		}
	
	}
}
