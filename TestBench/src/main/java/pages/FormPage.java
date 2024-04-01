package pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends BasePage {
	WebDriver driver;

	public FormPage(WebDriver driver) {
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
	@FindBy(xpath = "//select[@id='state']")
	WebElement stateSelect;
	@FindBy(xpath = "//select[@id='city']")
	WebElement citySelect;
	@FindBy(xpath = "//input[@id='dob']")
	WebElement datePick;
	@FindBy(tagName = "form")
	WebElement form;

	public void enterName(String value) {
		sendKeys(name, "name", value, 10);
	}

	public void enterEmail(String value) {
		sendKeys(email, "email", value, 10);
	}

	public void selectGender() {
		click(gender, "gender", 10);
	}

	public void enterMobileNo(String value) {
		sendKeys(MobileNumber, "MobileNumber", value, 10);
	}

	public void enterSubject(String value) {
		sendKeys(EnterSubject, "EnterSubject", value, 10);
	}

	public void enterHobbies() {
		click(Hobbies, "Playing", 10);
	}

	public void chooseFile(String filePath) {
		fileUpload(ChooseFile, "sample PNG file", filePath, 5);
	}

	public void entercurrentaddress(String value) {
		actionSendKeys(currentaddress, "currentaddress", value, 10);
	}
	public void selectState() {
		actionsMoveToElement(stateSelect, "stateSelect");
		Select select = new Select(stateSelect);
		List<WebElement> options = select.getOptions();
		for(WebElement option : options) {
			System.out.println(option.getText());
		}
		
		select.getFirstSelectedOption();
		select.selectByIndex(2);
	}
	public void selectCity() {
		actionsMoveToElement(citySelect, "citySelect");
		Select select = new Select(citySelect);
		select.selectByIndex(1);
		boolean val = select.isMultiple();
		System.out.println("Is Multiple : "+val);
		select.getFirstSelectedOption();
	}
	public void datePicker() {
		actionsClick(datePick, "Date selection");
		datePick.sendKeys("10-11-2023");
		String selectedDate = datePick.getAttribute("value");
		System.out.println("selectedDate is: "+selectedDate);
	}
	public void submit() {
		form.submit();
		System.out.println("Form subitted");
	}
}
