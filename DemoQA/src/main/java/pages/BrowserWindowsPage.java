package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserWindowsPage extends Page {
	
	public String browserWindow = driver.getWindowHandle();

	public By btnTab = By.id("tabButton");

	public By btnWindow = By.id("windowButton");

	public By btnWindowMessage = By.id("messageWindowButton");

	By txtHeadingTab = By.id("sampleHeading");
	
	By txtBodyMessage = By.tagName("body");
	
	public NewTabPage clickNewTabPage() {
		
		testBasic.clickByLocator(btnTab);
		
		Set<String> windows = driver.getWindowHandles();
		
		String expectedHeadingText = "This is a sample page";

		for (String handle : windows) {
			if (!handle.equals(browserWindow)) {
				driver.switchTo().window(handle);
				String actualHeadingText = testBasic.getTextByLocator(txtHeadingTab);
				Assert.assertEquals(actualHeadingText, expectedHeadingText);
				testBasic.closeCurentWindow();
			}
		}
		driver.switchTo().window(browserWindow);
		
		return new NewTabPage(driver);
	}
	
	public NewWindowPage clickNewWindowPage() {
		
		testBasic.clickByLocator(btnWindow);
		
		Set<String> windows = driver.getWindowHandles();
		
		String expectedHeadingNewWindow = "This is a sample page";

		for (String handle : windows) {
			if (!handle.equals(browserWindow)) {
				testBasic.driver.switchTo().window(handle);
				String actualHeadingNewWindow = testBasic.getTextByLocator(txtHeadingTab);
				Assert.assertEquals(actualHeadingNewWindow, expectedHeadingNewWindow);
				testBasic.closeCurentWindow();
			}
		}
		driver.switchTo().window(browserWindow);
		
		return new NewWindowPage(driver);
	}
	
	public NewWindowMessagePage clickNewWindowMessagePage() {
		
		testBasic.clickByLocator(btnWindowMessage);
		
		Set<String> windows = driver.getWindowHandles();

		for (String handle : windows) {
			if (!handle.equals(browserWindow)) {
				testBasic.driver.switchTo().window(handle);
				String textWindowMessage = driver.findElement(txtBodyMessage).getText();
				System.out.println("mmmm:         " + textWindowMessage);
//				testBasic.closeCurentWindow();
			}
		}
		driver.switchTo().window(browserWindow);
		
		return new NewWindowMessagePage(driver);
	}

	public BrowserWindowsPage(WebDriver dr) {
		super(dr);
	}

}
