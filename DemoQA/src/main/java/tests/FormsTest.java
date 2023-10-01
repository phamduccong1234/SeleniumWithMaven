package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class FormsTest extends TestCase{
	/**
	 * TextBox - TC01
	 */
	@Test
	public void doTC01() {
		
		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		FormsPage formsPage = homePage.clickForms();
		PracticeFormPage practiceFormPage = formsPage.clickPracticeFormMenu();
		
		String inputFirstName = "Pham";
		String inputLastName = "Cong";
		String inputEmail = "abcd@gmail.com";
		String inputUserNumber = "0355373838";
		String inputSubject1 = "M";
		String inputSubject2 = "E";
		String inputCurrentAddress = "Ha Noi";
		
		practiceFormPage.inputFirstName(inputFirstName);
		practiceFormPage.inputLastName(inputLastName);
		practiceFormPage.inputUserMail(inputEmail);
		practiceFormPage.clickGender();
		practiceFormPage.inputUserNumber(inputUserNumber);
		practiceFormPage.inputDOB();
		practiceFormPage.selectYear();
		practiceFormPage.selectMonth();
		practiceFormPage.selectDay();
		practiceFormPage.inputSubject(inputSubject1);
		practiceFormPage.keyEnterSubject();
		practiceFormPage.inputSubject(inputSubject2);
		practiceFormPage.keyEnterSubject();
		practiceFormPage.clickHobbie();
		practiceFormPage.inputUploadPicture();
		practiceFormPage.inputCurrentAddress(inputCurrentAddress);
		
		JavascriptExecutor js = (JavascriptExecutor) testBasic.driver;
		js.executeScript("document.body.style.zoom = '60%';");
		
		practiceFormPage.selectState();
		practiceFormPage.keyDownState();
		practiceFormPage.keyEnterState();
		
		practiceFormPage.selectCity();
		practiceFormPage.keyDownCity();
		practiceFormPage.keyEnterCity();
		
		practiceFormPage.clickSubmitButton();
		
//		String actualFullName = practiceFormPage.getTextResult(practiceFormPage.lbName);
//		String actualEmail = practiceFormPage.getTextResult(practiceFormPage.lbEmail);
//		String actualCurrentAddress = practiceFormPage.getTextResult(practiceFormPage.lbCurrentAddress);
//		String actualPermanentAddress = practiceFormPage.getTextResult(practiceFormPage.lbPermanentAddress);
//		
//		// Assert - TestNG : Compare actual vs expect
//		Assert.assertEquals(actualFullName, inputFullName); 
//		Assert.assertEquals(actualEmail, inputEmail);
//		Assert.assertEquals(actualCurrentAddress, inputCurrentAddress);
//		Assert.assertEquals(actualPermanentAddress, inputPermanentAddress);

	}
}
