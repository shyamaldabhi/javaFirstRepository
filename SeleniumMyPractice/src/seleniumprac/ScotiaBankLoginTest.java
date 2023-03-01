package seleniumprac;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=vvFj2K8KI3g&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoidnZGajJLOEtJM2ciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1ODI2OTY5NCwiaWF0IjoxNjU4MjY4NDk0LCJqdGkiOiI0ZjdlYjViZi1hOTU0LTQ4YzctYWU4MS1hNzkxZDBmOWNlNmQiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.VTDeLeJmUZ1nIGVicka0FzaED83apSu6Aeayn10iy4jkI2RB8Q9ZyrxyVBI_uXH_Lmij81gEzWzpQOl0mCjbbadSYsGhW__8gvIENZaIJ9jYw7fJKukBSCL-5q7VL1O32HmmGKyWhMVTL9vvZ_R84gE-Jai5ZTlcVAHlr1SdvXsE-Ryo0mCTMJaOUZW8Vk1SYe-TTKd1u37e7j1vsaknyhl3NTagEp4zum6PmPHfaZ8_G-kvtDoUJq7RDIaYgz8pMdamtE8BnXd-WJm4f-JeBq0L_i2UNNMXKIlQt_E8nkOH6oRHTHBLBn4W9LRYJsdmWLUn179MI3ZJhMW2-vzV3Q&preferred_environment="); 
	
		driver.findElement(By.id("usernameInput-input")).sendKeys("sahsaghsaghas@#$");
		driver.findElement(By.id("password-input")).sendKeys("sdhjsdhsdhjjhsdhjnaxn");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(2000);
		
		String expectedErr = "Please enter a username or card number without special characters.";
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
		System.out.println("Pass");
		}else {
			System.out.println("Fails");
		}
		
				
	}

}
