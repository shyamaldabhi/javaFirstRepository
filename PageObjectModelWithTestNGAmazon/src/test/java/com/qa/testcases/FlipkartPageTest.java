package com.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.AmazonPage;
import com.qa.pages.FlipkartPage;

public class FlipkartPageTest extends TestBase {

	FlipkartPage flipkartPage;
	AmazonPage amazonPage;

	public FlipkartPageTest() {
		super();
	}

	@Test(priority = 6)
	public void enterProductNameToSearchInFlikart() throws Exception {
		 driver.navigate().to("https://www.flipkart.com/");
		flipkartPage.enterProductNameToSearchInFlikart();
	}

	@Test(priority = 7)
	public void productSearchButtonClickInFlipkart() {
		flipkartPage.clickOnSearchButtonInFlikart();
	}

	@Test(priority = 8)
	public void readProductRateInFlipkart() {
		flipkartPage.getProductRateInFlikart();
	}

	@BeforeMethod
	public void setup() {
		flipkartPage = new FlipkartPage();
		amazonPage = new AmazonPage();
		flipkartPage = amazonPage.navigateToFlipKart();
	}
	
	@Test(priority = 9)
	public void compareRatesAndRultDisplay() {
		flipkartPage.ratesCompare();
	}

}
