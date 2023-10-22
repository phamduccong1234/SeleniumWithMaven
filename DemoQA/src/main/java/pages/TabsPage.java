package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TabsPage extends Page{
	
	public By tabWhat = By.id("demo-tab-what");
	public By tabOrigin = By.id("demo-tab-origin");
	public By tabUse = By.id("demo-tab-use");
	By tabMore = By.id("demo-tab-more");
	
	public By txtWhat = By.xpath("//*[@id='demo-tabpane-what']//descendant::p");
	public By txtOrigin = By.xpath("//*[@id='demo-tabpane-origin']//descendant::p");
	public By txtUse = By.xpath("//*[@id='demo-tabpane-use']//descendant::p");
	
	public boolean isTabActive(By locator) {
		boolean result = false;
		String cssClassValue = driver.findElement(locator).getAttribute("class");
		if (cssClassValue.contains("active")) {
			result = true;
		}
		return result;
	}
	
	public String getPanelString(By locator) {
		String result = "";
		List<WebElement> lsContent = driver.findElements(locator);
		for (WebElement l : lsContent) {
			if (lsContent.size() > 1) {
				result.concat(result);
				result = result + l.getText() + " ";
			} else {
				result = result + l.getText() + " ";
			}
		}
		return result.trim();
	}

	public TabsPage(WebDriver dr) {
		super(dr);
	}
}
