package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.GooglePage;
import utils.DriverHandler;

public class Scenario4 {
	private WebDriver driver;
	private GooglePage GPobj;
	@BeforeMethod
	public void setup() {
		this.driver=DriverHandler.getDriver();
		GPobj = new GooglePage(driver);
	}
	
	@Test(description="Testing actions",priority=0)
	public void tc1(){
		try {
		driver.get("https://www.google.com/");
		GPobj.searchGoogle();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(description="Testing actions",priority=1)
	public void tc2(){
		try {
		driver.get("https://www.google.com/");
		GPobj.keyUpTesting();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void tearDown(){
		DriverHandler.quitDriver();
	}
}
