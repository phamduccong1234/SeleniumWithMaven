package tests;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertFrameWindowPage;
import pages.BrowserWindowPage;
import pages.HomePage;

public class BrowserWindowTest extends TestCase {
	/**
	 * TextBox - TC01
	 */
	@Test
	public void doTC01() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		BrowserWindowPage browserWindowPage = alertFrameWindowPage.clickBrowserWindowMenu();

		String browserWindow = testBasic.driver.getWindowHandle();

		browserWindowPage.testBasic.clickByLocator(browserWindowPage.btnTab);

		Set<String> windows = testBasic.driver.getWindowHandles();

		String expectedHeadingTabWindow = "This is a sample page";

		for (String handle : windows) {
			if (!handle.equals(browserWindow)) {
				testBasic.driver.switchTo().window(handle);
				String actualHeadingTab = testBasic.getTextByLocator(browserWindowPage.txtHeadingTab);
				Assert.assertEquals(actualHeadingTab, expectedHeadingTabWindow);
				testBasic.closeCurentWindow();
			}
		}
		testBasic.driver.switchTo().window(browserWindow);
	}
	
	/**
	 * TextBox - TC02
	 */
	@Test
	public void doTC02() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		BrowserWindowPage browserWindowPage = alertFrameWindowPage.clickBrowserWindowMenu();

		String browserWindow = testBasic.driver.getWindowHandle();

		browserWindowPage.testBasic.clickByLocator(browserWindowPage.btnWindow);

		Set<String> windows = testBasic.driver.getWindowHandles();

		String expectedHeadingNewWindow = "This is a sample page";

		for (String handle : windows) {
			if (!handle.equals(browserWindow)) {
				testBasic.driver.switchTo().window(handle);
				String actualHeadingNewWindow = testBasic.getTextByLocator(browserWindowPage.txtHeadingTab);
				Assert.assertEquals(actualHeadingNewWindow, expectedHeadingNewWindow);
				testBasic.closeCurentWindow();
			}
		}
		testBasic.driver.switchTo().window(browserWindow);
	}
	
	/**
	 * TextBox - TC03
	 */
//	@Test
	public void doTC03() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		BrowserWindowPage browserWindowPage = alertFrameWindowPage.clickBrowserWindowMenu();

		String browserWindow = testBasic.driver.getWindowHandle();

		browserWindowPage.testBasic.clickByLocator(browserWindowPage.btnWindow);

		Set<String> windows = testBasic.driver.getWindowHandles();

		String expectedHeadingNewWindow = "This is a sample page";

		for (String handle : windows) {
			if (!handle.equals(browserWindow)) {
				testBasic.driver.switchTo().window(handle);
				String actualHeadingNewWindow = testBasic.getTextByLocator(browserWindowPage.txtHeadingTab);
				Assert.assertEquals(actualHeadingNewWindow, expectedHeadingNewWindow);
				testBasic.closeCurentWindow();
			}
		}
		testBasic.driver.switchTo().window(browserWindow);
	}

}
