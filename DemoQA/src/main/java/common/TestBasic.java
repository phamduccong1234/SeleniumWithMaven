package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
}
