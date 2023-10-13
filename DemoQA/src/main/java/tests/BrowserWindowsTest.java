package tests;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertFrameWindowPage;
import pages.BrowserWindowsPage;
import pages.HomePage;

public class BrowserWindowsTest extends TestCase {
	/**
	 * TextBox - TC01
	 */
//	@Test
	public void doTC01() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		BrowserWindowsPage browserWindowPage = alertFrameWindowPage.clickBrowserWindowMenu();
		
		browserWindowPage.clickNewTabPage();
	}
	
	/**
	 * TextBox - TC02
	 */
//	@Test
	public void doTC02() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		BrowserWindowsPage browserWindowPage = alertFrameWindowPage.clickBrowserWindowMenu();
		
		browserWindowPage.clickNewWindowPage();

	}
	
	/**
	 * TextBox - TC03
	 */
	@Test
	public void doTC03() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		BrowserWindowsPage browserWindowPage = alertFrameWindowPage.clickBrowserWindowMenu();

		browserWindowPage.clickNewWindowMessagePage();
	}

}
