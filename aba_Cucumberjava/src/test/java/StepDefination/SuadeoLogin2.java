package StepDefination;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.SuadeoSignInPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import Suadeo.BaseClass.BaseClass;


public class SuadeoLogin2 extends BaseClass {

	SuadeoSignInPage SignInObj;
	BaseClass a = new BaseClass();

	//WebDriver driver = null;
	
	@Before
	public void initializeTest() {
		//BaseClass a = new BaseClass();
		a.beforeTest();
	}
	
	
	@After
	public void endTest() {
		//BaseClass a = new BaseClass();
		a.tearDown(null);
	}

	
	/*
//Before hooks run before the first step of each scenario.
	@Before
	public void launch_browser()  {
		
		System.out.println("===========I am inside Browser Setup============");
		System.out.println("Inside step - browser is open");

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("http://192.168.1.233/suadeodesigner/login.aspx?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
	}
	*/

	@Given("Open suadeo login page")
	public void open_suadeo_login_page() {
		System.out.println("User is on suadeo login page");
	}


	@When("authentiacation selection")
	public void authentiacation_selection() throws InterruptedException{

		SignInObj = new SuadeoSignInPage(driver);
		Assert.assertTrue(SignInObj.LoginAuthentication());

		//driver.findElement(SignInObj.signInLinkClick())).click();
	}
//
	@When("^enter email (.*)$")
	public void enter_email(String email) throws InterruptedException {

		SignInObj = new SuadeoSignInPage(driver);
		Assert.assertTrue(SignInObj.LoginUsername(email));
	}

	@When("^enter password (.*)$")
	public void enter_password(String password) throws InterruptedException {
		SignInObj = new SuadeoSignInPage(driver);
		Assert.assertTrue(SignInObj.LoginPassword(password));
	}

	@When("Click login button")
	public void click_login_button() throws InterruptedException {
		SignInObj = new SuadeoSignInPage(driver);
		Assert.assertTrue(SignInObj.LoginButton());
	}

	@Then("User should loginn successfuly")
	public void user_should_login_successfuly() {
		System.out.println("Login is successful");
	}

	@Then("Suadeo home page should display")
	public void suadeo_home_page_should_display() {
		System.out.println("Suadeo home page is displayed");
	}
	
	
	//After hooks run after the last step of each scenario, even when the step result is failed, undefined, pending, or skipped.
//	@After public void cleanUp(){ 
//		
//		System.out.println("===========I am inside tearown============");
//	      driver.close(); 
//	      driver.quit();
//	   } 





}
