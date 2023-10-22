package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertFrameWindowPage;
import pages.HomePage;
import pages.ModalDialogsPage;

public class ModalDialogsTest extends TestCase{
	
	/**
	 * TextBox - TC01
	 */
	@Test
	public void doTC01ModalDialogs() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		testBasic.scrollToElement(alertFrameWindowPage.menuModalDialogs);
		ModalDialogsPage modalDialogsPage = alertFrameWindowPage.clickModalDialogsMenu();
		
		// Small Modal Dialog
		modalDialogsPage.testBasic.clickByLocator(modalDialogsPage.btnShowSmModal);
        
        String actualSmModal = modalDialogsPage.testBasic.getTextByLocator(modalDialogsPage.txtBodyModal);
        String expectedSmModal = "This is a small modal. It has very less content";
        
        Assert.assertEquals(actualSmModal, expectedSmModal);
        
        modalDialogsPage.testBasic.clickByLocator(modalDialogsPage.btnCloseSmModal);
        
        // Large Modal Dialog
        modalDialogsPage.testBasic.clickByLocator(modalDialogsPage.btnShowBgModal);
        
        String actualBgModal = modalDialogsPage.testBasic.getTextByLocator(modalDialogsPage.txtBodyModal);
        String expectedBgModal = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        Assert.assertEquals(actualBgModal, expectedBgModal);
        
        modalDialogsPage.testBasic.clickByLocator(modalDialogsPage.btnCloseBgModal);
	}

}
