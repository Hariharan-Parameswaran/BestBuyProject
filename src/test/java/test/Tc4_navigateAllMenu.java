package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.HomePageBB;
import pages.LocationPageBB;

public class Tc4_navigateAllMenu extends BaseBB {

	@BeforeTest
	public void setup() {
		testName = "Tc4_NavigateAllMenu";
		testAuthor = "Hariharan";
		testDescription = "Check the different menu titles";
	}

	@Test(priority = 5)
	public void testMenuNavigation() throws InterruptedException {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();

		HomePageBB hpBB = new HomePageBB(driver);
		String[] menuItems = hpBB.getMenuItems();

		for (String menuItem : menuItems) {
			String pageTitle = hpBB.menuValidation(menuItem);
			System.out.println(pageTitle);
			Assert.assertTrue(pageTitle.contains(menuItem), "Validation failed for menu: " + menuItem);
			System.out.println(menuItem);
			takeScreenshot("tc4_NavigateAllMenu");
		}
	}
}
