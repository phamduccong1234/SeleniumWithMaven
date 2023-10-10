package tests;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import pages.PracticeFormResult;

public class FormsTest extends TestCase {
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
		String inputGender = "Male";
		String inputDay = "9";
		String inputMonth = "December";
		String inputYear = "1998";
		String inputUserNumber = "0355373838";
		String inputSubject1 = "Maths";
		String inputSubject2 = "English";
		String inputCurrentAddress = "Ha Noi";
		String inputCheckbox1 = "Sports";
		String inputCheckbox2 = "Reading";
		String inputState = "NCR";
		String inputCity = "Delhi";
		
		practiceFormPage.testBasic.inputText(practiceFormPage.txtFirstName, inputFirstName);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtLastName, inputLastName);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtUserMail, inputEmail);
		practiceFormPage.clickRadioButtonByLabel(inputGender);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtUserNumber, inputUserNumber);
		practiceFormPage.selectDateOfBirth(inputYear, inputMonth, inputDay);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtSubject, inputSubject1);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.txtSubject);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtSubject, inputSubject2);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.txtSubject);
		practiceFormPage.clickCheckboxByLabel(inputCheckbox1);
		practiceFormPage.clickCheckboxByLabel(inputCheckbox2);
		practiceFormPage.inputUploadPicture();
		practiceFormPage.testBasic.inputText(practiceFormPage.txtCurrentAddress, inputCurrentAddress);
		
		practiceFormPage.testBasic.zoomOut();
		
		practiceFormPage.testBasic.inputText(practiceFormPage.mnState, inputState);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.mnState);
		
		testBasic.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		practiceFormPage.testBasic.inputText(practiceFormPage.mnCity, inputCity);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.mnCity);
		
		practiceFormPage.testBasic.submit(practiceFormPage.btnSubmit);

		PracticeFormResult practiceFormResult = new PracticeFormResult(testBasic.driver);
		
		String actualValueStudentName = practiceFormResult.getValueByLabel("Student Name");
		String actualValueStudentEmail = practiceFormResult.getValueByLabel("Student Email");
		String actualValueGender = practiceFormResult.getValueByLabel("Gender");
		String actualValueMobile = practiceFormResult.getValueByLabel("Mobile");
		String actualValueDateOfBirth = practiceFormResult.getValueByLabel("Date of Birth");
		String actualValueSubjects = practiceFormResult.getValueByLabel("Subjects");
		String actualValueHobbies = practiceFormResult.getValueByLabel("Hobbies");
		String actualValuePicture = practiceFormResult.getValueByLabel("Picture");
		String actualValueAddress = practiceFormResult.getValueByLabel("Address");
		String actualValueStateAndCity = practiceFormResult.getValueByLabel("State and City");
		
		String expectedStudentName = inputFirstName + " " + inputLastName;
		String expectedStudentEmail = inputEmail;
		String expectedGender = inputGender;
		String expectedMobile = inputUserNumber;
		String expectedDateOfBirth = "0" + inputDay + " " + inputMonth + "," + inputYear;
		String expectedSubjects = inputSubject1 + ", " + inputSubject2;
		String expectedHobbies = inputCheckbox1 + ", " + inputCheckbox2;
		String expectedPicture = "Cong.jpg";
		String expectedAddress = inputCurrentAddress;
		String expectedStateAndCity = inputState + " " + inputCity;
		
//		Assert - TestNG : Compare actual vs expect
		Assert.assertEquals(actualValueStudentName, expectedStudentName);
		Assert.assertEquals(actualValueStudentEmail, expectedStudentEmail);
		Assert.assertEquals(actualValueGender, expectedGender);
		Assert.assertEquals(actualValueMobile, expectedMobile);
		Assert.assertEquals(actualValueDateOfBirth, expectedDateOfBirth);
		Assert.assertEquals(actualValueSubjects, expectedSubjects);
		Assert.assertEquals(actualValueHobbies, expectedHobbies);
		Assert.assertEquals(actualValuePicture, expectedPicture);
		Assert.assertEquals(actualValueAddress, expectedAddress);
		Assert.assertEquals(actualValueStateAndCity, expectedStateAndCity);
	}
}
