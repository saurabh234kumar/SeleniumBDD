package Suadeo.BaseClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import com.suadeo.WEB.Config.PropertiesFile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver = null;
	public static String browserName;
	public static String url = null;
	public static String osname = null;

	// This will be executed before first @Test method execution. It will be
	// executed one only time throughout the test case.
	// @Before()
	public void beforeTest() {

		System.out.println("===========I am inside BEFORE TEST CLASS============");
		PropertiesFile.getProperties();

		// if(osname.equalsIgnoreCase("Windows")) {

		if (browserName.equalsIgnoreCase("chrome")) // Chrome driver instantiates using an object of WebDriver class.
		{
			// System.setProperty("WebDriver.chrome.driver",
			// "/src/test/resources/drivers/chromedriver.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				chromeOptions.addArguments("--headless");
			}
			WebDriverManager.chromedriver().setup();
			// WebDriver driver = new ChromeDriver();
			driver = new ChromeDriver(chromeOptions);
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		// }

		/*
		 * 
		 * if(osname.equalsIgnoreCase("Mac")) {
		 * 
		 * if(browserName.equalsIgnoreCase("chrome")) //Chrome driver instantiates using
		 * an object of WebDriver class.
		 * {
		 * System.setProperty("WebDriver.chrome.driver",
		 * "/src/test/resources/drivers/chromedriver.exe");
		 * //WebDriverManager.chromedriver().setup();
		 * driver = new ChromeDriver();
		 * 
		 * driver.get(url);
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * }
		 * else if(browserName.equalsIgnoreCase("firefox"))
		 * {
		 * driver = new FirefoxDriver();
		 * }
		 * }
		 */
	}

	// @After
	public void tearDown(Scenario scenario) {
		System.out.println("===========I am inside TEAR DOWN CLASS============");
		/*
		 * if (scenario.isFailed()) {
		 * 
		 * try {
		 * // //log.info(scenario.getName() + " is Failed");
		 * // final byte[] screenshot = ((TakesScreenshot)
		 * TestBase.driver).getScreenshotAs(OutputType.BYTES);
		 * // scenario.attach(screenshot, "image/png", null); // ... and embed it in
		 * }
		 * catch (WebDriverException e) {
		 * e.printStackTrace();
		 * }
		 * }
		 * else {
		 * try {
		 * //log.info(scenario.getName() + " is pass");
		 * scenario.attach(((TakesScreenshot)
		 * BaseClass.driver).getScreenshotAs(OutputType.BYTES), "image/png", null);
		 * } catch (Exception e) {
		 * e.printStackTrace();
		 * }
		 * }
		 */

		driver.quit();
	}
}
