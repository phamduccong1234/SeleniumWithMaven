package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.TestBasic;

public class Page {
    public WebDriver driver;
	public TestBasic testBasic = new TestBasic();

	public Page(WebDriver dr) {
		testBasic.driver = dr;
		driver = testBasic.driver;
	}

	public WebElement findElementByLocator(By locator) {
		return driver.findElement(locator);
	}
}
