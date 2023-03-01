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
  
  @Test(priority = 1)
  public void LoginEmailWithSpecialChar() throws InterruptedException {
	  	lp.login(df.emailWithSpecialChara,df.wrongPassword);
	  	Assert.assertEquals(lp.readEmailErr(), df.emailSpecCharErr);
	}
  
  @Test(priority = 2)
  public void LoginWithEmptyEmailTest() throws InterruptedException {
		lp.login("",df.wrongPassword);
		Assert.assertEquals(lp.readEmailErr(), df.emptyEmailErr);
}
  
  @Test(priority = 3)
  public void LoginWithEmptyPasswordTest() throws InterruptedException {
	  	lp.login(df.wrongEmail,"");
	  	Assert.assertEquals(lp.readPasswordErr(), df.emptyPasswordErr);
  }
  
  
  @Test(priority = 4)
  public void LoginWithWrongEmailAndPasswordTest() throws InterruptedException {
	  	lp.login(df.wrongEmail,df.wrongPassword);
	  	Assert.assertEquals(lp.readGlobalErr(), df.globalErr);
  }
  }
  
