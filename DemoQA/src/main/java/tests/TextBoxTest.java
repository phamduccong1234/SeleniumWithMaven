package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.TextBoxPage;

public class TextBoxTest extends TestCase{
	/**
	 * TextBox - TC01
	 */
//	@Test
	public void doTC01() {
		
		//Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);
		
		ElementsPage elementsPage = homePage.clickElements();
		TextBoxPage textBoxPage = elementsPage.clickTextBoxMenu();
		
		String inputFullName = "Cong";
		String inputEmail = "abcd@gmail.com";
		String inputCurrentAddress = "Ha Noi";
		String inputPermanentAddress = "Ha Noi";
		
		textBoxPage.testBasic.inputText(textBoxPage.txtFullName, inputFullName);
		textBoxPage.testBasic.inputText(textBoxPage.txtEmail, inputEmail);
		textBoxPage.testBasic.inputText(textBoxPage.txtCurrentAddress, inputCurrentAddress);
		textBoxPage.testBasic.inputText(textBoxPage.txtPermanentAddress, inputPermanentAddress);
		
		textBoxPage.testBasic.clickByLocator(textBoxPage.btnSubmit);
		
		String actualFullName = textBoxPage.getTextResult(textBoxPage.lbName);
		String actualEmail = textBoxPage.getTextResult(textBoxPage.lbEmail);
		String actualCurrentAddress = textBoxPage.getTextResult(textBoxPage.lbCurrentAddress);
		String actualPermanentAddress = textBoxPage.getTextResult(textBoxPage.lbPermanentAddress);
		
		// Assert - TestNG : Compare actual vs expect
		Assert.assertEquals(actualFullName, inputFullName); 
		Assert.assertEquals(actualEmail, inputEmail);
		Assert.assertEquals(actualCurrentAddress, inputCurrentAddress);
		Assert.assertEquals(actualPermanentAddress, inputPermanentAddress);
	}
	
	@Test
	public void doTC02() {
		
		//Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);
		
		ElementsPage elementsPage = homePage.clickElements();
		TextBoxPage textBoxPage = elementsPage.clickTextBoxMenu();
		
		String inputFullName = "Cong";
		String inputEmail = "abcdgmail.com";
		String inputCurrentAddress = "Ha Noi";
		String inputPermanentAddress = "Ha Noi";
		
		textBoxPage.testBasic.inputText(textBoxPage.txtFullName, inputFullName);
		textBoxPage.testBasic.inputText(textBoxPage.txtEmail, inputEmail);
		textBoxPage.testBasic.inputText(textBoxPage.txtCurrentAddress, inputCurrentAddress);
		textBoxPage.testBasic.inputText(textBoxPage.txtPermanentAddress, inputPermanentAddress);
		
		textBoxPage.testBasic.clickByLocator(textBoxPage.btnSubmit);
		
		Assert.assertTrue(textBoxPage.isRedBorder(textBoxPage.txtEmail));
		
	}
	
	
}
