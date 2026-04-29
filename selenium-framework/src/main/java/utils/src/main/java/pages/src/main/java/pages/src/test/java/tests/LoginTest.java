package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.ProductsPage;
import utils.DriverManager;

public class LoginTest {

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private final String URL = "https://www.saucedemo.com";

    @BeforeMethod
    public void setUp() {
        loginPage    = new LoginPage(DriverManager.getDriver());
        productsPage = new ProductsPage(DriverManager.getDriver());
        loginPage.navigateTo(URL);
    }

    @Test(description = "Valid login should navigate to products page")
    public void testValidLogin() {
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsPageDisplayed(),
            "Products page should be displayed after valid login");
        Assert.assertEquals(productsPage.getPageTitle(), "Products");
    }

    @Test(description = "Invalid login should show error message")
    public void testInvalidLogin() {
        loginPage.login("invalid_user", "wrong_password");
        Assert.assertTrue(loginPage.isErrorDisplayed(),
            "Error message should be displayed for invalid credentials");
    }

    @Test(description = "Add product to cart after login")
    public void testAddToCart() {
        loginPage.login("standard_user", "secret_sauce");
        productsPage.addFirstProductToCart();
        Assert.assertEquals(productsPage.getCartCount(), "1",
            "Cart should show 1 item after adding product");
    }

    @Test(description = "Empty username should show error")
    public void testEmptyUsername() {
        loginPage.login("", "secret_sauce");
        Assert.assertTrue(loginPage.isErrorDisplayed(),
            "Error should appear for empty username");
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
