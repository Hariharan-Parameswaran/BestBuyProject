package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.HomePageBB;
import pages.LocationPageBB;

public class Tc5_ValidateBottom extends BaseBB{

	@BeforeTest
	public void setup() {
		testName = "Tc5_ValidateBottom";
		testAuthor = "Hariharan";
		testDescription = "Link in HomePage bottom is broken or not";
	}
	
	@Test(priority = 6)
	public void bottomLinkTest() {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();

		HomePageBB hpBB = new HomePageBB(driver);
		hpBB.bottomLink();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Accessibility - Best Buy";
		Assert.assertEquals(actualTitle, expectedTitle);
		takeScreenshot("Tc5_ValidateBottom");
	}
}
