package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage extends Page{
	
	By txtIframe = By.id("sampleHeading");
	
	public String getIframeString() {
		String result = "";
		List<WebElement> txtIframeElements = driver.findElements(txtIframe);
		for(WebElement e : txtIframeElements) {
			result = result + e.getText() + " ";
		}
		return result.trim();
	}

	public FramesPage(WebDriver dr) {
		super(dr);
	}
	
}
