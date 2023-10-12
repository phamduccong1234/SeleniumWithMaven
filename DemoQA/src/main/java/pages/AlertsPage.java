package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage extends Page{
	
	public By btnAlert = By.id("alertButton");
	
	public By btntimerAlert = By.id("timerAlertButton");
	
	public By btnconfirmAlert = By.id("confirmButton");
	
	public By btnpromtAlert = By.id("promtButton");
	
	By txtConfirm = By.id("confirmResult");
	
	By txtPrompt = By.id("promptResult");
	
	public String getConfirmAlertString() {
		String result = "";
		List<WebElement> txtConfirmResultElements = driver.findElements(txtConfirm);
		for (WebElement e : txtConfirmResultElements) {
			result = result + e.getText() + " ";
		}
		return result.trim(); // clear space start & end
	}
	
	public String getPromptResultString() {
		String result = "";
		List<WebElement> txtPromptResultElements = driver.findElements(txtPrompt);
		for (WebElement e : txtPromptResultElements) {
			result = result + e.getText() + " ";
		}
		return result.trim(); // clear space start & end
	}

	public AlertsPage(WebDriver dr) {
		super(dr);
	}
	
	

}
