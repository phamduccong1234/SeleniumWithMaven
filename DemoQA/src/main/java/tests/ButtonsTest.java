package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ButtonsPage;
import pages.ElementsPage;
import pages.HomePage;

public class ButtonsTest extends TestCase{
	/**
	 * TextBox - TC01
	 */
	@Test
	public void doTC01() {
		
		//Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);
		
		ElementsPage elementsPage = homePage.clickElements();
		ButtonsPage buttonsPage = elementsPage.clickButtonsMenu();
		
		buttonsPage.testBasic.clickByLocator(buttonsPage.btnClick);
		buttonsPage.testBasic.rightClickByLocator(buttonsPage.btnRightClick);
		buttonsPage.testBasic.doubleClickByLocator(buttonsPage.btnDoubleClick);
		
		String actualClickString = buttonsPage.getClickString();
		String actualRightClickString = buttonsPage.getRightClickString();
		String actualDoubleClickString = buttonsPage.getDoubleClickString();
		
		String expectedClickString = "You have done a dynamic click";
		String expectedRightClickString = "You have done a right click";
		String expectedDoubleClickString = "You have done a double click";
		
		// Assert - TestNG : Compare actual vs expect
		Assert.assertEquals(actualClickString, expectedClickString); 
		Assert.assertEquals(actualRightClickString, expectedRightClickString);
		Assert.assertEquals(actualDoubleClickString, expectedDoubleClickString);
	}

}
