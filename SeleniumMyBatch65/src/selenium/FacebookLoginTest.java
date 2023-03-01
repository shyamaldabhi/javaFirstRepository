package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver= new FirefoxDriver(); 
		driver.get("https://www.facebook.com/");
		
		//1. className - not working
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sdgcafsdchacvcajhcweb");//Because of space in classname,we cannot use
		
		//2. cssSelector - not now, learn syntax for css
		//driver.findElement(By.cssSelector("")).sendKeys("agsvfajhcasjc");
		
		//3. id - id attribute, working
		//driver.findElement(By.id("email")).sendKeys("vadghcvjashvcz");
		
		//4. linkTest - only for link, not working
		//driver.findElement(By.linkText(""));
		
		//5. name - name attribute, working
		//driver.findElement(By.name("email")).sendKeys("ahgcagcgac");
		
		//6. partialLinkTest - only for link, not working
		//driver.findElement(By.partialLinkText(""));
		
		//7. tagName - not unique, not working
		//driver.findElement(By.tagName("input")).sendKeys("asdscaccaascac");
		
		//8.xpath - not now, learn syntax for css
		//driver.findElement(By.xpath("")).sendKeys("sdfsufgufsufbu");;
		
		//Password
				driver.findElement(By.name("pass")).sendKeys("sdgsfhsadhgsdagasrh");
				
		//Login Button
				driver.findElement(By.tagName("button")).click();


		
	}

}
