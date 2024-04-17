package reasearch;


import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utils.DriverHandler;


public class Test2 extends BaseTest2{
	WebDriver driver;
	@Test(timeOut =2000,successPercentage = 10,invocationCount =10)
	public void method1() throws InterruptedException {
//		driver = DriverHandler.getDriver();
//		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		System.out.println("Test1");
		normalMethod();
		Reporter.log("<a href = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png' target='blank'> I am from method</a>");
		Reporter.log("<br>");
		Reporter.log("<img height =200 weight =200 src = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png'>");
		Thread.sleep(2000);
		Date d = new Date();
		System.out.println(d);
		//driver.close();
	}
}

