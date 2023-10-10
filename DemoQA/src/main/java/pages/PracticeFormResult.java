package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormResult extends Page{
	
	String valueXpath = "//*[text()='@param']/following-sibling::td";
	
	public String getValueByLabel(String label) {
		String value = "";
		String newValueXpath = valueXpath.replace("@param", label);
		value = driver.findElement(By.xpath(newValueXpath)).getText();
		return value;
	}

	public PracticeFormResult(WebDriver dr) {
		super(dr);
	}
	
}
