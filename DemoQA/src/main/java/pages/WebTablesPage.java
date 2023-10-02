package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends Page {

	By txtSearchBox = By.id("searchBox");
	By txtFirstName = By.id("firstName");
	By txtLastName = By.id("lastName");
	By txtEmail = By.id("userEmail");
	By txtAge = By.id("age");
	By txtSalary = By.id("salary");
	By txtDepartment = By.id("department");

	By btnSearch = By.id("basic-addon2");

	By btnAddRecord = By.id("addNewRecordButton");

	By lbRowsTable = By.xpath("//div[@class='rt-tr-group']");

	By lbColumsTable = By.xpath("//div[@class='rt-td']");

	public void inputSearchBox(String keyword) {
		driver.findElement(txtSearchBox).sendKeys(keyword);
	}

	public void clickSearchButton() {
		driver.findElement(btnSearch).click();
	}

	public void clickAddButton() {
		driver.findElement(btnAddRecord).click();
	}

	public void inputFirstName(String firstName) {
		driver.findElement(txtFirstName).sendKeys(firstName);
	}

	public void inputLastName(String lastName) {
		driver.findElement(txtLastName).sendKeys(lastName);
	}

	public void inputEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}

	public void inputAge(String age) {
		driver.findElement(txtAge).sendKeys(age);
	}

	public void inputSalary(String salary) {
		driver.findElement(txtSalary).sendKeys(salary);
	}

	public void inputDepartment(String department) {
		driver.findElement(txtDepartment).sendKeys(department);
	}

	public WebTablesPage(WebDriver dr) {
		driver = dr;
	}

}
