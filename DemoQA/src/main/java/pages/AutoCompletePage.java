package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoCompletePage extends Page{
	
	public By txtMultipleColor = By.id("autoCompleteMultipleInput");
	
	public By txtSingleColor = By.id("autoCompleteSingleInput");
	
//	public By lbMultipleColor = By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]//descendant::div[4]");
//	
//	public By lbSingleColor = By.xpath("//div[@id=\"autoCompleteMultipleContainer\"]//descendant::div[7]");
//	
//	public By lbMultipleColor = By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]//descendant::div");
	
	String lbColor = "//*[contains(text(), '@param')]"; 
	
	public String getValueColor(String color) {
		String result = "";
		String xpathColor = lbColor.replace("@param", color);
		String lsColor = driver.findElement(By.xpath(xpathColor)).getText();
		result = lsColor;
		return result;
	}

	public AutoCompletePage(WebDriver dr) {
		super(dr);
	}
}
