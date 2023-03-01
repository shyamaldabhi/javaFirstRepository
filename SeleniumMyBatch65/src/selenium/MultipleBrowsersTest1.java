package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest1 {

	public static void main(String[] args) {

		Xls_Reader d = new Xls_Reader("C:\\testing\\NikulTest.xlsx");
		
		String browser = d.getCellData("Data1","browser",2); // Firefox, Chrome, Safari //read data from excel
		WebDriver driver = null;
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
			driver= new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}else { 
			System.setProperty("webdriver.safari.driver","C:\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("sdgcafsdchacvcajhcweb");
		driver.findElement(By.name("pass")).sendKeys("sdgsfhsadhgsdagasrh");
		driver.findElement(By.tagName("button")).click();
	}

}
