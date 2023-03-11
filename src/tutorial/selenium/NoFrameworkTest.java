package tutorial.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import page.classes.SearchPage;

public class NoFrameworkTest {
	private WebDriver driver;
	private String baseURL;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com.br/";

		//Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);

	}

	@Test
	public void test() {
		driver.findElement(By.id("header-history")).click();
		driver.findElement(By.id("tab-flight-tab")).click();
		driver.findElement(By.id("flight-origin")).sendKeys("New York");
		driver.findElement(By.id("flight-destination")).sendKeys("Chicago");
		driver.findElement(By.id("flight-departing")).sendKeys("10/08/2021");
		driver.findElement(By.id("flight-returning")).sendKeys("10/08/2021");
		driver.findElement(By.id("serach-button")).click();
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
