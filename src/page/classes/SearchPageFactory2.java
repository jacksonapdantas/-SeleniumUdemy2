package page.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author jacks
 *
 */
public class SearchPageFactory2 {
	WebDriver driver;
	
	@FindBy(id="")
	WebElement headerHistory;
	
	@FindBy(xpath ="//span[contains(text(),'Voos')]")
	WebElement flightTab;
	
	@FindBy(xpath="//button[@aria-label='Saindo de']")
	WebElement originCityBox;
	
	@FindBy(id="location-field-leg1-origin")
	WebElement originCity;

	@FindBy(xpath="//button[@aria-label='Indo para']")
	WebElement destinationCityBox;
	
	@FindBy(id="location-field-leg1-destination")
	WebElement destinationCity;
	
	@FindBy(id="")
	WebElement departureDate;
	
	@FindBy(id="")
	WebElement returnDate;
	
	public SearchPageFactory2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab() {
		flightTab.click();
	}
	
	public void setOriginCity(String origin) {
		originCityBox.click();
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String destination) {
		destinationCityBox.click();
		destinationCity.sendKeys(destination);
	}

}
