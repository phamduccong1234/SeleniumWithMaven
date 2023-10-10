package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ButtonsPage extends Page {

	public By btnClick = By.xpath("//button[text()='Click Me']");
	
	public By btnRightClick = By.id("rightClickBtn");
	
	public By btnDoubleClick = By.id("doubleClickBtn");
	
	By lbClick = By.id("dynamicClickMessage");
	
	By lbRightClick = By.id("rightClickMessage");
	
	By lbDoubleClick = By.id("doubleClickMessage");

	public void rightClickByLocator(By locator) {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(locator);
		action.contextClick(element).perform();
	}
	
	public void doubleClickByLocator(By locator) {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(locator);
		action.doubleClick(element).perform();
	}
	
	public String getClickString() {
		String resultClick = "";
		List<WebElement> lbClickElements = driver.findElements(lbClick);
		for (WebElement e : lbClickElements) {
			resultClick = resultClick + e.getText() + " ";
		}
		return resultClick.trim(); // clear space start & end
	}
	
	public String getRightClickString() {
		String resultRightClick = "";
		List<WebElement> lbRightClickElements = driver.findElements(lbRightClick);
		for (WebElement e : lbRightClickElements) {
			resultRightClick = resultRightClick + e.getText() + " ";
		}
		return resultRightClick.trim(); // clear space start & end
	}
	
	public String getDoubleClickString() {
		String resultDoubleClick = "";
		List<WebElement> lbDoubleClickElements = driver.findElements(lbDoubleClick);
		for (WebElement e : lbDoubleClickElements) {
			resultDoubleClick = resultDoubleClick + e.getText() + " ";
		}
		return resultDoubleClick.trim(); // clear space start & end
	}

	public ButtonsPage(WebDriver dr) {
		super(dr);
	}

}
