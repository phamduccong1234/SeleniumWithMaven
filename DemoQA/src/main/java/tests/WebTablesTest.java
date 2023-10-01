package tests;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;

public class WebTablesTest extends TestCase{
	
	/**
	 * TextBox - TC01
	 */
	@Test
	public void doTC01() {
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
		
		webTablesPage.clickAddButton();
		
		webTablesPage.inputFirstName(inputFirstName);
		webTablesPage.inputLastName(inputLastName);
		webTablesPage.inputEmail(inputEmail);
		webTablesPage.inputAge(inputAge);
		webTablesPage.inputSalary(inputSalary);
		webTablesPage.inputDepartment(inputDepartment);
		
//		String actualFirstName = textBoxPage.getTextResult(textBoxPage.lbName);
//		String actualLastName = textBoxPage.getTextResult(textBoxPage.lbEmail);
//		String actualCurrentAddress = textBoxPage.getTextResult(textBoxPage.lbCurrentAddress);
//		String actualPermanentAddress = textBoxPage.getTextResult(textBoxPage.lbPermanentAddress);
//		String actualFirstName = textBoxPage.getTextResult(textBoxPage.lbName);
//		String actualFirstName = textBoxPage.getTextResult(textBoxPage.lbName);
		
		// Assert - TestNG : Compare actual vs expect
//		Assert.assertEquals(actualFullName, inputFullName); 
//		Assert.assertEquals(actualEmail, inputEmail);
//		Assert.assertEquals(actualCurrentAddress, inputCurrentAddress);
//		Assert.assertEquals(actualPermanentAddress, inputPermanentAddress);
		
//		String inputKeyWord = "Cierra";
//		
//		webTablesPage.inputSearchBox(inputKeyWord);
//		
//		webTablesPage.clickSearchButton();
		
		
	}

}
