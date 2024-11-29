package test;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.HomePageBB;
import pages.LocationPageBB;
import pages.ProductPageBB;

public class Tc6_SearchItemToCart extends BaseBB{

	@BeforeTest
	public void setup() {
		testName = "Tc6_SearchItemToCart";
		testAuthor = "Hariharan";
		testDescription = "Search a Item in search box and add it in cart";
	}
	
	@Test(priority = 7)
	public void searchAddToCart() {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();

		HomePageBB hpBB = new HomePageBB(driver);
		hpBB.searchProduct("laptop");
		
		ProductPageBB ppBB = new ProductPageBB(driver);
		ppBB.addToItems();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Cart - Best Buy";
		Assert.assertEquals(actualTitle, expectedTitle);
		takeScreenshot("Tc6_SearchItemToCart");
	}
}
