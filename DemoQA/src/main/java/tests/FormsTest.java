package tests;

import java.time.Duration;

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
		String inputState = "NCR";
		String inputCity = "Delhi";
		
		practiceFormPage.testBasic.inputText(practiceFormPage.txtFirstName, inputFirstName);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtLastName, inputLastName);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtUserMail, inputEmail);
		practiceFormPage.testBasic.clickRadioButtonByLabel("Male");
		practiceFormPage.testBasic.inputText(practiceFormPage.txtUserNumber, inputUserNumber);
		practiceFormPage.inputDOB();
		practiceFormPage.selectYear("1998");
		practiceFormPage.selectMonth("December");
		practiceFormPage.selectDay("9");
		practiceFormPage.testBasic.inputText(practiceFormPage.txtSubject, inputSubject1);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.txtSubject);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtSubject, inputSubject2);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.txtSubject);
		practiceFormPage.testBasic.clickCheckboxByLabel("Sports");
		practiceFormPage.testBasic.clickCheckboxByLabel("Reading");
		practiceFormPage.inputUploadPicture();
		practiceFormPage.testBasic.inputText(practiceFormPage.txtCurrentAddress, inputCurrentAddress);
		
		JavascriptExecutor js = (JavascriptExecutor) testBasic.driver;
		js.executeScript("document.body.style.zoom = '70%';");
		
		practiceFormPage.testBasic.inputText(practiceFormPage.mnState, inputState);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.mnState);
		
		testBasic.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		practiceFormPage.testBasic.inputText(practiceFormPage.mnCity, inputCity);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.mnCity);
		
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
