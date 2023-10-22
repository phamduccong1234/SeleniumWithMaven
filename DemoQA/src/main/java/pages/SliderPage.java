package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SliderPage extends Page{
	
	public By rangeSlider = By.xpath("//input[@type='range']");
	
	public By txtValueSlider = By.id("sliderValue");

	public SliderPage(WebDriver dr) {
		super(dr);
	}
}
