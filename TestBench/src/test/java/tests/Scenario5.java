package tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import pages.FormPage;
import utils.DriverHandler;
import utils.ExcelUtil;
import utils.ParameterUtil;
import utils.ReadingEntireExcelData;

public class Scenario5 {
	private WebDriver driver;
	private FormPage FormPageobj;
	private ExcelUtil exeUtil;
	private ParameterUtil param;
	private ReadingEntireExcelData excelRead;

	@BeforeMethod
	public void setup() throws IOException {
		exeUtil = new ExcelUtil();
		driver = DriverHandler.getDriver();
		FormPageobj = new FormPage(driver);
		param = new ParameterUtil();
		System.out.println("Inside Before Method of scenario1");
	}

	@DataProvider(name = "TestData")
	public Object[][] readExcelData() throws IOException {
		excelRead = new ReadingEntireExcelData();
		Object[][] testData = excelRead.ReadingEntireExcelData();
		return testData;
	}

	@Test(description = "Testing Data driven", dataProvider = "TestData")
	public void tc1(String TestCase, String Enter_Name, String Enter_Email, String Enter_MobileNo, String ChooseFile,
			String Entercurrent_address) {
		try {
			Allure.step(" TestCase :" + TestCase + " Enter_Name:" + Enter_Name + " Enter_Email:" + Enter_Email
					+ " Enter_MobileNo:" + Enter_MobileNo + " ChooseFile:" + ChooseFile + " Entercurrent_address:"
					+ Entercurrent_address);
			driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
			FormPageobj.enterName(Enter_Name);
			FormPageobj.enterEmail(Enter_Email);
			FormPageobj.selectGender();
			FormPageobj.enterMobileNo(Enter_MobileNo);
			FormPageobj.enterHobbies();
			FormPageobj.datePicker();
			FormPageobj.chooseFile(ChooseFile);
			FormPageobj.entercurrentaddress(Entercurrent_address);
			FormPageobj.selectState();
			FormPageobj.selectCity();
			FormPageobj.submit();
		} catch (Exception e) {
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
		excelRead.clearing();
	}
}
