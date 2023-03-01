package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class TripAdvisorHomePage extends TestBase {

	public TripAdvisorHomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='component_1']/div/div[2]/div/form/input[1]")
	WebElement tripsearchTextboxClick1;
	
//	@FindBy(xpath = "//div[@id='component_4']/div/div/form/input[1]")
//	WebElement tripsearchTextboxClick2;
	
	@FindBy(xpath = "//div[@title = 'Search']")
	WebElement tripsearchTextboxClick;
	
//	@FindBy(xpath = "//div[@title = 'Search']")
//	WebElement tripsearchTextboxClick;
	
	@FindBy(xpath = "//div[@id='component_4']/div/div/form/input[1]")
	WebElement tripsearchTextbox1;
	
	@FindBy(xpath = "//input[@id='mainSearch']")
	WebElement tripsearchTextbox;

	@FindBy(xpath = "//div[@id='component_4']/div/div/form/button[3]")
	WebElement searchButtonIcon;
	
	@FindBy(xpath = "//button[@id='SEARCH_BUTTON']")
	WebElement searchButton;

	@FindBy(xpath = "//div[@class='search-results-list'][@data-widget-type='TOP_RESULT']/div[2]")
	WebElement searchResultFirstItem;

	@FindBy(xpath = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")
	WebElement searchResultFirstItemRateinAmazon;

	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")
	WebElement searchResultFirstItemRateinAmazon1;

	public void enterProductNameToSearch() {
		try {
			tripsearchTextboxClick.click();
			tripsearchTextbox.sendKeys("Club Mahindra");
			searchButton.click();
		} catch (Exception e) {
			System.out.println("");
		}
		
		try {
			tripsearchTextboxClick1.click();
			tripsearchTextbox1.sendKeys("Club Mahindra");
			searchButtonIcon.click();
		} catch (Exception e) {
			System.out.println("");
		}
		
		try {
			tripsearchTextboxClick.click();
			tripsearchTextbox.sendKeys("Club Mahindra");
			searchButton.click();
		} catch (Exception e) {
			System.out.println("");
		}
		
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void clickOnSearchResultFirstItem() throws InterruptedException {
		Thread.sleep(3000);
		searchResultFirstItem.click();
		
	}

	public void getProductRateinAmazon() {
		try {
			String productRateInAmazon = searchResultFirstItemRateinAmazon.getText().toString();
			System.out.println(" ===========>>>>>>> Amazon Rate : " + productRateInAmazon);
			// TestBase.amazonProductRate = Integer.parseInt(productRateInAmazon);
			TestBase.amazonProductRate = Integer.valueOf(productRateInAmazon.replace(",", ""));
			// System.out.println(" ===========>>>>>>> Amazon Rate : " +
			// TestBase.amazonProductRate);
		} catch (Exception e) {
			String productRateInAmazon1 = searchResultFirstItemRateinAmazon1.getText().toString();
			System.out.println(" ===========>>>>>>> Amazon Rate : " + productRateInAmazon1);
			// TestBase.amazonProductRate = Integer.parseInt(productRateInAmazon1);
			TestBase.amazonProductRate = Integer.valueOf(productRateInAmazon1.replace(",", ""));
			// System.out.println(" ===========>>>>>>> Amazon Rate : " +
			// TestBase.amazonProductRate);
		}

	}

	public TripAdvisorHotelReviewPage navigateToReviewPage() {
		return new TripAdvisorHotelReviewPage();

	}

}
