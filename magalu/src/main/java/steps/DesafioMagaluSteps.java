package steps;

import pages.DesafioMagaluPage;
import core.DriverFactory;
import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DesafioMagaluSteps {
		
	private DesafioMagaluPage page;
	
	public DesafioMagaluSteps (WebDriver driver) {
		page = new DesafioMagaluPage(driver);
	}
	
	@Step("Dado que eu pesquise um produto no campo e clique em buscar.")
	public DesafioMagaluSteps searchProduct(String text) throws InterruptedException{
		Thread.sleep(5000);
		DriverFactory.getDriver().findElement(By.cssSelector(page.searchInput)).click();
		DriverFactory.getDriver().findElement(By.cssSelector(page.searchInput)).sendKeys(text);
		DriverFactory.getDriver().findElement(By.cssSelector(page.searchButton)).click();
		return this;
	}
	
	@Step("E eu verifique o número de registros retornados.")
	public void verifyProduct()  throws InterruptedException{
		Thread.sleep(5000);
		String results = DriverFactory.getDriver().findElement(By.cssSelector(page.result)).getText();
		System.out.println("Número de registros retornados: " + DriverFactory.getDriver().findElement(By.cssSelector(page.result)).getText());
		Assert.assertEquals("1", results);
	}
	
	@Step("E eu seleciono o produto desejado.")
	public void selectProduct() throws InterruptedException{
		DriverFactory.getDriver().findElement(By.cssSelector(page.product)).click();
		Thread.sleep(5000);
		DriverFactory.getDriver().findElement(By.cssSelector(page.addToCart)).click();
	}
	
	@Step("Quando adiciono o produto na sacola.")
	public void addToCart() throws InterruptedException{
		DriverFactory.getDriver().findElement(By.cssSelector(page.addToCart)).click();
		Thread.sleep(5000);
	}
	
	@Step("Então o produto deve estar na sacola.")
	public void verifyCart() throws InterruptedException{
		String idProduct = DriverFactory.getDriver().findElement(By.cssSelector(page.idProductOnCart)).getText();
		System.out.println(DriverFactory.getDriver().findElement(By.cssSelector(page.idProductOnCart)).getText());
		Thread.sleep(5000);
		Assert.assertEquals("Código do produto: 222769300", idProduct);
	}	
}