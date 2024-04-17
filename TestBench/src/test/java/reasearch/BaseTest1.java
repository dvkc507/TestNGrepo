package reasearch;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest1 {
	@BeforeTest
	public void setup() {
		System.out.println("BeforeTest1");
	}
	@AfterTest
	public void cleanup() {
		System.out.println("AfterTest1");
	}
	public void normalMethod() {
		System.out.println("method1");
	}
}
