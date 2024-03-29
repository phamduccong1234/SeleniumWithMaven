package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {

	By menuElementsXpath = By.xpath("//h5[text()='Elements']");

	By menuFormsXpath = By.xpath("//h5[text()='Forms']");
	
	By menuAlertFrameWindowXpath = By.xpath("//h5[text()='Alerts, Frame & Windows']");
	
	By menuWidgetsXpath = By.xpath("//h5[text()='Widgets']");
	
	By menuBookStoreApplicationXpath = By.xpath("//h5[text()='Book Store Application']");

	public ElementsPage clickElements() {
		// scroll down to end page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// click vao Element item
		driver.findElement(menuElementsXpath).click();

		return new ElementsPage(driver);
	}

	public FormsPage clickForms() {
		// scroll down to end page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// click vao Forms item
		driver.findElement(menuFormsXpath).click();

		return new FormsPage(driver);
	}

	public AlertFrameWindowPage clickAlertFrameWindow() {
		// scroll down to end page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// click vao Alert, Frame and Window item
		driver.findElement(menuAlertFrameWindowXpath).click();

		return new AlertFrameWindowPage(driver);
	}
	
	public WidgetsPage clickWidgets() {
		// scroll down to end page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// click vao Alert, Frame and Window item
		driver.findElement(menuWidgetsXpath).click();

		return new WidgetsPage(driver);
	}
	
	public BookStoreApplicationPage clickBookStoreApplication() {
		// scroll down to end page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// click vao Alert, Frame and Window item
		driver.findElement(menuBookStoreApplicationXpath).click();

		return new BookStoreApplicationPage(driver);
	}

	// Dùng hàm khởi tạo (constructor) để truyền Driver
	public HomePage(WebDriver dr) {
		super(dr);
	}

}
