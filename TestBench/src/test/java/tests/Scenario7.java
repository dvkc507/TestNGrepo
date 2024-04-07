package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.qameta.allure.Allure;
import utils.DriverHandler;

public class Scenario7 {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = DriverHandler.getDriver();
	}

	@Test(description = "Program to find broken links in a page")
	public void tc1() throws IOException {
		URL link = null;
		try {
			driver.get("https://bstackdemo.com/");
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			Allure.step("Total number of links :" + allLinks.size());
			for (WebElement ele : allLinks) {
				String url = ele.getAttribute("href");
				link = new URL(url);
				HttpURLConnection connection = (HttpURLConnection) link.openConnection();
				connection.setConnectTimeout(10);
				connection.connect();
				if (connection.getResponseCode() >= 400) {
					/*
					 * 400 bad request url might be wrong
					 *  404 page not found 
					 *  408 request gateway timed out
					 *   500 service not available
					 */
					Allure.step("Broken link found :" + link + " status code :" + connection.getResponseCode());
				}
			}
		} catch (Exception e) {
			System.out.println("Error while checking the links" + link + " " + e.getMessage());
		}

	}
	@AfterMethod
	public void cleanup()
	{
		DriverHandler.quitDriver();
	}
}
