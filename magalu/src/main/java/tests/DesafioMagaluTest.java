package tests;

import core.DriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import steps.DesafioMagaluSteps;

public class DesafioMagaluTest {
	
	protected static WebDriver driver;
	private static final String PRODUCT = "222769300";
	private static final String URL = "https://www.magazineluiza.com.br/";
	
	private static DesafioMagaluSteps steps;
	
	@Before
	public void beforeAllClass() {
		steps = new DesafioMagaluSteps(driver);
		DriverFactory.getDriver().navigate().to(URL);
		}
	
	@Test
	public void searchAProduct () throws InterruptedException {
		steps.searchProduct(PRODUCT);
		steps.verifyProduct();
		steps.selectProduct();
		steps.addToCart();
		steps.verifyCart();				
	}
}