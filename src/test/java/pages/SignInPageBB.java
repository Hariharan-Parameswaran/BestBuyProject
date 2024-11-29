package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBB;

public class SignInPageBB extends BaseBB {

	@FindBy(id = "fld-e")
	WebElement emailAddress;

	@FindBy(id = "fld-p1")
	WebElement password;

	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signInButton;

	@FindBy(xpath = "//button[text()='Skip for now']")
	WebElement skipNowButton;
	@FindBy(xpath = "//a[text()='Return to previous page']")
	WebElement returnHomePage;

	WebDriver driver;

	public SignInPageBB(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void signInDetail(String email, String passwd) {
		emailAddress.sendKeys(email);
		password.sendKeys(passwd);
		signInButton.click();
		returnHomePage.click();
	}

	public void skipNext() {
		skipNowButton.click();
	}
}
