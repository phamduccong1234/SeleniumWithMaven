package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.RadioButtonPage;

public class RadioButtonTest extends TestCase {
	/**
	 * TextBox - TC01
	 */
	@Test
	public void doTC01() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		ElementsPage elementsPage = homePage.clickElements();
		RadioButtonPage radioButtonPage = elementsPage.clickRadioButtonMenu();

		radioButtonPage.clickYesRadioButton();

		Assert.assertTrue(radioButtonPage.isYesRadioSelected(radioButtonPage.rdYes));
		Assert.assertFalse(radioButtonPage.isImpressiveRadioSelected(radioButtonPage.rdImpressive));

		String expedtedYesRadioString = "Yes";
		String actualYesRadioString = radioButtonPage.getYesRadioString();

		Assert.assertEquals(actualYesRadioString, expedtedYesRadioString);
		
		radioButtonPage.clickImpressiveRadioButton();

		Assert.assertTrue(radioButtonPage.isImpressiveRadioSelected(radioButtonPage.rdImpressive));
		Assert.assertFalse(radioButtonPage.isYesRadioSelected(radioButtonPage.rdYes));

		String expedtedImpressiveRadioString = "Impressive";
		String actualImpressiveRadioString = radioButtonPage.getImpressiveRadioString();

		Assert.assertEquals(actualImpressiveRadioString, expedtedImpressiveRadioString);
	}
}
