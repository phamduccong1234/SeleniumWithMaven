package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidgetsPage extends Page{
	
	public By menuAccordian = By.xpath("//span[text()='Accordian']");
	
	public By menuAutoComplete = By.xpath("//span[text()='Auto Complete']");
	
	public By menuSlider = By.xpath("//span[text()='Slider']");
	
	public By menuProgressBar = By.xpath("//span[text()='Progress Bar']");
	
	public By menuTabs = By.xpath("//span[text()='Tabs']");
	
	public By menuTooltips = By.xpath("//span[text()='Tool Tips']");
	
	public AccordianPage clickAccordianMenu() {
		driver.findElement(menuAccordian).click();
		return new AccordianPage(driver);
	}
	
	public AutoCompletePage clickAutoCompleteMenu() {
		driver.findElement(menuAutoComplete).click();
		return new AutoCompletePage(driver);
	}
	
	public SliderPage clickSliderMenu() {
		driver.findElement(menuSlider).click();
		return new SliderPage(driver);
	}
	
	public ProgressBarPage clickProgressBarMenu() {
		driver.findElement(menuProgressBar).click();
		return new ProgressBarPage(driver);
	}
	
	public TabsPage clickTabsMenu() {
		driver.findElement(menuTabs).click();
		return new TabsPage(driver);
	}
	
	public TooltipsPage clickTooltipsMenu() {
		driver.findElement(menuTooltips).click();
		return new TooltipsPage(driver);
	}

	public WidgetsPage(WebDriver dr) {
		super(dr);
	}
	
	

}
