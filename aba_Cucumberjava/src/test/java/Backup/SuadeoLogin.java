package Backup;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SuadeoLogin {
	
	WebDriver driver = null;
	
	@Given("Launch Browser")
	public void launch_browser() {
System.out.println("Inside step - browser is open");
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("Open suadeo login page")
	public void open_suadeo_login_page() {
		System.out.println("User is on suadeo login page");
		driver.navigate().to("http://192.168.1.233/suadeodesigner/login.aspx?");
		driver.navigate().refresh();
	}

	@When("Click Authentiacation arrow button")
	public void click_authentiacation_arrow_button() {
		driver.findElement(By.xpath("//input[@placeholder='Authentification']")).click();
	}

	@And("Select SUADEO.NET")
	public void select_suadeo_net() {
		driver.findElement(By.id("SUADEO.NET")).click();
	}
	
	@When("^user enters (.*) and (.*)$")
	public void user_enters_email_and_password(String email,String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='tb_username']")).click();
		driver.findElement(By.xpath("//input[@id='tb_username']")).clear();
		//driver.findElement(By.xpath("//input[@id='tb_username']")).click();
		driver.findElement(By.xpath("//input[@id='tb_username']")).sendKeys(email);
		driver.findElement(By.id("tb_pwd")).click();
		driver.findElement(By.id("tb_pwd")).sendKeys(password);
		System.out.println("Password"+password);
		Thread.sleep(4000);
	}



	@When("Click login button")
	public void click_login_button() {
		driver.findElement(By.id("btn_login")).click();
	}

	@Then("User should login successfuly")
	public void user_should_login_successfuly() {
		System.out.println("Login is successful");
	}

	@And("Suadeo home page should display")
	public void suadeo_home_page_should_display() {
		System.out.println("Suadeo home page is displayed");
		//driver.close();
	}




}
