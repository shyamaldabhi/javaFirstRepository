package com.qa.testcases;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.TripAdvisorHomePage;
import com.qa.pages.TripAdvisorHotelReviewPage;

public class TripAdvisorHomePageTest extends TestBase {
	TripAdvisorHomePage homePage;
	TripAdvisorHotelReviewPage reviewPage;
	// TestUtil testUtil;

	public TripAdvisorHomePageTest() {
		super();
		TestBase.initialization();
		homePage = new TripAdvisorHomePage();
		reviewPage = new TripAdvisorHotelReviewPage();
	}

	@Test(priority = 1)
	public void productSearch() throws InterruptedException {
		Thread.sleep(3000);
		homePage.enterProductNameToSearch();
	}

	@Test(priority = 2)
	public void productSearchButtonClick() {
		homePage.clickOnSearchButton();
	}

	@Test(priority = 3)
	public void firstItemClick() throws InterruptedException {
		homePage.clickOnSearchResultFirstItem();
	}

//	@Test(priority = 4)
//	public void readProductRateinAmazon() {
//		homePage.getProductRateinAmazon();
//	}

	@Test(priority = 5)
	public void moveToFlipkart() {
		reviewPage = homePage.navigateToReviewPage();
	}

	// @AfterMethod
	// public void tearDown() {
	// // driver.quit();
	// }

}
