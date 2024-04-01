package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverHandler {
	private static WebDriver driver;
	public static WebDriver getDriver() {
		System.out.println("driver value :"+driver);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		return driver;
	}
	public static void quitDriver() {
		if(driver != null) {
			driver.close();
			driver.quit();
		}
		
	}

}
