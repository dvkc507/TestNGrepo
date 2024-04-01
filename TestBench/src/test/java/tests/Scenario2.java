package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.FormPage2;
import utils.DriverHandler;

public class Scenario2 {
	private WebDriver driver;
	private FormPage2 FormPageobj;
	@BeforeMethod
	public void setup() {
		driver = DriverHandler.getDriver();
		FormPageobj = new FormPage2(driver);
		System.out.println("Inside Before Method of scenario2");
	}
	@Test(description="Form testing with utilities",alwaysRun=true, enabled=true, invocationCount=1)
	public void tc2() {
		try {
	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	FormPageobj.enterName("Tala");
	FormPageobj.enterEmail("abc@gmail.com");
	FormPageobj.selectGender();
	FormPageobj.enterMobileNo("123456789");
	FormPageobj.enterHobbies();
	FormPageobj.chooseFile("/IMG_6098.PNG");
	FormPageobj.entercurrentaddress("Gachibowli 123");
		}
		catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void tearDown(){
		System.out.println("Inside After Method of scenario2");
		DriverHandler.quitDriver();
	}

}
