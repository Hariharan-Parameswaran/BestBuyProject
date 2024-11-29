package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseBB;

public class HomePageBB extends BaseBB{

	@FindBy(linkText = "Top Deals")
	WebElement topDeals;
	
	@FindBy(xpath ="//a[text()='Black Friday Deals']") WebElement BlackFridayDeals;

	@FindBy(linkText = "Deal of the Day")
	WebElement dealOfTheDay;

	@FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
	WebElement bestBuySells;

	@FindBy(xpath = "(//a[contains(@class,'bottom-left-links')][normalize-space()='My Best Buy Memberships'])[1]")
	WebElement bestBuyMemberships;

	@FindBy(xpath = "//a[text()='Credit Cards']")
	WebElement creditCardsMenu;

	@FindBy(xpath = "//a[contains(@class,'bottom-left-links')][normalize-space()='Gift Cards']")
	WebElement giftCards;

	@FindBy(linkText = "Gift Ideas")
	WebElement giftIdeas;

	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement account;

	@FindBy(xpath = "//a[text()='Sign In']")
	WebElement signIn;

	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement createAccount;

	@FindBy(id = "gh-search-input")
	WebElement searchBox;

	@FindBy(xpath = "//button[@title='submit search']")
	WebElement searchSubmit;

	@FindBy(xpath = "//span[text()='Cart']")
	WebElement cart;

	@FindBy(xpath = "//a[text()='Accessibility']")
	WebElement accessibility;
	
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	WebElement termsAndConditions;
	
	@FindBy(xpath = "//a[text()='Privacy']")
	WebElement privacy;
	
	@FindBy(xpath = "//a[text()='Interest-Based Ads']")
	WebElement interestBased;
	
	@FindBy(xpath = "//a[text()='State Privacy Rights']")
	WebElement statePrivacy;

	@FindBy(xpath = "//button[@aria-label='Menu']")
	WebElement menuButton;

	@FindBy(xpath = "//button[text()='TV & Home Theater']")
	WebElement TVandHomeTheater;

	@FindBy(xpath = "//button[text()='TVs by Brand']")
	WebElement TVsbyBrand;

	@FindBy(xpath = "//a[text()='Sony TVs']")
	WebElement sonyTV;

	@FindBy(xpath = "//button[text()='Brands']")
	WebElement brandButton;

	@FindBy(xpath = "//a[text()='Apple']")
	WebElement appleBrand;

	WebDriver driver;

	public HomePageBB(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SignInPageBB goToSgnIn() {
		account.click();
		signIn.click();
		return new SignInPageBB(driver);
	}

	public CreateAccountBB goToCreateAccount() {
		account.click();
		createAccount.click();
		return new CreateAccountBB(driver);
	}

	public String menuValidation(String menuName) throws InterruptedException {
		WebElement menu = driver.findElement(By.linkText(menuName));
		Thread.sleep(2000);
		menu.click();
		return driver.getTitle();
	}

	public String[] getMenuItems() {
		return new String[] { "Black Friday Deals", "Deal of the Day","Gift Ideas" , "Yes, Best Buy Sells That", "My Best Buy Memberships",
				"Gift Cards" };
	}

	public void bottomLink() {
		accessibility.click();
	}

	public ProductPageBB searchProduct(String pName) {
		searchBox.sendKeys(pName);
		searchSubmit.click();
		return new ProductPageBB(driver);
	}

	public ProductPageBB selectTvMenuButton() {
		menuButton.click();
		TVandHomeTheater.click();
		TVsbyBrand.click();
		sonyTV.click();
		return new ProductPageBB(driver);
	}

	public void goToCartPage() {
		cart.click();
	}

	public ProductPageBB selectBrand() {
		menuButton.click();
		brandButton.click();
		appleBrand.click();
		return new ProductPageBB(driver);
	}

}
