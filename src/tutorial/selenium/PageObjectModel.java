package tutorial.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.classes.SearchPage;

public class PageObjectModel {
	private WebDriver driver;
	private String baseURL;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.expedia.com.br/";

		//Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		SearchPage.navigateToFlightsTab(driver);
		//SearchPage.originTextBox(driver).sendKeys("New York");
		SearchPage.fillOriginTextBox(driver, "New York");
		Thread.sleep(1000);
		SearchPage.chooseAeroportOrigin(driver, "Nova York (NYC - Todos os aeroportos)");
		Thread.sleep(2000);
		SearchPage.destinationTextBox(driver).sendKeys("Chicago");
		Thread.sleep(1000);
		SearchPage.chooseAeroportDestination(driver, "Chicago (ORD - Aeroporto Internacional de O'Hare)");
		SearchPage.chooseDepartureDate(driver, "28" , "junho");
		SearchPage.chooseReturnDate(driver, "5", "julho");
		SearchPage.clickOnSearchButton(driver);
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}



}
