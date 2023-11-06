package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import common.TestBasic;

public class TestCase {
	// Inheritance - Has A
	public TestBasic testBasic = new TestBasic();
//	@BeforeMethod
//	public void openWebsite() {
//		testBasic.openWebsite("https://demoqa.com/");
//	}
//	
//	@AfterMethod
//	public void closeBrowser() {
//		testBasic.closeBrowser();
//	}
	
	@BeforeMethod(alwaysRun = true)
	public void openWebsite() {
		testBasic.openWebsite("https://demoqa.com/");
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		testBasic.closeBrowser();
	}
}
