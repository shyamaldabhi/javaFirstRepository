package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class AmazonPage extends TestBase {

	public AmazonPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
	WebElement productSearchTextbox;

	@FindBy(xpath = "//*[@id='nav-search']/form/div[2]/div/input")
	WebElement searchButton;

	@FindBy(xpath = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div")
	WebElement searchResultFirstItem;

	@FindBy(xpath = "//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")
	WebElement searchResultFirstItemRateinAmazon;

	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[2]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]")
	WebElement searchResultFirstItemRateinAmazon1;

	public void enterProductNameToSearch() {
		productSearchTextbox.sendKeys("iPhone XR (64GB) - Yellow");
		searchButton.click();
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void clickOnSearchResultFirstItem() {
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

	public FlipkartPage navigateToFlipKart() {
		return new FlipkartPage();

	}

}
