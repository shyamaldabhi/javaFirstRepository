package com.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.TripAdvisorHomePage;
import com.qa.pages.TripAdvisorHotelReviewPage;

public class TripAdvisorHotelReviewPageTest extends TestBase {

	TripAdvisorHotelReviewPage reviewPage;
	TripAdvisorHomePage homepage;

	public TripAdvisorHotelReviewPageTest() {
		super();
	}

	@Test(priority = 6)
	public void enterProductNameToSearchInFlikart() throws Exception {
		
		Set<String> allwindows = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(allwindows);
		
		driver.switchTo().window(list.get(1));
		System.out.println(" ======>>> New Window Title  ==============: "+driver.getTitle());
		
		reviewPage.writeView();
	}

	@Test(priority = 7)
	public void productSearchButtonClickInFlipkart() {
		reviewPage.clickOnSearchButtonInFlikart();
	}

	@Test(priority = 8)
	public void readProductRateInFlipkart() {
		reviewPage.getProductRateInFlikart();
	}

	@BeforeMethod
	public void setup() {
		reviewPage = new TripAdvisorHotelReviewPage();
		homepage = new TripAdvisorHomePage();
		reviewPage = homepage.navigateToReviewPage();
	}
	
}
