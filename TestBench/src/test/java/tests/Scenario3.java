package tests;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.WindowActionsPage;
import utils.DriverHandler;

public class Scenario3 {
	private WebDriver driver;
	private WindowActionsPage windowActions;
	@BeforeMethod
	public void setup(){
		System.out.println("Inside Before Method of scenario3");
		driver = DriverHandler.getDriver();
		windowActions = new WindowActionsPage(driver);
		
	}

	@Test(description = "Testing window actions like popup window switch",alwaysRun=true, enabled=false, invocationCount=1)
	public void tc1() {
		try {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		windowActions.expandWindow_alert();
		windowActions.windowTesting();
		windowActions.nextWindow();
		windowActions.switchTab();
		windowActions.alertsAccept();
		windowActions.alert5SecTest();
		windowActions.alertDismiss();
		windowActions.alertSendText();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test(description = "Testing new window and new tab")
	public void tc2() {
		try {
		driver.get("https://www.google.com");
		windowActions.newWindow();
		windowActions.newTab();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Inside After Method of scenario3");
		DriverHandler.quitDriver();
	}
	
}
