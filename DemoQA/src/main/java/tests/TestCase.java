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
	}
	
	@AfterTest
	public void closeBrowser() {
		testBasic.closeBrowser();
	}
}
