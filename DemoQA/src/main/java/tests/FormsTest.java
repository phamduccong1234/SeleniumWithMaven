package tests;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import pages.PracticeFormResult;
import tests.model.FormData;

public class FormsTest extends TestCase {
	/**
	 * TextBox - TC01
	 */
	@Test(description = "TC01 - Submit data successfully", dataProvider = "FormData")
	public void submitDataSuccessfully(String inputFirstName, String inputLastName, String inputEmail,
			String inputGender, String inputDay, String inputMonth, String inputYear, String inputUserNumber,
			String inputSubject1, String inputSubject2, String inputCurrentAddress, String inputCheckbox1,
			String inputCheckbox2, String inputState, String inputCity) {
		HomePage homePage = new HomePage(testBasic.driver);

		FormsPage formsPage = homePage.clickForms();
		PracticeFormPage practiceFormPage = formsPage.clickPracticeFormMenu();

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

		practiceFormPage.testBasic.submitByLocator(practiceFormPage.btnSubmit);

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

	@DataProvider(name = "FormData")
	public String[][] formData() {
		FormData formData = new FormData();
		
//		FormData formData = new FormData("Pham", "Cong", "abcd@gmail.com", "Male", "9", "December", "1998",
//				"0355373838", "Maths", "English", "Ha Noi", "Sports", "Reading", "NCR", "Delhi");
		
		formData.inputFirstName = "Pham";
		formData.inputLastName = "Cong";
		formData.inputEmail = "abcd@gmail.com";
		formData.inputGender = "Male";
		formData.inputDay = "9";
		formData.inputMonth = "December";
		formData.inputYear = "1998";
		formData.inputUserNumber = "0355373838";
		formData.inputSubject1 = "Maths";
		formData.inputSubject2 = "English";
		formData.inputCurrentAddress = "Ha Noi";
		formData.inputCheckbox1 = "Sports";
		formData.inputCheckbox2 = "Reading";
		formData.inputState = "NCR";
		formData.inputCity = "Delhi";

		String[][] listInput = new String[1][15];
		listInput[0][0] = formData.inputFirstName;
		listInput[0][1] = formData.inputLastName;
		listInput[0][2] = formData.inputEmail;
		listInput[0][3] = formData.inputGender;
		listInput[0][4] = formData.inputDay;
		listInput[0][5] = formData.inputMonth;
		listInput[0][6] = formData.inputYear;
		listInput[0][7] = formData.inputUserNumber;
		listInput[0][8] = formData.inputSubject1;
		listInput[0][9] = formData.inputSubject2;
		listInput[0][10] = formData.inputCurrentAddress;
		listInput[0][11] = formData.inputCheckbox1;
		listInput[0][12] = formData.inputCheckbox2;
		listInput[0][13] = formData.inputState;
		listInput[0][14] = formData.inputCity;

		return listInput;

	}

}
