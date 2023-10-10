package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage extends Page {

	public By txtSearchBox = By.id("searchBox");
	public By txtFirstName = By.id("firstName");
	public By txtLastName = By.id("lastName");
	public By txtEmail = By.id("userEmail");
	public By txtAge = By.id("age");
	public By txtSalary = By.id("salary");
	public By txtDepartment = By.id("department");

	public By lbFirstName = By.xpath("//div[@role='grid']/div[2]//div[@role='row']/div[1]");

	public By lbLastName = By.xpath("//div[@role='grid']/div[2]//div[@role='row']/div[2]");

	public By lbAge = By.xpath("//div[@role='grid']/div[2]//div[@role='row']/div[3]");

	public By lbEmail = By.xpath("//div[@role='grid']/div[2]//div[@role='row']/div[4]");

	public By lbSalary = By.xpath("//div[@role='grid']/div[2]//div[@role='row']/div[5]");

	public By lbDepartment = By.xpath("//div[@role='grid']/div[2]//div[@role='row']/div[6]");

	public By btnSearch = By.id("basic-addon2");

	public By btnAddRecord = By.id("addNewRecordButton");

	public By btnSubmit = By.id("submit");

	public List<String> getFirstNameString() {
		String result = "";
		List<WebElement> lbFirstNameElement = driver.findElements(lbFirstName);
		List<String> lsFirstName = new ArrayList<String>();
		for (WebElement e : lbFirstNameElement) {
			result = e.getText();
			// Special If check null value ******
//			if(result != null) {
//				result = result.trim();
//				if (!result.isEmpty()) {
//					lbString.add(result);
//				}
//			} 
			
			// Special continue on If skip null & empty value ******
			if(result == null) {
				continue;
			} 
			result = result.trim();
			if(result.isEmpty()) {
				continue;
			}
			lsFirstName.add(result);
		}
		return lsFirstName;
	}

	public List<String> getLastNameString() {
		String result = "";
		List<WebElement> lbLastNameElement = driver.findElements(lbLastName);
		List<String> lsLastName = new ArrayList<String>();
		for (WebElement e : lbLastNameElement) {
			result = e.getText();
			if(result == null) {
				continue;
			} 
			result = result.trim();
			if(result.isEmpty()) {
				continue;
			}
			lsLastName.add(result);
		}
		return lsLastName;
	}

	public List<String> getAgeString() {
		String result = "";
		List<WebElement> lbAgeElement = driver.findElements(lbAge);
		List<String> lsAge = new ArrayList<String>();
		for (WebElement e : lbAgeElement) {
			result = e.getText();
			if(result == null) {
				continue;
			} 
			result = result.trim();
			if(result.isEmpty()) {
				continue;
			}
			lsAge.add(result);
		}
		return lsAge;
	}

	public List<String> getEmailString() {
		String result = "";
		List<WebElement> lbEmailElement = driver.findElements(lbEmail);
		List<String> lsEmail = new ArrayList<String>();
		for (WebElement e : lbEmailElement) {
			result = e.getText();
			if(result == null) {
				continue;
			} 
			result = result.trim();
			if(result.isEmpty()) {
				continue;
			}
			lsEmail.add(result);
		}
		return lsEmail;
	}

	public List<String> getSalaryString() {
		String result = "";
		List<WebElement> lbSalaryElement = driver.findElements(lbSalary);
		List<String> lsSalary = new ArrayList<String>();
		for (WebElement e : lbSalaryElement) {
			result = e.getText();
			if(result == null) {
				continue;
			} 
			result = result.trim();
			if(result.isEmpty()) {
				continue;
			}
			lsSalary.add(result);
		}
		return lsSalary;
	}

	public List<String> getDepartmentString() {
		String result = "";
		List<WebElement> lbDepartmentElement = driver.findElements(lbDepartment);
		List<String> lsDepartment = new ArrayList<String>();
		for (WebElement e : lbDepartmentElement) {
			result = e.getText();
			if(result == null) {
				continue;
			} 
			result = result.trim();
			if(result.isEmpty()) {
				continue;
			}
			lsDepartment.add(result);
		}
		return lsDepartment;
	}

	public boolean isCheckSearchResult(By locator, String keySearch) {
		boolean result = true;
		driver.findElement(txtSearchBox).sendKeys(keySearch);
		List<WebElement> lbSearchElement = driver.findElements(locator);
		for (WebElement e : lbSearchElement) {
			String text = e.getText();
			if (text == null || text.isEmpty() || text.trim().isEmpty()) {
				break;
			}
		}
		return result;
	}

	public WebTablesPage(WebDriver dr) {
		super(dr);
	}

}
