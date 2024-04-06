package tests;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import pages.FormPage;
import utils.DriverHandler;
import utils.ExcelUtil;
import utils.KeyValueReadingEntireExcel;
import utils.ParameterUtil;

public class Scenario6 {
	private KeyValueReadingEntireExcel keyValueobj;
	private WebDriver driver;
	private FormPage FormPageobj;
	Object[][] testData =null;
	
	@BeforeMethod
	public void setup() throws IOException {
		FormPageobj = new FormPage(driver);
		driver = DriverHandler.getDriver();
		System.out.println("Inside Before method of scenario1");
	}
	
	@DataProvider(name="DataDrivenKeyValuePair")
	public Object[][] getData() throws IOException {
		keyValueobj = new KeyValueReadingEntireExcel();
		testData= keyValueobj.keyValueReadingExcel();
		return testData;	
	}
		
	@Test(description="Reading data and getting values based on coulmn header", dataProvider="DataDrivenKeyValuePair")
	public void Tc1(String TestCase, String Enter_Name, String Enter_Email, String Enter_MobileNo, String ChooseFile,
			String Entercurrent_address) {
		//HashMap<String,String> testData = testData1;
		try{
			Allure.step(" TestCase :" + TestCase + " Enter_Name:" + Enter_Name + " Enter_Email:" + Enter_Email
					+ " Enter_MobileNo:" + Enter_MobileNo + " ChooseFile:" + ChooseFile + " Entercurrent_address:"
					+ Entercurrent_address);
        String testCaseName = TestCase; 
        if (testCaseName.equals("5")) {
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
	}
 }
		catch(Exception e) {
		e.getStackTrace();
		}
}
	@AfterMethod
	public void cleanUp() throws IOException {
		DriverHandler.quitDriver();
		System.out.println("Inside After Method of scenario1");
	}
}