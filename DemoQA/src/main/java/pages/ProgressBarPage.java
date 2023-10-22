package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgressBarPage extends Page{
	
	public By btnStart = By.id("startStopButton");
	
	public By txtProgressBar = By.xpath("//div[@role='progressbar']");

	public ProgressBarPage(WebDriver dr) {
		super(dr);
	}
}
