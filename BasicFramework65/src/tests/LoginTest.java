package tests;

import org.testng.annotations.Test;

import data.DataFile;
import pages.LoginPage;
import utilities.Xls_Reader;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTest {

		LoginPage lp = new LoginPage();
		DataFile df = new DataFile();
		
		
			
		@BeforeMethod
		public void beforeMethod() throws IOException {
		lp.openBrowser();
		lp.openLoginPage();
	}
		@AfterMethod
		public void afterMethod() {
		lp.closeBrowser();
	}
		
		@Test (priority = 1)
	 	public void loginEmailWithSpecailChar() throws InterruptedException {
	  	lp.login(df.wrongEmailSpecialCharac, df.wrongPassword);
	  	Assert.assertEquals(lp.readEmailErr(),df.specialCharac);
  }
		@Test (priority = 2)
	 	public void loginWithEmptyEmailTest() throws InterruptedException {
		lp.login("",df.wrongPassword);
		Assert.assertEquals(lp.readEmailErr(), df.emptyEmail);

  }
		@Test (priority = 3)
	 	public void loginWithEmptyPasswordTest() throws InterruptedException {
		lp.login(df.wrongEmail,"");
		Assert.assertEquals(lp.readPasswordError(), df.emptyPassword);
}
		@Test (priority = 4)
	 	public void wrongEmailAndPasswordTest() throws InterruptedException {
		lp.login(df.wrongEmail,df.wrongPassword);
		Assert.assertEquals(lp.readGlobalErr(), df.emptyEmail);
		}
}