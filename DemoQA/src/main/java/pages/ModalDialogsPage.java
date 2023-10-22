package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDialogsPage extends Page{
	
	public By btnShowSmModal = By.id("showSmallModal");
	public By btnShowBgModal = By.id("showLargeModal");
	public By btnCloseSmModal = By.id("closeSmallModal");
	public By btnCloseBgModal = By.id("closeLargeModal");
	
	public By txtBodyModal = By.xpath("//div[@class='modal-body']");

	public ModalDialogsPage(WebDriver dr) {
		super(dr);
	}
}
