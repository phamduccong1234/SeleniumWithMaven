package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookStoreApplicationPage extends Page{
	
	public By menuLogin = By.xpath("//span[text()='Login']");
	
	public LoginPage clickLoginMenu() {
		driver.findElement(menuLogin).click();
		return new LoginPage(driver);
	}

	public BookStoreApplicationPage(WebDriver dr) {
		super(dr);
	}
}
