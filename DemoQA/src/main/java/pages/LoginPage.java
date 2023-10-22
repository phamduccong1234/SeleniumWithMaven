package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{
	
	public By txtFirstName = By.id("firstname");
	public By txtLastName = By.id("lastname");
	public By txtUserName = By.id("userName");
	public By txtPassword = By.id("password");
	
	public By btnLogin = By.id("login");
	public By btnNewUser = By.id("newUser");
	public By btnRegister = By.id("register");
	public By btnBackToLogin = By.id("gotologin");
	
	public By iCaptcha = By.xpath("//iframe[@title='reCAPTCHA']']");
//	public By iCheckCaptcha = By.xpath("//span[@id='recaptcha-anchor']//descendant::div");
	public By iCheckCaptcha = By.xpath("//div[@class='recaptcha-checkbox-border']");

	public LoginPage(WebDriver dr) {
		super(dr);
	}
	
}
