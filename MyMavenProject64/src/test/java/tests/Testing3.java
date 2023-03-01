package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softAssert = new SoftAssert();
		
	  @Test (priority = 1)//Create new user test@test.com
	  public void createUser() {
		  	System.out.println("I am in home test");
		  	System.out.println("Before Assertion");
			Assert.assertTrue(2>3, "Verify Element");//we use regular assert in industry
			System.out.println("After Assertion");
			Assert.assertEquals("abc","abc");
			
	  }
	  @Test(priority = 2, dependsOnMethods = "createUser") //Edit new user test@test.com
	  public void editUser() {
		  	System.out.println("Before Assertion");
			Assert.assertTrue(2>3, "Verify Element");//we use regular assert in industry
			System.out.println("After Assertion");
			softAssert.assertAll();//similar to error collector in Junit
			
	  }

		@Test(priority = 3, dependsOnMethods = "editUser") // Delete new user test@test.com
		public void deleteUser() {
			System.out.println("I am in end test");
			System.out.println("Before Assertion");
			Assert.assertTrue(2 > 3, "Verify Element1");// we use regular assert in industry
			System.out.println("After Assertion");
			Assert.assertEquals("abc", "abc1");
			System.out.println("After 2nd assertion");
			softAssert.assertAll();

		}
	  }
