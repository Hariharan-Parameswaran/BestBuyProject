package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.CartPageBB;
import pages.CheckOutPageBB;
import pages.HomePageBB;
import pages.LocationPageBB;
import pages.ProductPageBB;

public class Tc9_CheckOutAndPayment extends BaseBB{

	@BeforeTest
	public void setup() {
		sheetname = "GuestData";
		testName = "Tc9_CheckOutAndPayment";
		testAuthor = "Hariharan";
		testDescription = "Navigating to the checkout page and filling the form with dummy payment information";
	}
	
	@Test(dataProvider = "readData",priority = 10)
	public void checkOut(String email,String phoneNumber) throws InterruptedException {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();

		HomePageBB hpBB = new HomePageBB(driver);
		hpBB.selectBrand();
		
		ProductPageBB ppBB= new ProductPageBB(driver);
		ppBB.addBrandItem();
		
		CartPageBB cpBB = new CartPageBB(driver);
		cpBB.checkOutPage();
		
		CheckOutPageBB copBB = new CheckOutPageBB(driver);
		copBB.guestDetail(email, phoneNumber);
		takeScreenshot("Tc9_CheckOutAndPayment");

		copBB.paymentDetail("4111111111111111", "12/25", "123", "hari", "P", "123 Main St", "San Francisco", "CA",
				"94105");
		takeScreenshot("Tc9_CheckOutAndPayment1");
	}
}
