package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends Page {

	By menuTextBox = By.xpath("//span[text()='Text Box']");

	By menuCheckBox = By.xpath("//span[text()='Check Box']");
	
	By menuRadioButton = By.xpath("//span[text()='Radio Button']");

	By menuWebTables = By.xpath("//span[text()='Web Tables']");
	
	By menuButtons = By.xpath("//span[text()='Buttons']");

	public TextBoxPage clickTextBoxMenu() {
		driver.findElement(menuTextBox).click();
		return new TextBoxPage(driver);
	}

	public CheckBoxPage clickCheckBoxMenu() {
		driver.findElement(menuCheckBox).click();
		return new CheckBoxPage(driver);
	}
	
	public RadioButtonPage clickRadioButtonMenu() {
		driver.findElement(menuRadioButton).click();
		return new RadioButtonPage(driver);
	}

	public WebTablesPage clickWebTablesMenu() {
		driver.findElement(menuWebTables).click();
		return new WebTablesPage(driver);
	}
	
	public ButtonsPage clickButtonsMenu() {
		driver.findElement(menuButtons).click();
		return new ButtonsPage(driver);
	}

	public ElementsPage(WebDriver dr) {
		super(dr);
	}

}
