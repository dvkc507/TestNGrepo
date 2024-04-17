package reasearch;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utils.DriverHandler;


public class Test1 extends BaseTest2{
	WebDriver driver;
	@Test(timeOut =10000,successPercentage = 80,invocationCount =2)
	public void method1() throws InterruptedException {
		driver = DriverHandler.getDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		System.out.println("Test1");
		normalMethod();
		Reporter.log("<a href = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png' target='blank'> I am from method</a>");
		Reporter.log("<br>");
		Reporter.log("<img height =200 weight =200 src = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png'>");
		Thread.sleep(4000);
		Date d = new Date();
		System.out.println(d);
		driver.close();
	}
	@Test(timeOut =10000)
	public void method2() throws InterruptedException {
		WebDriver	driver1 = DriverHandler.getDriver();
		driver1.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		System.out.println("Test2");
		normalMethod();
		Reporter.log("<a href = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png' target='blank'> I am from method</a>");
		Reporter.log("<br>");
		Reporter.log("<img height =200 weight =200 src = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png'>");
		Thread.sleep(4000);
		Date d = new Date();
		System.out.println(d);
		driver1.close();
	}
	@Test(timeOut =10000)
	public void method3() throws InterruptedException {
		WebDriver driver2 = DriverHandler.getDriver();
		driver2.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		System.out.println("Test3");
		normalMethod();
		Reporter.log("<a href = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png' target='blank'> I am from method</a>");
		Reporter.log("<br>");
		Reporter.log("<img height =200 weight =200 src = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png'>");
		Thread.sleep(4000);
		Date d = new Date();
		System.out.println(d);
		driver2.close();
	}
	@Test(timeOut =10000)
	public void method4() throws InterruptedException {
		WebDriver driver3 = DriverHandler.getDriver();
		driver3.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		System.out.println("Test4");
		normalMethod();
		Reporter.log("<a href = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png' target='blank'> I am from method</a>");
		Reporter.log("<br>");
		Reporter.log("<img height =200 weight =200 src = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png'>");
		Thread.sleep(4000);
		Date d = new Date();
		System.out.println(d);
		driver3.close();
	}
	@Test(timeOut =10000)
	public void method5() throws InterruptedException {
		WebDriver driver4 = DriverHandler.getDriver();
		driver4.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		System.out.println("Test5");
		normalMethod();
		Reporter.log("<a href = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png' target='blank'> I am from method</a>");
		Reporter.log("<br>");
		Reporter.log("<img height =200 weight =200 src = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png'>");
		Thread.sleep(4000);
		Date d = new Date();
		System.out.println(d);
		driver4.close();
	}
	@Test(timeOut =10000)
	public void method6() throws InterruptedException {
		WebDriver driver5 = DriverHandler.getDriver();
		driver5.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		System.out.println("Test6");
		normalMethod();
		Reporter.log("<a href = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png' target='blank'> I am from method</a>");
		Reporter.log("<br>");
		Reporter.log("<img height =200 weight =200 src = 'C:/Users/vdoppalapudi/Desktop/KT/Automation/TestNGrepo/TestBench/screen.png'>");
		Thread.sleep(4000);
		Date d = new Date();
		System.out.println(d);
		driver5.close();
	}

}
