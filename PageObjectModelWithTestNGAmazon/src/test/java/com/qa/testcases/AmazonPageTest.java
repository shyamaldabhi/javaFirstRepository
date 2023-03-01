package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AmazonPage;
import com.qa.pages.FlipkartPage;

public class AmazonPageTest extends TestBase {
	AmazonPage amazonPage;
	FlipkartPage flipkartPage;
	// TestUtil testUtil;

	public AmazonPageTest() {
		super();
		TestBase.initialization();
		amazonPage = new AmazonPage();
		flipkartPage = new FlipkartPage();
	}

	@BeforeMethod
	public void setUp() {
//		TestBase.initialization();
		
	}

	@Test(priority = 1)
	public void productSearch() {
		amazonPage.enterProductNameToSearch();
	}

	@Test(priority = 2)
	public void productSearchButtonClick() {
		amazonPage.clickOnSearchButton();
	}

	@Test(priority = 3)
	public void firstItemClick() {
		amazonPage.clickOnSearchResultFirstItem();
	}

	@Test(priority = 4)
	public void readProductRateinAmazon() {
		amazonPage.getProductRateinAmazon();
	}

	@Test(priority = 5)
	public void moveToFlipkart() {
		flipkartPage = amazonPage.navigateToFlipKart();
	}

	// @AfterMethod
	// public void tearDown() {
	// // driver.quit();
	// }

}
