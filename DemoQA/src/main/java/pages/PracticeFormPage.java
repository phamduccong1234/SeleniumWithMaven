package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends Page{
	
	By txtFirstName = By.id("firstName");
	By txtLastName = By.id("lastName");
	By txtUserMail = By.id("userEmail");
	By rdGender = By.xpath("//label[@for='gender-radio-1']");
	By txtUserNumber = By.id("userNumber");
	By txtDOB = By.id("dateOfBirthInput");
	
	By selectYear = By.xpath("//option[text()='1998']");
	By selectMonth = By.xpath("//option[text()='December']");
	By selectDay = By.xpath("//div[text()='9']");
	
	By txtSubject = By.id("subjectsInput");
	By cbHobbie = By.xpath("//label[@for='hobbies-checkbox-1']");
	By txtUploadPicture = By.id("uploadPicture");
	By txtCurrentAddress = By.id("currentAddress");
	By mnState = By.xpath("state");
	By mnCity = By.id("city");
	
	By btnSubmit = By.id("submit");
	
	public void inputFirstName(String firstName) {
		driver.findElement(txtFirstName).sendKeys(firstName);
	}
	
	public void inputLastName(String lastName) {
		driver.findElement(txtLastName).sendKeys(lastName);
	}
	
	public void inputUserMail(String userMail) {
		driver.findElement(txtUserMail).sendKeys(userMail);
	}
	
	public void clickGender() {
		driver.findElement(rdGender).click();
	}
	
	public void inputUserNumber(String userNumber) {
		driver.findElement(txtUserNumber).sendKeys(userNumber);
	}
	
	public void inputDOB() {
		driver.findElement(txtDOB).click();
	}
	
	public void selectYear() {
		driver.findElement(selectYear).click();
	}
	
	public void selectMonth() {
		driver.findElement(selectMonth).click();
	}
	
	public void selectDay() {
		driver.findElement(selectDay).click();
	}
	
	public void inputSubject(String subject) {
		driver.findElement(txtSubject).sendKeys(subject);
	}
	
	public void keyEnterSubject() {
		driver.findElement(txtSubject).sendKeys(Keys.ENTER);
	}
	
	public void clickHobbie() {
		driver.findElement(cbHobbie).click();
	}
	
	public void inputUploadPicture() {
		driver.findElement(txtUploadPicture).sendKeys(System.getProperty("user.dir") + "/src/main/resources/images/Cong.jpg");
	}
	
	public void inputCurrentAddress(String currentAddress) {
		driver.findElement(txtCurrentAddress).sendKeys(currentAddress);
	}
	
	public void selectState() {
		driver.findElement(mnState).click();
	}
	
	public void keyDownState() {
		driver.findElement(mnState).sendKeys(Keys.ARROW_DOWN);
	}
	
	public void keyEnterState() {
		driver.findElement(mnState).sendKeys(Keys.ENTER);
	}
	
	public void selectCity() {
		driver.findElement(mnCity).click();
	}
	
	public void keyDownCity() {
		driver.findElement(mnState).sendKeys(Keys.ARROW_DOWN);
	}
	
	public void keyEnterCity() {
		driver.findElement(mnState).sendKeys(Keys.ENTER);
	}
	
	public void clickSubmitButton() {
		driver.findElement(btnSubmit).click();
	}

	public PracticeFormPage(WebDriver dr) {
		driver = dr;
	}
	
	

}
