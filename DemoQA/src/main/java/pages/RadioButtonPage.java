package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage extends Page {

	public By lbYes = By.xpath("//label[@for='yesRadio']");

	public By lbImpressive = By.xpath("//label[@for='impressiveRadio']");

	public By rdYes = By.id("yesRadio");

	public By rdImpressive = By.id("impressiveRadio");

	By lbResult = By.xpath("//span[@class='text-success']");

	public void clickYesRadioButton() {
		driver.findElement(lbYes).click();
	}
	
	public void clickImpressiveRadioButton() {
		driver.findElement(lbImpressive).click();
	}

	public boolean isYesRadioSelected(By locator) {
		boolean result = false;
		Boolean checkYesRadio = driver.findElement(locator).isSelected();
		if (checkYesRadio) {
			result = true;
		}
		return result;
	}

	public boolean isImpressiveRadioSelected(By locator) {
		boolean result = false;
		Boolean checkImpressiveRadio = driver.findElement(locator).isSelected();
		if (checkImpressiveRadio) {
			result = true;
		}
		return result;
	}

	public String getYesRadioString() {
		String result = "";
		List<WebElement> lbYesElements = driver.findElements(lbResult);
		for (WebElement e : lbYesElements) {
			result = e.getText();
		}
		return result; 
	}
	
	public String getImpressiveRadioString() {
		String result = "";
		List<WebElement> lbImpressiveElements = driver.findElements(lbResult);
		for (WebElement e : lbImpressiveElements) {
			result = e.getText();
		}
		return result; 
	}

	public RadioButtonPage(WebDriver dr) {
		super(dr);
	}

}
