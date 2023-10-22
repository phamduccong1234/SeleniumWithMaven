package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccordianPage extends Page {

	public By lbSection1 = By.id("section1Heading");
	public By lbSection2 = By.id("section2Heading");
	public By lbSection3 = By.id("section3Heading");

	public By lbSection1Show = By.xpath("//div[@id='section1Heading']/following-sibling::div");
	public By lbSection2Show = By.xpath("//div[@id='section2Heading']/following-sibling::div");
	public By lbSection3Show = By.xpath("//div[@id='section3Heading']/following-sibling::div");

	public By txtSection1 = By.xpath("//div[@id='section1Content']/p");
	public By txtSection2 = By.xpath("//div[@id='section2Content']/p");
	public By txtSection3 = By.xpath("//div[@id='section3Content']/p");

	public String getHeaderText(By locator) {
		String result = "";
		List<WebElement> lsContent = driver.findElements(locator);
		for (WebElement l : lsContent) {
			result = result + l.getText() + " ";
		}
		return result.trim();
	}

	public String getContentText(By locator) {
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

	public boolean isSectionExpand(By locator) {
		boolean result = false;
		String cssClassValue = driver.findElement(locator).getAttribute("class");
		if (cssClassValue.contains("show")) {
			result = true;
		}
		return result;
	}

	public AccordianPage(WebDriver dr) {
		super(dr);
	}

}
