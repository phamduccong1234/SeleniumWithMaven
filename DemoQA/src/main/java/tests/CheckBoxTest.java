package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.HomePage;

public class CheckBoxTest extends TestCase {
	/**
	 * TextBox - TC01
	 */
	@Test
	public void doTC01() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		ElementsPage elementsPage = homePage.clickElements();
		CheckBoxPage checkBoxPage = elementsPage.clickCheckBoxMenu();

		Assert.assertTrue(checkBoxPage.isCheckBoxUnchecked(checkBoxPage.cbHome));
		
		checkBoxPage.testBasic.clickByLocator(checkBoxPage.cbHome);

		String expedtedHomeString = "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
		String actualHomeString = checkBoxPage.getHomeString();

		Assert.assertEquals(actualHomeString, expedtedHomeString);
		
		checkBoxPage.testBasic.clickByLocator(checkBoxPage.icExpandAll);
		
		Assert.assertTrue(checkBoxPage.isDesktopUnchecked(checkBoxPage.cbDesktop));
		Assert.assertTrue(checkBoxPage.isDocumentsUnchecked(checkBoxPage.cbDocuments));
		Assert.assertTrue(checkBoxPage.isDownloadsUnchecked(checkBoxPage.cbDownloads));

	}
}
