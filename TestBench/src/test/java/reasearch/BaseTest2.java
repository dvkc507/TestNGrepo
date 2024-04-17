package reasearch;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest2 {
	@BeforeTest
	public void setup() {
		System.out.println("Before2");
	}
	@AfterTest
	public void cleanup() {
		System.out.println("After2");
	}
	public void normalMethod() {
		System.out.println("method2");
	}
}
