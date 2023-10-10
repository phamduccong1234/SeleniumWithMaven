package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class TextBoxPage extends Page {

	public By txtFullName = By.id("userName");
	public By txtEmail = By.id("userEmail");
	public By txtCurrentAddress = By.id("currentAddress");
	public By txtPermanentAddress = By.id("permanentAddress");
	public By btnSubmit = By.id("submit");

	public By lbName = By.id("name");
	public By lbEmail = By.id("email");
	public By lbCurrentAddress = By.xpath("//p[@id='currentAddress']");
	public By lbPermanentAddress = By.xpath("//p[@id='permanentAddress']");

	By clTextBoxEmail = By.xpath("");

	public void clickSubmitButton() {
		driver.findElement(btnSubmit).click();
	}

	public String getTextResult(By element) {
		String result = "";
		String text = driver.findElement(element).getText();
		result = text.substring(text.indexOf(":") + 1);
		return result;
	}

	public String getErrorColor(By element) {
		String result = "";
		WebElement colorTextInputBox = driver.findElement(element);
		String color = colorTextInputBox.getCssValue("field-error");
		result = Color.fromString(color).asHex();
		return result;
	}

	public boolean isRedBorder(By locator) {
		boolean result = false;
		String cssClassValue = driver.findElement(locator).getAttribute("class");
		if (cssClassValue.contains("field-error")) {
			result = true;
		}
		return result;
	}

	public TextBoxPage(WebDriver dr) {
		super(dr);
	}

}
