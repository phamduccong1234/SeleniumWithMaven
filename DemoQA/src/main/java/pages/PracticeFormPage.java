package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends Page{

	public By txtFirstName = By.id("firstName");
	public By txtLastName = By.id("lastName");
	public By txtUserMail = By.id("userEmail");
	public By txtUserNumber = By.id("userNumber");
	By txtDOB = By.id("dateOfBirthInput");
	
	String selectYear = "//option[text()='@params']";
	String selectMonth = "//option[text()='@params']";
	String selectDay = "//div[text()='@params']";
	
	public By txtSubject = By.id("subjectsInput");
	By txtUploadPicture = By.id("uploadPicture");
	public By txtCurrentAddress = By.id("currentAddress");
	public By mnState = By.xpath("//input[@id='react-select-3-input']");
	public By mnCity = By.xpath("//input[@id='react-select-4-input']");
	
	By btnSubmit = By.id("submit");
	
	public void inputDOB() {
		driver.findElement(txtDOB).click();
	}
	
	public void selectYear(String year) {
		String xpathYear = selectYear.replace("@params", year);
		driver.findElement(By.xpath(xpathYear)).click();
	}
	
	public void selectMonth(String month) {
		String xpathMonth = selectMonth.replace("@params", month);
		driver.findElement(By.xpath(xpathMonth)).click();
	}
	
	public void selectDay(String day) {
		String xpathDay = selectDay.replace("@params", day);
		driver.findElement(By.xpath(xpathDay)).click();
	}
	
	public void inputUploadPicture() {
		driver.findElement(txtUploadPicture).sendKeys(System.getProperty("user.dir") + "/src/main/resources/images/Cong.jpg");
	}
	
	public void inputCurrentAddress(String currentAddress) {
		driver.findElement(txtCurrentAddress).sendKeys(currentAddress);
	}
	
	public void clickSubmitButton() {
		driver.findElement(btnSubmit).click();
	}
	
	public PracticeFormPage(WebDriver dr) {
		driver = dr;
	}
}
