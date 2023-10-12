package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasic {
	
	public WebDriver driver;
	
	
	// Website Event
	public void openWebsite(String url) {
		String localDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", localDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void zoomOut() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom = '80%';");
	}
	
	public void scrollToElement(By locator) {
		WebElement element = driver.findElement(locator);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void closeBrowser() {
		driver.quit(); // close toàn bộ tab
	}
	
	public void closeCurentWindow() {
		driver.close();
	}
	
	
	// Input Event
	public void inputText(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	
	// Click, Submit Event
	public void clickByLocator(By locator) {
		driver.findElement(locator).click();
	}
	
	public void keysEnter(By locator) {
		driver.findElement(locator).sendKeys(Keys.ENTER);
	}
	
	public void submitByLocator(By locator) {
		driver.findElement(locator).submit();
	}
	
	
	//Get Text
	public String getTextByLocator(By locator) {
		String text = driver.findElement(locator).getText();
		return text;
	}
}
