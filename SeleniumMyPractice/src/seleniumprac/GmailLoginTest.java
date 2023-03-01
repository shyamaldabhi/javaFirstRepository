package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
	
		driver.findElement(By.id("identifierId")).sendKeys("djhdsjhsbvsvb");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		String expectedErr = "Couldn’t find your Google Account";
		String actualErr = driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText(); //how to read the text from any location
		System.out.println(actualErr);

		if (expectedErr.equals(actualErr)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
	}
	}

}
