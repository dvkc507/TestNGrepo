package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowActionsPage extends BasePage{
	WebDriver driver;
	
	public WindowActionsPage(WebDriver driver) {
		super(driver);
		this.driver=(driver);
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[contains(text(),' Alerts, Frames & Windows ')]")
	WebElement Alert_Window_butoon;
	@FindBy(xpath = "//a[contains(text(),' Browser Windows')]")
	WebElement BrowserWindow;
	@FindBy(xpath = "//a[contains(text(),' Alerts')]")
	WebElement AlertsButton;
	@FindBy(xpath = "//a[contains(text(),' Frames')]")
	WebElement Frames;
	@FindBy(xpath = "//button[contains(text(),'New Tab')]")
	WebElement NewTab;
	@FindBy(xpath = "//button[text()='New Window']") 
	WebElement NewWindow;
	@FindBy(xpath = "//button[text()='New Window Message']")
	WebElement  NewWindowMessage; 
	@FindBy(xpath = "//*[contains(text(),'New Window')]")
	WebElement InsideNewWindow;
	@FindBy(xpath = "//*[text()='New Window Message']")
	WebElement New_WindowMessage;
	@FindBy(xpath = "//button[text()='Alert']")
	WebElement Alert;
	@FindBy(xpath = "//button[@class='btn btn-primary' and text()='Click Me' and @onClick ='myMessage()']")
	WebElement Alert5Sec;
	@FindBy(xpath = "//button[@type='button' and text()='Click Me' and @onClick ='myDesk()']")
	WebElement AlertDismiss;
	@FindBy(xpath = "//button[@type='button' and text()='Click Me' and @onClick ='myPromp()']")
	WebElement AlertPromptForText;
	@FindBy(xpath = "//div[text()='You pressed Cancel!']")
	WebElement VerifyTextAfterAlert;
	

	
	public void expandWindow_alert() {
		click(Alert_Window_butoon, "Click to expand window", 10);
	}
	
	public void windowTesting() {
		String parent = driver.getWindowHandle();
		click(BrowserWindow, "BrowserWindow", 10);
		click(NewWindow, "NewWindow", 5);
		Set<String> set= driver.getWindowHandles();
		for(String w : set) {
			if(!parent.equalsIgnoreCase(w)) {				
				driver.switchTo().window(w);
				System.out.println(driver.getTitle());
				System.out.println(InsideNewWindow.getText());				
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}
	public void newWindow() {
		click(NewWindowMessage, "NewWindowMessage", 10);
		String parent = driver.getWindowHandle();
		Set<String> set= driver.getWindowHandles();
		for(String w : set) {
			if(!parent.equalsIgnoreCase(w)) {				
				driver.switchTo().window(w);
				System.out.println(driver.getTitle());
				System.out.println(InsideNewWindow.getText());
				System.out.println(InsideNewWindow.getAttribute("value"));
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}
	public void switchTab() {
		click(NewTab, "NewTab", 10);
		String parent = driver.getWindowHandle();
		Set<String> set= driver.getWindowHandles();
		for(String w : set) {
			if(!parent.equalsIgnoreCase(w)) {				
				driver.switchTo().window(w);
				System.out.println(driver.getTitle());
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}
	public void alertsAccept() {
		click(AlertsButton, "AlertsButton", 10);
		click(Alert, "Alert", 5);
		driver.switchTo().alert().accept();	
	}
	public void alert5SecTest() {
		click(Alert5Sec, "AlertAfter5Sec", 5);
		waitForAlert(15);
		driver.switchTo().alert().accept();	
	}
	public void alertDismiss() {
		click(AlertDismiss, "AlertDismiss", 5);
		waitForAlert(15);
		driver.switchTo().alert().dismiss();
		System.out.println("Text after dismiss : "+VerifyTextAfterAlert.getText());
	}
	public void alertSendText() {
		click(AlertPromptForText, "AlertPromptForText", 5);
		waitForAlert(15);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.sendKeys("Testing ");
		alert.accept();
		System.out.println("Text on alert : "+alertText);
	}
	public void framesTesting() {
		
	}
	

}
