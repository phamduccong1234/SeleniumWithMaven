package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserWindowPage extends Page {

	public By btnTab = By.id("tabButton");

	public By btnWindow = By.id("windowButton");

	By btnWindowMessage = By.id("messageWindowButton");

	public By txtHeadingTab = By.id("sampleHeading");

	public BrowserWindowPage(WebDriver dr) {
		super(dr);
	}

}
