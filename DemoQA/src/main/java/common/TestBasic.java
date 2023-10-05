package common;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Page;

public class TestBasic {
	
	public WebDriver driver;
	
	public void openWebsite(String url) {
		String localDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", localDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void closeBrowser() {
		driver.quit(); // close toàn bộ tab
	}
	
	public void closeCurentWindow() {
		driver.close();
	}
	
	public void inputText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public void clickRadioButtonByLabel(String radioLabel) {
		String xpathRadio = "//*[text()='" + radioLabel + "']";
		By rdElement = By.xpath(xpathRadio);
		driver.findElement(rdElement).click();
	}
	
	public void keysEnter(By locator) {
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}
	
	public void clickCheckboxByLabel(String checkboxLabel) {
		String xpathCheckbox = "//*[text()='" + checkboxLabel + "']";
		By cbElement = By.xpath(xpathCheckbox);
		driver.findElement(cbElement).click();
	}
}
