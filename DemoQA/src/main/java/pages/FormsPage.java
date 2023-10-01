package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends Page{
	
	By menuPracticeForm = By.xpath("//span[text()='Practice Form']");
	
	public PracticeFormPage clickPracticeFormMenu() {
		driver.findElement(menuPracticeForm).click();
		return new PracticeFormPage(driver);
	}

	public FormsPage(WebDriver dr) {
		driver = dr;
	}
	
	

}
