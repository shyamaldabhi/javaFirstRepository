package com.qa.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class TripAdvisorHotelReviewPage extends TestBase {

	public TripAdvisorHotelReviewPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	WebElement flipkartProductSearchTextbox;

	@FindBy(xpath = "//button[@class = 'vh79eN']")
	WebElement flipkartSearchButton;

	@FindBy(xpath = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div")
	WebElement flipkartSearchResultFirstItem;

	@FindBy(xpath = "//div[@class='_1uv9Cb']/div[1]")
	WebElement flipkartSearchResultFirstItemRate;

	@FindBy(xpath = "//a[text() = 'Write a review']/..")
	WebElement writeAViewButton;

	@FindBy(xpath = "//*[@id=\"component_12\"]/div/div[2]/div/div[2]/div/div[2]/div")
	WebElement writeAViewDropDown;

	@FindBy(xpath = "//*[@id=\"BODY_BLOCK_JQUERY_REFLOW\"]/div[15]/div/div/div/div/a")
	WebElement writeAViewDropDownText;

	@FindBy(xpath = "//input[@id = 'ReviewTitle']")
	WebElement reviewTitle;

	@FindBy(xpath = "//textarea[@id = 'ReviewText']")
	WebElement reviewText;

	@FindBy(xpath = "//span[@id = 'bubble_rating']")
	WebElement ratingBar;

	@FindBy(xpath = "//div[@id = 'DQ_RATINGS']")
	WebElement hotelRatingsSection;

	@FindBy(xpath = "//span[@id = 'qid12_bubbles']")
	WebElement hotelRatingsSectionServicerating;

	@FindBy(xpath = "//span[@id = 'qid11_bubbles']")
	WebElement hotelRatingsSectionRoomsRating;

	@FindBy(xpath = "//span[@id = 'qid14_bubbles']")
	WebElement hotelRatingsSectionCleansRating;

	@FindBy(xpath = "//textarea[@id = 'ROOM_TIP']")
	WebElement tipTextBox;

	@FindBy(xpath = "//input[@id = 'noFraud']")
	WebElement reviewNoFraudCheckBox;

	@FindBy(xpath = "//div[@id = 'SUBMIT']")
	WebElement reviewSubmitButton;

	@FindBy(xpath = "//*[@id=\"trip_type_table\"]/div[1]")
	WebElement typeOfTrip;

	@FindBy(xpath = "//select[@id=\"trip_date_month_year\"]")
	WebElement travelTime;

	public void writeView() throws InterruptedException {
		Thread.sleep(9000);

		try {
			Actions actions = new Actions(driver);
			actions.moveToElement(writeAViewButton).click().build().perform();

			Set<String> allwindows = driver.getWindowHandles();
			ArrayList<String> list = new ArrayList<String>();
			list.addAll(allwindows);
			driver.switchTo().window(list.get(2));
		} catch (IndexOutOfBoundsException e) {

			Actions actions = new Actions(driver);
			actions.moveToElement(writeAViewDropDown).click().build().perform();

			writeAViewDropDownText.click();

			Set<String> allwindows = driver.getWindowHandles();
			ArrayList<String> list = new ArrayList<String>();
			list.addAll(allwindows);
			driver.switchTo().window(list.get(2));

		}

		System.out.println(" ======>>> New Window Title  ==============: " + driver.getTitle());

		Thread.sleep(5000);
		ratingBar.click();
		reviewTitle.sendKeys("My Test Review for Hotel title");
		reviewText.sendKeys(
				"My Test Review for Hotel text My Test Review for Hotel My Test Review for Hotel text My Test Review for Hotel My Test Review for Hotel text My Test Review for Hotel My Test Review for Hotel text My Test Review for Hotel");

		typeOfTrip.click();
		
		Select sel = new Select(travelTime);
		sel.selectByIndex(2);

		try {
			if (hotelRatingsSection.isDisplayed()) {
				hotelRatingsSection.click();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		tipTextBox.sendKeys("no tip no tip");
		reviewNoFraudCheckBox.click();
		reviewSubmitButton.click();

	}

	public void clickOnSearchButtonInFlikart() {
		flipkartSearchButton.click();
	}

	public void getProductRateInFlikart() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String productRateInAmazon = flipkartSearchResultFirstItemRate.getText().toString();
		System.out.println(" ===========>>>>>>> Flipkart Rate : " + productRateInAmazon.substring(1));
		// TestBase.flipkartProductRate =
		// Integer.parseInt(productRateInAmazon.substring(1));
		TestBase.flipkartProductRate = Integer.valueOf(productRateInAmazon.substring(1).replace(",", ""));
		// System.out.println(" ===========>>>>>>> Flipkart Rate : " +
		// TestBase.flipkartProductRate);

	}

}