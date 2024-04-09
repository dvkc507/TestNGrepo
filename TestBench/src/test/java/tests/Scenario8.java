package tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.DriverHandler;

public class Scenario8 {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = DriverHandler.getDriver();
	}
	@Test(description="Testing Authentication popup")
	public void popupAuthLogin() throws InterruptedException, IOException {
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Wait<WebDriver> wait = new FluentWait(driver)
				  .withTimeout(Duration.ofSeconds(40))
				  .pollingEvery(Duration.ofMillis(5000));
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'Congratulations! ')]"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		//TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String dest ="./screen.png";
		FileUtils.copyFile(src,new File(dest));
		//ways to refresh browser
		driver.getCurrentUrl();
		driver.navigate().refresh();
		driver.navigate().to(driver.getCurrentUrl());		
		driver.findElement(By.tagName("HTML")).sendKeys(Keys.F5);
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
