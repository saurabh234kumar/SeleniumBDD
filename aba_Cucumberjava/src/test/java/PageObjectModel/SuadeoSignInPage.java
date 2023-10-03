package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.suadeo.WEB.Locators.SuadeoLocators;
import com.suadeo.browser.utils.WebUtils;


public class SuadeoSignInPage extends WebUtils {

	@FindBy(xpath = SuadeoLocators.LoginAuthentication_Xpath)
	@CacheLookup
	private WebElement LoginAuthentication_Xpath;

	@FindBy(id = SuadeoLocators.LoginAuthenticationDropDownButton_ID)
	@CacheLookup
	private WebElement 	LoginAuthenticationDropDownButton_ID;

	@FindBy(xpath=SuadeoLocators.LoginUsername_Xpath)
	@CacheLookup
	private WebElement LoginUsername_Xpath;

	@FindBy(id=SuadeoLocators.LoginPassword_ID)
	@CacheLookup
	private WebElement LoginPassword_ID;
	
	@FindBy(how = How.ID,using = SuadeoLocators.LoginButton_ID)
	WebElement LoginButton_ID;

//	@FindBy(id=SuadeoLocators.LoginButton_ID)
//	@CacheLookup
//	private WebElement LoginButton_ID;
//
//	@FindBy(xpath = SuadeoLocators.HomePageLogo_Xpath)
//	private WebElement HomePageLogo_Xpath;
//
//	@FindBy(xpath = SuadeoLocators.HomeMenu_Xpath)
//	private WebElement HomeMenu_Xpath;
//
//	@FindBy(xpath = SuadeoLocators.LogoutButton_Xpath)
//	private WebElement LogoutButton_Xpath;
//
//	@FindBy(id = SuadeoLocators.DisconnectButton_ID)
//	private WebElement DisconnectButton_ID;




	//	public MagrabiSignInPage(WebDriver driver)
	//	{
	//		this.driver =driver;
	//		PageFactory.initElements(driver, this);
	//	}

	public SuadeoSignInPage(WebDriver testdriver) {
		super(testdriver);
		//SearchContext driver = null;
		PageFactory.initElements(driver, this);

	}
//
//	public boolean logoutLinkClick() throws InterruptedException{
//		// explicit wait - to wait for the compose button to be click-able
//		waitForWebElementPresent(LogoutButton_Xpath, 10);
//		boolean flag=true;
//		//Thread.sleep(2000);
//		if(LogoutButton_Xpath.isDisplayed()==true){
//			//test.log(Status.PASS, "Home page opened");
//
//			//test.log(LogStatus.PASS, "SignIn Button is displayed");
//			testLogger.info("SignIn button: " +LogoutButton_Xpath);
//			testLogger.info("SignIn Button is displayed ");
//			LogoutButton_Xpath.click();
//			//Thread.sleep(5000);
//			DisconnectButton_ID.click();
//			System.out.println("Suadeo site logout");
//
//
//		}
//		return flag;	
//
//	}

	public boolean LoginAuthentication() throws InterruptedException{

		boolean flag=true;
		if(LoginAuthentication_Xpath.isDisplayed()==true){
			LoginAuthentication_Xpath.getText();
			testLogger.info("Authentication button: " +LoginAuthentication_Xpath);

			LoginAuthentication_Xpath.click();
			LoginAuthenticationDropDownButton_ID.click();
		}
		return flag;	

	}
	

	public boolean LoginUsername(String email) throws InterruptedException{

		boolean flag=true;
		if(LoginUsername_Xpath.isDisplayed()==true){
			LoginUsername_Xpath.getText();
			testLogger.info("SignIn button: " +LoginUsername_Xpath);

			//test.pass("Clicked SignIn button");
			testLogger.info("Username Button is displayed ");
			//driver.findElement((By) signInXpath).click();
			LoginUsername_Xpath.sendKeys(email);
		}
		return flag;	

	}
	

	public boolean LoginPassword(String password) throws InterruptedException{

		boolean flag=true;
		if(LoginPassword_ID.isDisplayed()==true){
			LoginAuthentication_Xpath.getText();
			testLogger.info("SignIn button: " +LoginPassword_ID);

			//test.pass("Clicked SignIn button");
			testLogger.info("SignIn Button is displayed ");
			LoginPassword_ID.sendKeys(password);
			}
		return flag;	

	}
	

	public boolean LoginButton() throws InterruptedException{

		boolean flag=true;
		if(LoginButton_ID.isDisplayed()==true){
			LoginButton_ID.getText();
			testLogger.info("SignIn button: " +LoginButton_ID);
			LoginButton_ID.click();
		}
		return flag;	

	}

}
