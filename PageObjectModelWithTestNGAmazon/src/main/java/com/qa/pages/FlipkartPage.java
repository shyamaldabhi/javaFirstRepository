package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class FlipkartPage extends TestBase {

	public FlipkartPage() {
		PageFactory.initElements(driver, this);
		// FlipkartPageTest flipkartPageTest = new FlipkartPageTest();
	}

	@FindBy(xpath = "//input[@title='Search for products, brands and more']")
	WebElement flipkartProductSearchTextbox;

	@FindBy(xpath = "//button[@class = 'vh79eN']")
	WebElement flipkartSearchButton;

	@FindBy(xpath = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div")
	WebElement flipkartSearchResultFirstItem;

	@FindBy(xpath = "//div[@class='_1uv9Cb']/div[1]")
	WebElement flipkartSearchResultFirstItemRate;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	WebElement flipkartLoginCloseButton;

	public void enterProductNameToSearchInFlikart() throws InterruptedException {
		Thread.sleep(5000);
		flipkartLoginCloseButton.click();
		flipkartProductSearchTextbox.sendKeys("iPhone XR (64GB) - Yellow");
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
//		TestBase.flipkartProductRate = Integer.parseInt(productRateInAmazon.substring(1));
		TestBase.flipkartProductRate = Integer.valueOf(productRateInAmazon.substring(1).replace(",", ""));
//		System.out.println(" ===========>>>>>>> Flipkart Rate : " + TestBase.flipkartProductRate);
		
	}

	public void ratesCompare() {
		if (TestBase.flipkartProductRate == TestBase.amazonProductRate) {
			System.out.println(" Both Rates are same,  " + " Amazon Rate : " + TestBase.amazonProductRate + " And "
					+ " Flipkart Rate : " + TestBase.flipkartProductRate);
		} else if (TestBase.flipkartProductRate < TestBase.amazonProductRate) {
			System.out.println("  Flipkart rate is lesser than Amazon, " + " Amazon Rate : " + TestBase.amazonProductRate
					+ " And " + " Flipkart Rate : " + TestBase.flipkartProductRate);
		} else {
			System.out.println("  Amazon rate is lesser than Flipkart, " + " Amazon Rate : " + TestBase.amazonProductRate
					+ " And " + " Flipkart Rate : " + TestBase.flipkartProductRate);
		}
	}
}