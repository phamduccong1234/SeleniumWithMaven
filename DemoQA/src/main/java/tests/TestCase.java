package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import common.TestBasic;

public class TestCase {
	// Inheritance - Has A
	public TestBasic testBasic = new TestBasic();
	@BeforeTest
	public void openWebsite() {
		testBasic.openWebsite("https://demoqa.com/");
//		JavascriptExecutor js = (JavascriptExecutor) testBasic.driver;
//		js.executeScript("document.body.style.zoom = '80%';");
	}
	
//	@AfterTest
	public void closeBrowser() {
		testBasic.closeBrowser();
	}
}
