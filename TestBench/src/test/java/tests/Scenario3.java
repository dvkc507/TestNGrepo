package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.WindowActionsPage;
import utils.DriverHandler;

public class Scenario3 {
	WebDriver driver;
	WindowActionsPage windowActions;
	@BeforeMethod
	public void setup(){
		System.out.println("Inside Before Method of scenario3");
		driver = DriverHandler.getDriver();
		windowActions = new WindowActionsPage(driver);
		
	}

	@Test(description = "Testing window actions like popup window switch",alwaysRun=true, enabled=true, invocationCount=1)
	public void tc1() {
		try {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		windowActions.expandWindow_alert();
		windowActions.windowTesting();
		windowActions.newWindow();
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
	
	@AfterMethod
	public void tearDown() {
		System.out.println("Inside After Method of scenario3");
		DriverHandler.quitDriver();
	}
	
}
