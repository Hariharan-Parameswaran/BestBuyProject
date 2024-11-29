package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBB;

public class LocationPageBB  extends BaseBB{

	@FindBy(className = "canada-link")
	WebElement canada;

	@FindBy(className = "us-link")
	WebElement usa;

	WebDriver driver;

	public LocationPageBB(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCanada() {
		canada.click();
	}

	public void clickOnUSA() {
		usa.click();
	}
}
