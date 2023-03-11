package page.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageFactory {
	@FindBy(xpath ="//*[@id=\"uitk-tabs-button-container\"]/li[2]/a")
	WebElement flightsTab;
	
	@FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[1]/a/span")
	WebElement roundTrip;
	
	@FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[2]/a/span")
	WebElement oneWay;
	
	@FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[3]/a/span")
	WebElement multipleDestination;
	
	public void clickFlightTab() {
		flightsTab.click();
	}
	
	public void clickRoundTrip() {
		roundTrip.click();
	}
	
	public void clickMultipleDestination() {
		multipleDestination.click();
	}
}
