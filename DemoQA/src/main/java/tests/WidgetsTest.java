package tests;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AccordianPage;
import pages.AutoCompletePage;
import pages.HomePage;
import pages.ProgressBarPage;
import pages.SliderPage;
import pages.TabsPage;
import pages.TooltipsPage;
import pages.WidgetsPage;

public class WidgetsTest extends TestCase {
	/**
	 * TextBox - TC01
	 */
//	@Test
	public void doTC01Accordian() {
		HomePage homePage = new HomePage(testBasic.driver);

		WidgetsPage widgetsPage = homePage.clickWidgets();
		testBasic.scrollToElement(widgetsPage.menuAccordian);
		AccordianPage accordianPage = widgetsPage.clickAccordianMenu();

		// Check & Compare Section 1
		String expectedHeaderSection1 = "What is Lorem Ipsum?";
		String actualHeaderSection1 = accordianPage.getHeaderText(accordianPage.lbSection1);

		Assert.assertEquals(actualHeaderSection1, expectedHeaderSection1);

		boolean checkSection1 = accordianPage.isSectionExpand(accordianPage.lbSection1Show);

		Assert.assertTrue(checkSection1);

		String expectedSection1 = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		String actualSection1 = accordianPage.getContentText(accordianPage.txtSection1);

		Assert.assertEquals(actualSection1, expectedSection1);

		// Check & Compare Section 2
		String expectedHeaderSection2 = "Where does it come from?";
		String actualHeaderSection2 = accordianPage.getHeaderText(accordianPage.lbSection2);

		Assert.assertEquals(actualHeaderSection2, expectedHeaderSection2);

		accordianPage.testBasic.clickByLocator(accordianPage.lbSection2);

		boolean checkSection2 = accordianPage.isSectionExpand(accordianPage.lbSection2Show);

		Assert.assertTrue(checkSection2);

		String expectedSection2 = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.";
		String actuaSection2 = accordianPage.getContentText(accordianPage.txtSection2);

		Assert.assertEquals(actuaSection2, expectedSection2);

		// Check & Compare Section 3
		String expectedHeaderSection3 = "Why do we use it?";
		String actualHeaderSection3 = accordianPage.getHeaderText(accordianPage.lbSection3);

		Assert.assertEquals(actualHeaderSection3, expectedHeaderSection3);

		accordianPage.testBasic.clickByLocator(accordianPage.lbSection3);

		boolean checkSection3 = accordianPage.isSectionExpand(accordianPage.lbSection3Show);

		Assert.assertTrue(checkSection3);

		String expectedSection3 = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
		String actualSection3 = accordianPage.getContentText(accordianPage.txtSection3);

		Assert.assertEquals(actualSection3, expectedSection3);
	}

	/**
	 * TextBox - TC02
	 */
//	@Test
	public void doTC02AutoComplete() {
		HomePage homePage = new HomePage(testBasic.driver);

		WidgetsPage widgetsPage = homePage.clickWidgets();
		testBasic.scrollToElement(widgetsPage.menuAutoComplete);
		AutoCompletePage autoCompletePage = widgetsPage.clickAutoCompleteMenu();

		String inputColor1 = "Red";
		String inputColor2 = "Yellow";
		String inputColor3 = "Black";

		// Check & Compare Multiple Color
		autoCompletePage.testBasic.inputText(autoCompletePage.txtMultipleColor, inputColor1);
		autoCompletePage.testBasic.keysEnter(autoCompletePage.txtMultipleColor);
		autoCompletePage.testBasic.inputText(autoCompletePage.txtMultipleColor, inputColor2);
		autoCompletePage.testBasic.keysEnter(autoCompletePage.txtMultipleColor);

		String actualMultipleColor1 = autoCompletePage.getValueColor(inputColor1);
		String expectedMultipleColor1 = autoCompletePage.getValueColor(inputColor1);

		String actualMultipleColor2 = autoCompletePage.getValueColor(inputColor2);
		String expectedMultipleColor2 = autoCompletePage.getValueColor(inputColor2);

		Assert.assertEquals(actualMultipleColor1, expectedMultipleColor1);
		Assert.assertEquals(actualMultipleColor2, expectedMultipleColor2);

		// Check & Compare Single Color
		autoCompletePage.testBasic.inputText(autoCompletePage.txtSingleColor, inputColor3);
		autoCompletePage.testBasic.keysEnter(autoCompletePage.txtSingleColor);

		String actualSingleColor = autoCompletePage.getValueColor(inputColor3);
		String expectedSingleColor = autoCompletePage.getValueColor(inputColor3);

		Assert.assertEquals(actualSingleColor, expectedSingleColor);
	}

