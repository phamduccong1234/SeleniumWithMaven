package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertFrameWindowPage;
import pages.FramesPage;
import pages.HomePage;

public class FramesTest extends TestCase{
	/**
	 * TextBox - TC01
	 */
	@Test
	public void doTC01Alert() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		FramesPage framePage = alertFrameWindowPage.clickFramesMenu();

		framePage.testBasic.driver.switchTo().frame("frame1");
		
		String actualFrameText = framePage.getIframeString();
		String expectedFrameText = "This is a sample page";
		
		Assert.assertEquals(actualFrameText, expectedFrameText);

		testBasic.driver.switchTo().defaultContent();
	}

}
