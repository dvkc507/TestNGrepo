package pages;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriver driver;
	private WebDriverWait wait;
	private Actions a;
	final int defaultWaitTime = 10;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.a = new Actions(driver);
	}

public void click(WebElement ele, String eleName, int... timeoutInSeconds){
	int sec = timeoutInSeconds.length>0 ? timeoutInSeconds[0] : defaultWaitTime;
	Duration time = Duration.ofSeconds(sec);
	wait = new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	ele.click();
	System.out.println("Clicked on element :" +eleName);
}
public void sendKeys(WebElement ele, String eleName, String val, int... timeoutInSeconds){
	click(ele, eleName, timeoutInSeconds);
	ele.sendKeys(val);
	System.out.println("provided text value :" +eleName);
}
public void actionSendKeys(WebElement ele, String eleName, String val, int... timeoutInSeconds){
	actionsClick(ele, eleName, timeoutInSeconds);
	ele.sendKeys(val);
	System.out.println("provided text value :" +eleName);
}
public void actionsClick(WebElement ele, String eleName, int... timeoutInSeconds) {
	int sec = timeoutInSeconds.length>0 ? timeoutInSeconds[0] : defaultWaitTime;
	Duration time = Duration.ofSeconds(sec);
	wait = new WebDriverWait(driver, time);
	wait.until(ExpectedConditions.elementToBeClickable(ele));
	a.moveToElement(ele).click().perform();
	System.out.println("Clicked on element :" +eleName);
}
public void fileUpload(WebElement ele, String eleName,String filePath, int... timeoutInSeconds) {
	String path = System.getProperty("user.dir");
	File f = new File(path+filePath);
	System.out.println(f.getAbsolutePath());
	int sec = timeoutInSeconds.length>0 ? timeoutInSeconds[0] : defaultWaitTime;
	Duration time = Duration.ofSeconds(sec);
	wait.until(ExpectedConditions.visibilityOf(ele));
	ele.sendKeys(f.getAbsolutePath());
	a.sendKeys(Keys.ENTER).perform();
	System.out.println("File uploaded :" +eleName);	
}
public void actionsMoveToElement(WebElement ele, String eleName, int... timeoutInSeconds) {
	int sec = timeoutInSeconds.length>0 ? timeoutInSeconds[0] : defaultWaitTime;
	Duration time = Duration.ofSeconds(sec);
	wait.until(ExpectedConditions.visibilityOf(ele));
	a.moveToElement(ele).perform();
	System.out.println("moved to element :" +eleName);
}
public void waitForAlert(int... timeoutInSeconds) {
	int sec = timeoutInSeconds.length>0 ? timeoutInSeconds[0] : defaultWaitTime;
	Duration time = Duration.ofSeconds(sec);
	wait.until(ExpectedConditions.alertIsPresent());
}
}