	/**
	 * TextBox - TC04
	 */
//	@Test
	public void doTC04Slider() {
		HomePage homePage = new HomePage(testBasic.driver);

		WidgetsPage widgetsPage = homePage.clickWidgets();
		testBasic.scrollToElement(widgetsPage.menuSlider);
		SliderPage sliderPage = widgetsPage.clickSliderMenu();

		Actions action = new Actions(testBasic.driver);

		action.dragAndDropBy(testBasic.driver.findElement(sliderPage.rangeSlider), 300, 0).build().perform();
	}

	/**
	 * TextBox - TC05
	 */
//	@Test
	public void doTC05ProgressBar() {
		HomePage homePage = new HomePage(testBasic.driver);

		WidgetsPage widgetsPage = homePage.clickWidgets();
		testBasic.scrollToElement(widgetsPage.menuSlider);
		ProgressBarPage progressBarPage = widgetsPage.clickProgressBarMenu();

		progressBarPage.testBasic.clickByLocator(progressBarPage.btnStart);

		WebDriverWait wait = new WebDriverWait(testBasic.driver, Duration.ofSeconds(15));
		WebElement progressBar = testBasic.driver.findElement(progressBarPage.txtProgressBar);
		wait.until(ExpectedConditions.attributeToBe(progressBar, "aria-valuenow", "100"));

		String expectedProgress = "100%";
		String actualProgress = progressBar.getText();

		Assert.assertEquals(actualProgress, expectedProgress);
	}

	/**
	 * TextBox - TC06
	 */
//	@Test
	public void doTC06Tabs() {
		HomePage homePage = new HomePage(testBasic.driver);

		WidgetsPage widgetsPage = homePage.clickWidgets();
		testBasic.scrollToElement(widgetsPage.menuTabs);
		TabsPage tabsPage = widgetsPage.clickTabsMenu();

		tabsPage.testBasic.clickByLocator(tabsPage.tabWhat);
		tabsPage.isTabActive(tabsPage.tabWhat);

		String actualWhat = tabsPage.getPanelString(tabsPage.txtWhat);
		String expectedWhat = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

		Assert.assertEquals(actualWhat, expectedWhat);

		tabsPage.testBasic.clickByLocator(tabsPage.tabOrigin);
		tabsPage.isTabActive(tabsPage.tabOrigin);

		String actualOrigin = tabsPage.getPanelString(tabsPage.txtOrigin);
		String expectedOrigin = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32. The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.";

		Assert.assertEquals(actualOrigin, expectedOrigin);

		tabsPage.testBasic.clickByLocator(tabsPage.tabUse);
		tabsPage.isTabActive(tabsPage.tabUse);

		String actualUse = tabsPage.getPanelString(tabsPage.txtUse);
		String expectedUse = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";

		Assert.assertEquals(actualUse, expectedUse);
	}

	/**
	 * TextBox - TC07
	 */
//	@Test
	public void doTC07Tooltips() {
		HomePage homePage = new HomePage(testBasic.driver);

		WidgetsPage widgetsPage = homePage.clickWidgets();
		testBasic.scrollToElement(widgetsPage.menuTooltips);
		TooltipsPage tooltipsPage = widgetsPage.clickTooltipsMenu();
		Actions actions = new Actions(testBasic.driver);

		actions.moveToElement(testBasic.driver.findElement(tooltipsPage.btnToolTip)).perform();
		actions.pause(5000).perform();

		WebDriverWait wait = new WebDriverWait(testBasic.driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(tooltipsPage.hvToolTip));

		String actualTooltip = testBasic.getTextByLocator(tooltipsPage.hvToolTip);
		String expectedTooltip = "You hovered over the Button";

		Assert.assertEquals(actualTooltip, expectedTooltip);
	}
}
