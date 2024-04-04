package pages;

import java.io.File;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormPage2 extends BasePage{
	WebDriver driver;
public FormPage2(WebDriver driver) {
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);	
}
@FindBy(xpath = "//input[@id='name']")
WebElement name;
@FindBy(xpath = "//input[@id='email']")
WebElement email;
@FindBy(xpath = "//input[@id='gender']")
WebElement gender;
@FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
WebElement MobileNumber;
@FindBy(xpath = "//input[@placeholder='Enter Subject']")
WebElement EnterSubject;
@FindBy(xpath = "//input[@id='hobbies']")
WebElement Hobbies;
@FindBy(xpath = "//input[@id='picture']")
WebElement ChooseFile;
@FindBy(xpath = "//textarea[@id='picture']")
WebElement currentaddress;
@FindBy(xpath = "//select[@id='state']")
WebElement state;
@FindBy(xpath = "//select[@id='city']")
WebElement city;

public void enterName(String value) {
	name.sendKeys(value);
}
public void enterEmail(String value) {
	email.sendKeys(value);
}
public void selectGender() {
	gender.click();
}
public void enterMobileNo(String value) {
	MobileNumber.sendKeys(value);
}
public void enterSubject(String value) {
	EnterSubject.sendKeys(value);
}
public void enterHobbies() {
	Hobbies.click();
}
public void chooseFile(String filePath) {
	String path = System.getProperty("user.dir");
	File f = new File(path+filePath);
	System.out.println(f.getAbsolutePath());
	ChooseFile.sendKeys(f.getAbsolutePath());
	Actions a = new Actions(driver);
	a.sendKeys(Keys.ENTER).perform();
	System.out.println("File uploaded :" +filePath);
}
public void entercurrentaddress(String value) {
	Actions a = new Actions(driver);
	a.moveToElement(currentaddress).click().build();
	a.sendKeys(value).perform();
}
}
