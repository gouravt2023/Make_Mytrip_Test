package MMTPTEST.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import MMTPTEST.AbstractComponents.AbstractComponent;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

public class HomePage extends AbstractComponent{

	WebDriver driver;

	public HomePage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	//WebElement userEmails = driver.findElement(By.id("userEmail"));
	//PageFactory
	@FindBy(xpath = "//header[@class='el-header header sticky-no']//i[@class='el-icon-user']/following-sibling::span[@class='el-link--inner']")
	WebElement signInBtn;
	@FindBy(xpath = "//div[@class='row-mobile el-input el-input-group el-input-group--prepend']/input[@class='el-input__inner']")
	WebElement mobileinputBox;

	@FindBy(xpath="//form[@class='el-form el-form--label-top']/button[@class='el-button w-100 el-button--primary']")
	WebElement getCode;

	@FindBy(xpath = "//div[@class='el-form-item is-success']/div[@class='el-form-item__content']/div[@class='row-mobile-header el-row is-justify-center el-row--flex']/span[1]")
	WebElement otpText;

	@FindBy(xpath="//div[@class='row-otp-input el-row is-justify-center el-row--flex']/div/div/input[@class='otp-input row-otp'][1]")
	WebElement otpInputBox;

	@FindBy(xpath = "//*[@id=\"pane-mobileLogin\"]/div/form/div[4]/button/span")
	WebElement confirmOtpBtn;

	@FindBy (xpath = "//*[@id=\"pane-mobileLogin\"]/div/form/div[2]/div/div/input")
	WebElement firstName;

	@FindBy (xpath = "//*[@id=\"pane-mobileLogin\"]/div/form/div[3]/div/div[1]/input")
	WebElement lastName;
	//
	@FindBy (xpath = "//*[@id=\"pane-mobileLogin\"]/div/form/div[4]/div/div/input")
	WebElement customerEmail;

	@FindBy (xpath = "//*[@id=\"pane-mobileLogin\"]/div/form/button/span")
	WebElement confirmPersonalDetails;
	@FindBy (xpath = "//*[@id=\"__layout\"]/div/header[2]/div[3]/section/div/div/ul/li[1]/div/span")
	WebElement allCategories;

	public void loginApp() throws InterruptedException
	{
		//signInBtn.click();
		Thread.sleep(4000);
		signInBtn.click();
		String num=generateMobileNumberUz();
		mobileinputBox.sendKeys(num);
		getCode.click();
		Thread.sleep(15000);

	}

	public static String generateMobileNumberUz()
	{
		Random random = new Random();
		int firstDigit = random.nextInt(9) + 2; // Ensures the first digit is not zero
		int remainingDigits = random.nextInt(100000000); // Generates an 8-digit number
		return firstDigit + String.format("%08d", remainingDigits);
	}
    public static String generateEmail()
	{
		String prefix = "Gourav";
		String characters = "abcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder email = new StringBuilder(prefix);
		Random random = new Random();

		// Generate a random length for the email prefix (between 8 and 15 characters)
		int length = 4 + random.nextInt(5);

		for (int i = 0; i < length; i++) {
			email.append(characters.charAt(random.nextInt(characters.length())));
		}

		return email + "@yopmail.com";
	}
	public void enterOtp()
	{
		String otpValue=otpText.getText();
		System.out.println(otpValue);
		otpInputBox.sendKeys(otpValue);
		confirmOtpBtn.click();
	}

	public void enterPersonalDetails()
	{
		firstName.sendKeys("Gourav");
		lastName.sendKeys("Darjee");
		String customerEmail1=generateEmail();
		customerEmail.sendKeys(customerEmail1);
		confirmPersonalDetails.click();
		mouseActionHover(allCategories);
	}

	/*public void flightInq()  {
		String tat=fromCity.getText();
		System.out.println(tat);
		fromCityContainer.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", fromCityContainer);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(fromCity));
		waitForWebElementToAppear(fromCityContainer);
		Point location = fromCityContainer.getLocation();
		int x=location.getX();
		int y=location.getY();
		Actions actions = new Actions(driver);
		waitForWebElementToAppear(fromCity);
		actions.moveByOffset(x,y).click().perform();
		fromCity.click();
	}*/


	/*public String getErrorMessage()
	{
		waitForWebElementToAppear(errorMessage);
		return errorMessage.getText();
	}*/

	public void goTo()
	{
		driver.get("https://uat-zoodmall-uz.zoodmall.com/en/");
	}


}
