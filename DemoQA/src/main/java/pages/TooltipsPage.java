package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TooltipsPage extends Page{
	
	public By btnToolTip = By.id("toolTipButton");
	public By txtTextField = By.id("toolTipTextField");
	public By txtText = By.xpath("//*[text()='Contrary']");
	public By txtNumber = By.xpath("//*[text()='1.10.32']");
	
	public By hvToolTip = By.xpath("//div[@id='buttonToolTip']//following::div");
	public By hvTextField = By.xpath("//div[@id='textFieldToolTip']//following::div");
	public By hvText = By.xpath("//div[@id='contraryTexToolTip']//following::div");
	public By hvNumber = By.xpath("//div[@id='sectionToolTip']//following::div");

	public TooltipsPage(WebDriver dr) {
		super(dr);
	}

	
}
