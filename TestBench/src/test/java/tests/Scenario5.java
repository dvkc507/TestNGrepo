package tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.FormPage;
import utils.DriverHandler;
import utils.ExcelUtil;
import utils.ParameterUtil;
public class Scenario5 {
	private WebDriver driver;
	private FormPage FormPageobj;
	private ExcelUtil exeUtil;
	private ParameterUtil param;
	@BeforeMethod
	public void setup() throws IOException {
		exeUtil = new ExcelUtil();
		driver = DriverHandler.getDriver();
		FormPageobj = new FormPage(driver);
		param = new ParameterUtil();
		System.out.println("Inside Before Method of scenario1");
	}
	@DataProvider(name = "ReadingEntireData")
	
	@Test(description="Form testing with utilities",alwaysRun=true, enabled=true, invocationCount=1, dependsOnMethods = "")
	public void tc1() {
		try {
	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	FormPageobj.enterName("Hello");
	FormPageobj.enterEmail("abc@gmail.com");
	FormPageobj.selectGender();
	FormPageobj.enterMobileNo("123456789");
	FormPageobj.enterHobbies();
	FormPageobj.datePicker();
	FormPageobj.chooseFile("/IMG_6098.PNG");
	FormPageobj.entercurrentaddress(" address1");
	FormPageobj.selectState();
	FormPageobj.selectCity();
	FormPageobj.submit();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void teardown() {
		System.out.println("Inside After Method of scenario1");
		DriverHandler.quitDriver();
	}
@AfterSuite
public void cleaning() throws IOException {
	exeUtil.closingConnections();
}
}
