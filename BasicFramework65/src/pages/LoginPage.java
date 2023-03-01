package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Xls_Reader;


public class LoginPage {

	WebDriver driver;
	/*public WebElement email = driver.findElement(By.name("usernameInput"));
	public WebElement password = driver.findElement(By.name("password"));
	public WebElement signin = driver.findElement(By.id("signIn"));
	public WebElement emailerr = driver.findElement(By.id("UsernameTextField__errors-usernameInput"));
	public WebElement passworderr = driver.findElement(By.id("PasswordTextField__errors-password"));
	public WebElement globalerr = driver.findElement(By.id("globalError"));*/
	
	@FindBy(id = "usernameInput-input")
    public WebElement email;
	
	@FindBy(name = "password")
    public WebElement password;
	
	@FindBy(id = "signIn")
    public WebElement signin;
	
	@FindBy(id = "globalError")
    public WebElement globalerr;
	
	@FindBy(id = "UsernameTextField__errors-usernameInput")
    public WebElement emailerr;
	
	@FindBy(id = "PasswordTextField__errors-password")
    public WebElement passworderr;

	public void openBrowser() throws IOException {
		FileInputStream f =new FileInputStream("C:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser"); 
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");	
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}else { 
			System.setProperty("webdriver.safari.driver","C:\\SeleniumJars\\safaridriver.exe");
			driver = new SafariDriver();
		}
		PageFactory.initElements(driver, this);

	}
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=5KIpEYnG1ww&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiNUtJcEVZbkcxd3ciLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1ODA3MzI1MSwiaWF0IjoxNjU4MDcyMDUxLCJqdGkiOiJjMGZmYzljZi1hNTE0LTRhMTktODFkZi1mMWMyYTE0NmRiOWIiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.xfq1UsO_7Aqo1xMtnRKa1z0bsfTSn-D3KBg19BV1jnsv3qDPGTAERqrun8IyR-0VRf9o8w6ACXZKsJ1SgGjYpJ3_Xg7vntN092hJ0vb7_xG0JMaA0ToxMJZqY0_inpI5SBSHjh_ZtkFuiVH0UaHLKebWbcy7vAdWsTnTVtqHi5Fyl3j92niHQu1vY2EYxzk_8-CRwBxqrYhhrpsqm25VtAcKzC9rq0WqUUZllmMrHdAoHR6wkZZ-xlLITh7lFhn4NLA8P_CJuFmKytrQ47bHK1g8a7f0JaJ6o-3gzgC0vJY7zFzf7MfqCT9oX2LsN4gooc1umOaetOxjovRa4W9elw&preferred_environment=");
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void login(String a,String b) throws InterruptedException {
		email.sendKeys(a);
		password.sendKeys(b);
		signin.click();
		Thread.sleep(3000);
	}
	
	public String readEmailErr() {
		String actual =emailerr.getText();
		System.out.println(actual);
		return actual;
	}
	
	public String readPasswordError() {
		String actual =passworderr.getText();
		System.out.println(actual);
		return actual;
	}
	
	public String readGlobalErr() {
		String actual =globalerr.getText();
		System.out.println(actual);
		return actual;
	}

	}


