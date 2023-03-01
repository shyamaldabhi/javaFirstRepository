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

public class LoginPage {
	WebDriver driver;
	
	@FindBy(id = "usernameInput-input")
    public WebElement email;
	
	@FindBy(name = "password")
    public WebElement password;
	
	@FindBy(id = "signIn")
    public WebElement signInButton;
	
	@FindBy(id = "globalError")
    public WebElement globalErr;
	
	@FindBy(id = "UsernameTextField__errors-usernameInput")
    public WebElement emailErr;
	
	@FindBy(id = "PasswordTextField__errors-password")
    public WebElement passwordErr;
	
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
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=ZkAwT1CUDAY&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiWmtBd1QxQ1VEQVkiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1ODA3MzMxNSwiaWF0IjoxNjU4MDcyMTE1LCJqdGkiOiI3MzFkYWYzMy1kNzFlLTRjMzEtYWQ4Ny05MmRjOTgwOTk4NTkiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.Dgs64JW5tMRY6Kz7LyA7u64iaCSp_1jvQy79UeuERTJr_npUk2iKh1ktC4eik-7DKe4_rDOD8XdK9_a2SHGWKcDS1MTJF33UqfQ_EnP--j_pEXfqjxs0I09CNeLl1j0IzfB_VVmBJaK0dSVQHYZxSK7EHAMFJ8OuNPwfO7zHqhRKUQyExV1YmRhhvy62xo8kX-pFLvikA01dd4E3RLUcBdQySxuIIdvbghPffIiWg9mBRrnBRcINuw5FS106JqpG8_5sNcpz1T4VKZ4mh5544JzoV4hv736Ngcp63DGBrgTg_S_x_tCe5Wl9LslNbqBLjkUdWjFiebNJsDoUVDuWTA&preferred_environment=");
	}
	
	public  void closeBrowser() {
		driver.quit();
	}
	
	public void login(String a, String b) {
		email.sendKeys(a);
		password.sendKeys(b);
		signInButton.click();
	}
	
	public String readEmailErr() {
		String actualErr = emailErr.getText(); 
		System.out.println(actualErr);
		return actualErr;
	}
	
	public String readPasswordErr() {
		String actualErr = passwordErr.getText();  
		System.out.println(actualErr);
		return actualErr;
	}
	
	public  String readGlobalErr() {
		String actualErr = globalErr.getText();  
		System.out.println(actualErr);
		return actualErr;
	}
}
