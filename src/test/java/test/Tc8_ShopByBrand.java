package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.HomePageBB;
import pages.LocationPageBB;
import pages.ProductPageBB;

public class Tc8_ShopByBrand extends BaseBB{

	@BeforeTest
	public void setup() {
		testName = "Tc8_ShopByBrand";
		testAuthor = "Hariharan";
		testDescription = "Search a Item by Brands in Menu and add it in cart";
	}
	
	@Test(priority = 9)
	public void  selectShopByBrand() throws InterruptedException {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();

		HomePageBB hpBB = new HomePageBB(driver);
		hpBB.selectBrand();
		
		ProductPageBB ppBB= new ProductPageBB(driver);
		ppBB.addBrandItem();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Cart - Best Buy";
		Assert.assertEquals(actualTitle, expectedTitle);
		 takeScreenshot("Tc8_ShopByBrand");
	}
}
