package tests;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;

public class WebTablesTest extends TestCase{
	/**
	 * TextBox - TC01
	 */
//	@Test
	public void doTC01() {
		//Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);
		
		ElementsPage elementsPage = homePage.clickElements();
		WebTablesPage webTablesPage = elementsPage.clickWebTablesMenu();
		
		String inputKeySearch = "e";
		
		webTablesPage.testBasic.clickByLocator(webTablesPage.btnSearch);
		
		boolean result = webTablesPage.isCheckSearchResult(webTablesPage.lbFirstName, inputKeySearch);
		
		Assert.assertTrue(result);
	}
	
	/**
	 * TextBox - TC02
	 */
	@Test
	public void doTC02() {
		//Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);
		
		ElementsPage elementsPage = homePage.clickElements();
		WebTablesPage webTablesPage = elementsPage.clickWebTablesMenu();
		
		String inputFirstName = "Pham";
		String inputLastName = "Cong";
		String inputEmail = "abcd@gmail.com";
		String inputAge = "25";
		String inputSalary = "800";
		String inputDepartment = "Ha Noi";
		
		String inputKeySearch = "con";
		
		webTablesPage.testBasic.clickByLocator(webTablesPage.btnAddRecord);
		
		webTablesPage.testBasic.inputText(webTablesPage.txtFirstName, inputFirstName);
		webTablesPage.testBasic.inputText(webTablesPage.txtLastName, inputLastName);
		webTablesPage.testBasic.inputText(webTablesPage.txtEmail, inputEmail);
		webTablesPage.testBasic.inputText(webTablesPage.txtAge, inputAge);
		webTablesPage.testBasic.inputText(webTablesPage.txtSalary, inputSalary);
		webTablesPage.testBasic.inputText(webTablesPage.txtDepartment, inputDepartment);
		
		webTablesPage.testBasic.submitByLocator(webTablesPage.btnSubmit);
		
		webTablesPage.testBasic.clickByLocator(webTablesPage.btnSearch);
		
		boolean result = webTablesPage.isCheckSearchResult(webTablesPage.lbLastName, inputKeySearch);
		
		Assert.assertTrue(result);
		
		List<String> lsFirstName = webTablesPage.getFirstNameString();
		for (String actualFirstName : lsFirstName) {
			Assert.assertEquals(actualFirstName, inputFirstName); 
		}
		List<String> lsLastName = webTablesPage.getLastNameString();
		for (String actualLastName : lsLastName) {
			Assert.assertEquals(actualLastName, inputLastName);
		}
		List<String> lsAge = webTablesPage.getAgeString();
		for (String actualAge : lsAge) {
			Assert.assertEquals(actualAge, inputAge);
		}
		List<String> lsEmail = webTablesPage.getEmailString();
		for (String actualEmail : lsEmail) {
			Assert.assertEquals(actualEmail, inputEmail);
		}
		List<String> lsSalary = webTablesPage.getSalaryString();
		for (String actualSalary : lsSalary) {
			Assert.assertEquals(actualSalary, inputSalary);
		}
		List<String> lsDepartment = webTablesPage.getDepartmentString();
		for (String actualDepartment : lsDepartment) {
			Assert.assertEquals(actualDepartment, inputDepartment);
		}
	}

}
