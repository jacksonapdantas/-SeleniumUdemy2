package tutorial.selenium;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPageFactory2;

public class FrameworkTestCase {
	private WebDriver driver;
	private String baseURL;
	SearchPageFactory2 searchPage;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com.br/";
		
		searchPage = new SearchPageFactory2(driver);

		//Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);

	}

	@Test
	public void test() {
		searchPage.clickFlightsTab();
		searchPage.setOriginCity("NewYork");
		searchPage.setDestinationCity("Chicago");
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
