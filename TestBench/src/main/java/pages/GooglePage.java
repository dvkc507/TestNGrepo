package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage{
WebDriver driver;
	public GooglePage(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath = "//textarea[@aria-label='Search' and @id='APjFqb']")
	WebElement searchBox;
	@FindBy(xpath = "//body[@class ='srp']")
	WebElement htmlBody;
	
	public void searchGoogle() {
		click(searchBox, "searchBox", 5);
		searchBox.sendKeys("Software testing" +Keys.ENTER);
		boolean val= driver.getPageSource().contains("Software testing");
		System.out.println("Contains Software testing :"+val);
		Actions a = new Actions(driver);
		Action keydown = a.keyDown(Keys.CONTROL).sendKeys("a").build();
		keydown.perform();
		System.out.println("selected entire text");
	}
	public void keyUpTesting() {
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).sendKeys(searchBox,"Software").keyUp(Keys.SHIFT).sendKeys(" testing").perform();
		System.out.println("selected keydown");
	}

}
