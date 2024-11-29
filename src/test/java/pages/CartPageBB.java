package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBB;

public class CartPageBB extends BaseBB{

	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkOutButton;

	WebDriver driver;

	public CartPageBB(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void checkOutPage() {
		checkOutButton.click();
	}
}
