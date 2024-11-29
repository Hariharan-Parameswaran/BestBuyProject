package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.HomePageBB;
import pages.LocationPageBB;
import pages.ProductPageBB;

public class Tc7_ShopByDepartment extends BaseBB{

	@BeforeTest
	public void setup() {
		testName = "Tc7_ShopByDepartment";
		testAuthor = "Hariharan";
		testDescription = "Search a Item by Department in Menu and add it in cart";
	}
	
	@Test(priority = 8)
	public void selectShopByDepartment() {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();

		HomePageBB hpBB = new HomePageBB(driver);
		hpBB.selectTvMenuButton();
		
		ProductPageBB ppBB= new ProductPageBB(driver);
		ppBB.addTvItems();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Cart - Best Buy";
		Assert.assertEquals(actualTitle, expectedTitle);
		 takeScreenshot("Tc7_ShopByDepartment");
	}
}
