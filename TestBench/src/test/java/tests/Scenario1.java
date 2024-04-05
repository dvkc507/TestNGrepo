package tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.FormPage;
import utils.DriverHandler;
import utils.ExcelUtil;
public class Scenario1 {
	private WebDriver driver;
	private FormPage FormPageobj;
	private ExcelUtil exeUtil;
	@BeforeMethod
	public void setup() {
		exeUtil = new ExcelUtil();
		driver = DriverHandler.getDriver();
		FormPageobj = new FormPage(driver);
		System.out.println("Inside Before Method of scenario1");
	}
	@Test(description="Form testing with utilities",alwaysRun=true, enabled=true, invocationCount=1)
	public void tc1() {
		try {
	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	String stringValueFromExcel = exeUtil.getStringData();
	int mobile = exeUtil.getNumericData();
	FormPageobj.enterName(stringValueFromExcel);
	FormPageobj.enterEmail("abc@gmail.com");
	FormPageobj.selectGender();
	FormPageobj.enterMobileNo(String.valueOf(mobile));
	FormPageobj.enterHobbies();
	FormPageobj.datePicker();
	FormPageobj.chooseFile("/IMG_6098.PNG");
	FormPageobj.entercurrentaddress("Gachibowli 123");
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
