package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		Thread.sleep(7000);
		
		
		List<WebElement> allRadios = driver.findElements(By.name("group1"));
		System.out.println(allRadios.size());
		
		for(int i=0; i<allRadios.size(); i++) {
			System.out.println(allRadios.get(i).getAttribute("value")+"--------"+allRadios.get(i).isSelected());
		}
		allRadios.get(2).click();
		System.out.println("-----------------------");
		
		for(int i=0; i<allRadios.size(); i++) {
			System.out.println(allRadios.get(i).getAttribute("value")+"--------"+allRadios.get(i).isSelected());
		
	}
	}

}
