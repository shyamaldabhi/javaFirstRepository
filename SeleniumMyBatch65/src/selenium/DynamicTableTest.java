package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);

		List<WebElement> row =driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(row.size());

		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(column.size());
		
		for(int i=2; i<=7;i++) {
			for(int j=1; j<=3;j++) {
			System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]/td[" + j + "]")).getText()+" | ");
		}
			System.out.println();	
		}
		
	}
	}
////table[@id='customers']//tr[i]/td[j]