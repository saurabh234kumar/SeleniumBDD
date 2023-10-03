package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchStep {
	
	WebDriver driver = null;

	@SuppressWarnings("deprecation")
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("User is on google search page");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();
		
	}

	@When("user enter a text in searchbox")
	public void user_enter_a_text_in_searchbox() throws InterruptedException {
		System.out.println("User enters a text in the search box");
		WebElement ele = driver.findElement(By.name("q"));
		ele.click();
		ele.sendKeys("Automation Step by Step");
		Thread.sleep(2000);
	

	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("User hits the enter");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

	}

	@Then("user is navigated to search results page")
	public void user_is_navigated_to_search_results_page() {
		System.out.println("User is navigated to search result page");
		driver.getPageSource().contains("Online Cources");
		driver.close();
		driver.quit();
		

	}


}
