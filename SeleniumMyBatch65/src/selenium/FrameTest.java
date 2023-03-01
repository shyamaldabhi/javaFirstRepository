package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver(); 		
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> A1 = driver.findElements(By.xpath("//a[contains(text(),'Selectable')]"));
		System.out.println(A1.size());
		
		
		if(A1.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
		
		List<WebElement> A2 = driver.findElements(By.id("draggable"));
		System.out.println(A2.size());

		
		if(A2.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
		
		driver.switchTo().frame(0);  //BY INDEX
		//driver.switchTo().frame("demo-frame");           //WORKS WITH ID AND NAME, IN THIS CASE , WE CANNOT USE THIS OPTION
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));  // 
		System.out.println("------------------------After switching option-----------------");
		
		A1 = driver.findElements(By.xpath("//a[contains(text(),'Selectable')]"));
		System.out.println(A1.size());
		
		
		if(A1.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
		
		A2 = driver.findElements(By.id("draggable"));
		System.out.println(A2.size());

		
		if(A2.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
		
		driver.switchTo().defaultContent();
		System.out.println("----------------------After swtching to main page---------------");
		
		A1 = driver.findElements(By.xpath("//a[contains(text(),'Selectable')]"));
		System.out.println(A1.size());
		
		
		if(A1.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
		
		A2 = driver.findElements(By.id("draggable"));
		System.out.println(A2.size());

		
		if(A2.size()>0) {
			System.out.println("Element Present");
		} else {
			System.out.println("Element not Present");
		}
		
		//driver.switchTo().parentFrame();
		
		
	}

}
