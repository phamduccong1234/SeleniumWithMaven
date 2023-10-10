package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage extends Page {

	public By txtFirstName = By.id("firstName");
	public By txtLastName = By.id("lastName");
	public By txtUserMail = By.id("userEmail");
	public By txtUserNumber = By.id("userNumber");
	By txtDOB = By.id("dateOfBirthInput");

	String selectYear = "//option[text()='@param']";
	String selectMonth = "//option[text()='@param']";
	String selectDays = "//div[text()='@param']";

	public By txtSubject = By.id("subjectsInput");
	By txtUploadPicture = By.id("uploadPicture");
	public By txtCurrentAddress = By.id("currentAddress");
	public By mnState = By.xpath("//input[@id='react-select-3-input']");
	public By mnCity = By.xpath("//input[@id='react-select-4-input']");

	public By btnSubmit = By.id("submit");

	public void clickRadioButtonByLabel(String radioLabel) {
		String xpathRadio = "//*[text()='" + radioLabel + "']";
		By rdElement = By.xpath(xpathRadio);
		driver.findElement(rdElement).click();
	}

	public void clickCheckboxByLabel(String checkboxLabel) {
		String xpathCheckbox = "//*[text()='" + checkboxLabel + "']";
		By cbElement = By.xpath(xpathCheckbox);
		driver.findElement(cbElement).click();
	}

	public void selectYear(String year) {
		String xpathYear = selectYear.replace("@param", year);
		driver.findElement(By.xpath(xpathYear)).click();
	}

	public void selectMonth(String month) {
		String xpathMonth = selectMonth.replace("@param", month);
		driver.findElement(By.xpath(xpathMonth)).click();
	}

	public void selectDay(String day) {
		String xpathDay = selectDays.replace("@param", day);
		List<WebElement> dayElements = driver.findElements(By.xpath(xpathDay)); // Data special
		dayElements.get(0).click();
	}

	public void selectDateOfBirth(String year, String month, String day) {
		driver.findElement(txtDOB).click();
		selectYear(year);
		selectMonth(month);
		selectDay(day);
	}

	public void inputUploadPicture() {
		driver.findElement(txtUploadPicture)
				.sendKeys(System.getProperty("user.dir") + "/src/main/resources/images/Cong.jpg");
	}

	public PracticeFormPage(WebDriver dr) {
		super(dr);
	}
}
