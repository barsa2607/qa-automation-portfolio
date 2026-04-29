package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

    private WebDriver driver;

    private By pageTitle    = By.cssSelector(".title");
    private By addToCart    = By.cssSelector("[data-test='add-to-cart-sauce-labs-backpack']");
    private By cartIcon     = By.cssSelector(".shopping_cart_link");
    private By cartBadge    = By.cssSelector(".shopping_cart_badge");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public boolean isProductsPageDisplayed() {
        return driver.getCurrentUrl().contains("inventory");
    }

    public void addFirstProductToCart() {
        driver.findElement(addToCart).click();
    }

    public String getCartCount() {
        return driver.findElement(cartBadge).getText();
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }
}
