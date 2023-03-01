package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get(
				"https://auth.scotiaonline.scotiabank.com/online?oauth_key=ZkAwT1CUDAY&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiWmtBd1QxQ1VEQVkiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY1ODA3MzMxNSwiaWF0IjoxNjU4MDcyMTE1LCJqdGkiOiI3MzFkYWYzMy1kNzFlLTRjMzEtYWQ4Ny05MmRjOTgwOTk4NTkiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.Dgs64JW5tMRY6Kz7LyA7u64iaCSp_1jvQy79UeuERTJr_npUk2iKh1ktC4eik-7DKe4_rDOD8XdK9_a2SHGWKcDS1MTJF33UqfQ_EnP--j_pEXfqjxs0I09CNeLl1j0IzfB_VVmBJaK0dSVQHYZxSK7EHAMFJ8OuNPwfO7zHqhRKUQyExV1YmRhhvy62xo8kX-pFLvikA01dd4E3RLUcBdQySxuIIdvbghPffIiWg9mBRrnBRcINuw5FS106JqpG8_5sNcpz1T4VKZ4mh5544JzoV4hv736Ngcp63DGBrgTg_S_x_tCe5Wl9LslNbqBLjkUdWjFiebNJsDoUVDuWTA&preferred_environment=");

		driver.findElement(By.name("usernameInput")).sendKeys("djhsdhsvhsjh@##");
		driver.findElement(By.id("password-input")).sendKeys("dhfhfhfhhdhfhd");
		driver.findElement(By.id("signIn")).click();

		Thread.sleep(3000);

		String expectedErr = "Please enter a username or card number without special characters.";
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();  //how to read the text from any location
		System.out.println(actualErr);

		if (expectedErr.equals(actualErr)) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

}
