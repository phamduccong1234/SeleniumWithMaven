package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertFrameWindowPage extends Page{
	
	By menuBrowserWindows = By.xpath("//span[text()='Browser Windows']");
	
	By menuAlerts = By.xpath("//span[text()='Alerts']");
	
	By menuFrames = By.xpath("//span[text()='Frames']");

	public BrowserWindowPage clickBrowserWindowMenu() {
		driver.findElement(menuBrowserWindows).click();
		return new BrowserWindowPage(driver);
	}
	
	public AlertsPage clickAlertMenu() {
		driver.findElement(menuAlerts).click();
		return new AlertsPage(driver);
	}
	
	public FramesPage clickFramesMenu() {
		driver.findElement(menuFrames).click();
		return new FramesPage(driver);
	}

	public AlertFrameWindowPage(WebDriver dr) {
		super(dr);
	}
	
	

}
