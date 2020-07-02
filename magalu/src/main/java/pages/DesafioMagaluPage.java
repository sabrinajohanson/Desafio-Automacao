package pages;

import org.openqa.selenium.WebDriver;

public class DesafioMagaluPage {

	public String addToCart = "button.button__buy.button__buy-product-detail.js-add-cart-button.js-main-add-cart-button.js-add-box-prime";
	public String product = "div.nm-product-img-link";
	public String idProductOnCart = "p.BasketItemProduct-info-sku";
	public String nameProductOnCart = "p.BasketItemProduct-info-title";
	public String result = "span.nm-total-results";
	public String searchInput = "#inpHeaderSearch";
	public String searchButton = "#btnHeaderSearch";
	
	public DesafioMagaluPage(WebDriver driver) {
		super();
	}
}