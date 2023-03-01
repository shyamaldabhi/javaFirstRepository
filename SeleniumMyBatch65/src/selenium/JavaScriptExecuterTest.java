package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.adidas.ca/en");
		
		Thread.sleep(5000);
			WebElement careers = driver.findElement(By.linkText("Careers"));
			
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		/*option 1 - using x and y coordinates
		System.out.println(careers.getLocation());
		jse.executeScript("window.scrollBy(0,5000)");
		careers.click();
	
		Option 2 - Scroll until the element is in the view
		jse.executeScript("arguments[0].scrollIntoView(true);",careers);
		careers.click();
		
		option 3 - direct click using JavascriptExecuter
		jse.executeScript("arguments[0].click();", careers);
		*/
		jse.executeScript("arguments[0].click();", careers);
	}

}
