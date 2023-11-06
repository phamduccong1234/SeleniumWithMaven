package tests;

import java.time.Clock;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AlertFrameWindowPage;
import pages.AlertsPage;
import pages.HomePage;

public class AlertsTest extends TestCase {
	/**
	 * TextBox - TC01
	 */
	@Test(groups = {"AlertTest"})
	public void doTC01Alert() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		AlertsPage alertPage = alertFrameWindowPage.clickAlertMenu();

		alertPage.testBasic.clickByLocator(alertPage.btnAlert);

		Alert alert = testBasic.driver.switchTo().alert();

		String expectedAlertText = "You clicked a button";
		String actualAlertText = alert.getText();

		Assert.assertEquals(actualAlertText, expectedAlertText);

		alert.accept();
	}

	/**
	 * TextBox - TC02
	 */
	@Test(groups = {"AlertTest"})
	public void doTC02TimerAlert() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		AlertsPage alertPage = alertFrameWindowPage.clickAlertMenu();

		alertPage.testBasic.clickByLocator(alertPage.btntimerAlert);

		WebDriverWait wait = new WebDriverWait(testBasic.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = testBasic.driver.switchTo().alert();

		String expectedTimerAlertText = "This alert appeared after 5 seconds";
		String actualTimerAlertText = alert.getText();

		Assert.assertEquals(actualTimerAlertText, expectedTimerAlertText);

		alert.accept();
	}

	/**
	 * TextBox - TC03
	 */
	@Test(groups = {"AlertTest"})
	public void doTC03ConfirmOK() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		AlertsPage alertPage = alertFrameWindowPage.clickAlertMenu();

		// Confirm Ok Alert
		alertPage.testBasic.clickByLocator(alertPage.btnconfirmAlert);

		Alert alert = testBasic.driver.switchTo().alert();

		String expectedConfirmAlertText = "Do you confirm action?";
		String actualConfirmAlertText = alert.getText();

		Assert.assertEquals(actualConfirmAlertText, expectedConfirmAlertText);

		alert.accept();

		String expectedOkConfirmAlert = "You selected Ok";
		String actualOkConfirmAlert = alertPage.getConfirmAlertString();

		Assert.assertEquals(actualOkConfirmAlert, expectedOkConfirmAlert);
	}

	/**
	 * TextBox - TC04
	 */
	@Test(groups = {"AlertTest"})
	public void doTC04ConfirmCancel() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		AlertsPage alertPage = alertFrameWindowPage.clickAlertMenu();

		// Confirm Cancel Alert
		alertPage.testBasic.clickByLocator(alertPage.btnconfirmAlert);

		Alert alert = testBasic.driver.switchTo().alert();

		String expectedConfirmAlertText = "Do you confirm action?";
		String actualConfirmAlertText = alert.getText();

		Assert.assertEquals(actualConfirmAlertText, expectedConfirmAlertText);

		alert.dismiss();

		String expectedCancelConfirmAlert = "You selected Cancel";
		String actualCancelConfirmAlert = alertPage.getConfirmAlertString();

		Assert.assertEquals(actualCancelConfirmAlert, expectedCancelConfirmAlert);
	}
	
	/**
	 * TextBox - TC05
	 */
	@Test(groups = {"AlertTest"})
	public void doTC05PromptBox() {

		// Click vào phần tử
		HomePage homePage = new HomePage(testBasic.driver);

		AlertFrameWindowPage alertFrameWindowPage = homePage.clickAlertFrameWindow();
		AlertsPage alertPage = alertFrameWindowPage.clickAlertMenu();

		alertPage.testBasic.clickByLocator(alertPage.btnpromtAlert);

		Alert alert = testBasic.driver.switchTo().alert();

		String expectedPromptBoxText = "Please enter your name";
		String actualPromptBoxText = alert.getText();

		Assert.assertEquals(actualPromptBoxText, expectedPromptBoxText);
		
		String inputNamePrompt = "Cong";
		
		alert.sendKeys(inputNamePrompt);

		alert.accept();

		String expectedPromptResult = "You entered " + inputNamePrompt;
		String actualPromptResult = alertPage.getPromptResultString();

		Assert.assertEquals(actualPromptResult, expectedPromptResult);
	}
}
