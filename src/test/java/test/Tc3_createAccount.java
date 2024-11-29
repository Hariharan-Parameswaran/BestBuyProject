package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseBB;
import pages.CreateAccountBB;
import pages.HomePageBB;
import pages.LocationPageBB;

public class Tc3_createAccount extends BaseBB{

    @BeforeTest
	public void setup() {
		sheetname = "CreateAccountData";
		testName = "Tc3_createAccount";
		testAuthor = "Hariharan";
		testDescription = "CreatAccount Functionality";
	}
	
	@Test(dataProvider = "readData",priority = 3)
	public void createAccount(String firstname,String lastname,String email,String password,String confirmpassword,String mobilenumber) {
		LocationPageBB lpBB = new LocationPageBB(driver);
		lpBB.clickOnUSA();
		
		HomePageBB hpBB = new HomePageBB(driver);
		hpBB.goToCreateAccount();
		
		CreateAccountBB caBB = new CreateAccountBB(driver);
		caBB.createTheAccount(firstname, lastname, email, password, confirmpassword,
				mobilenumber);
		 takeScreenshot("Tc3_createAccount");
	}
}
