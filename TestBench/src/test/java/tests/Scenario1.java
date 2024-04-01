package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.FormPage;
import utils.DriverHandler;
public class Scenario1 {
	private WebDriver driver;
	private FormPage FormPageobj;
	@BeforeMethod
	public void setup() {
		driver = DriverHandler.getDriver();
		FormPageobj = new FormPage(driver);
		System.out.println("Inside Before Method of scenario1");
	}
	@Test(description="Form testing with utilities",alwaysRun=true, enabled=true, invocationCount=1)
	public void tc1() {
		try {
	driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	FormPageobj.enterName("Tala");
	FormPageobj.enterEmail("abc@gmail.com");
	FormPageobj.selectGender();
	FormPageobj.enterMobileNo("123456789");
	FormPageobj.enterHobbies();
	FormPageobj.datePicker();
	FormPageobj.chooseFile("/IMG_6098.PNG");
	FormPageobj.entercurrentaddress("Gachibowli 123");
	FormPageobj.selectState();
	FormPageobj.selectCity();
	FormPageobj.submit();
		}
		catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void teardown() {
		System.out.println("Inside After Method of scenario1");
		DriverHandler.quitDriver();
	}

}
