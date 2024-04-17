package tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.DriverHandler;
import utils.ExcelUtil;

public class Flipkart {
	WebDriver driver;
	@BeforeMethod
	public void setup() throws IOException {

		driver = DriverHandler.getDriver();

}
	@Test
	public void test1() {
		driver.get("https://www.flipkart.com/mobile-phones-store");
		driver.findElement(By.xpath("//span[contains(text(),'Electronics')]")).click();
		driver.findElement(By.xpath("//a[@title='Mi']")).click();
	}
}
