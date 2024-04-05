package utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverHandler {
	private static WebDriver driver;
	public static WebDriver getDriver() {
		try {
		System.out.println("driver value :"+driver);
		// for selenium 4 below is not required, it has Factory Driver to take care of versioning
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			/* these methods got deprecated in selenium4
			 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 * driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
			 * driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			 */
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}
		catch(Exception e){
			e.printStackTrace();
		}
		return driver;
	}
	public static void quitDriver() {
		if(driver != null) {
			driver.quit();
		}
		
	}

}
